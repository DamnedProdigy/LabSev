/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author tuk35668
 */
public class TicTacToe 
{
    private char[][] gb;
    private char currentPlayer;
    
    public boolean CreateBoard() 
    {
        System.out.println("-------------");

        for (int a = 0; a < 3; a++)
        {
            System.out.print("| ");
            for (int b = 0; b < 3; b++)
            {
                System.out.print(gb[a][b] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
        
        return true;
    }

    public boolean CurrentPlayer()
    {
        return true;
    }

    public boolean ChangePlayer() 
    {
        if (currentPlayer == 'X') 
        {
            currentPlayer = 'O';
        }
        else
        {
            currentPlayer = 'X';
        }
        
        return true;
    }
    
    public boolean MakeMove(int row, int col)
    {

        if ((row >= 0) && (row < 3))
        {
            if ((col >= 0) && (col < 3))
            {
                if (gb[row][col] == '-')
                {
                    gb[row][col] = currentPlayer;
                    return true;
                }
            }
        }

        return false;
    }
    
    public boolean SpaceInUse() 
    {
        boolean isFull = true;

        for (int a = 0; a < 3; a++)
        {
            for (int b = 0; b < 3; b++)
            {
                if (gb[a][b] == '-')
                {
                    isFull = false;
                }
            }
        }

        return isFull;
    }
}    
    

