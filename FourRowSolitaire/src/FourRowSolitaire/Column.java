/*
    This file is a part of Four Row Solitaire

    Copyright (C) 2010 by Matt Stephen

    Four Row Solitaire is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    Four Row Solitaire is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with FourRowSolitaire.  If not, see <http://www.gnu.org/licenses/>.
 */

package FourRowSolitaire;

import javax.swing.JOptionPane;

/**
 * Class: Column
 *
 * Description: The Column class manages a single column on the board.
 *
 * @author Matt Stephen
 */
public class Column extends CardStack
{
    public Column() {}

    public Card push(Card card)
    {
        if(isEmpty() && card.getNumber() == Card.KING)
        {
            System.out.println("Is empty and card is KING");
            
            super.push(card);
            return card;
        }
        else if(card.getColor() != peek().getColor() && card.getNumber() == peek().getNumber() - 1)
        {
            System.out.println("Is different color and is less than card");
            
            super.push(card);
            return card;
        }

        return null;
    }

    public boolean isValidMove(Card card)
    {
        if(isEmpty() && card.getNumber() == Card.KING)
        {
            return true;
        }
        else if(!isEmpty() && card.getColor() != peek().getColor() && card.getNumber() == (peek().getNumber() - 1))
        {
            return true;
        }
        
        JOptionPane.showMessageDialog(this, "Sorry, you can't do that.");

        return false;
    }

    public boolean isValidMove(CardStack stack)
    {
        return isValidMove(stack.peek());
    }
}