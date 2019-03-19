/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 *
 * @author tuk35668
 */
public class TicTacToeTest {

    /**
     * Test of CreateBoard method, of class TicTacToe.
     */
    @Test
    public void testCreateBoard() {
        TicTacToe game = new TicTacToe();
        assertTrue(game.CreateBoard());
        
    }

    /**
     * Test of CurrentPlayer method, of class TicTacToe.
     */
    @Test
    public void testCurrentPlayer() {
        TicTacToe game = new TicTacToe();
        assertTrue(game.CurrentPlayer());
    }

    /**
     * Test of ChangePlayer method, of class TicTacToe.
     */
    @Test
    public void testChangePlayer() {
        TicTacToe game = new TicTacToe();
        changePlayer = 'X';
        changePlayer = 'O';
        assertTrue(game.ChangePlayer());
    }

    /**
     * Test of MakeMove method, of class TicTacToe.
     */
    @Test
    public void testMakeMove() {
        TicTacToe game = new TicTacToe();
        MakeMove row >= 3;
        MakeMove col >= 3;
        
        assertFalse(game.MakeMove());
    }

    /**
     * Test of SpaceInUse method, of class TicTacToe.
     */
    @Test
    public void testSpaceInUse() {
        TicTacToe game = new TicTacToe();
        assertTrue(game.SpaceInUse());
       
    }
    
}
