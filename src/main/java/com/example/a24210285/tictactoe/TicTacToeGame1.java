package com.example.a24210285.tictactoe;

/**
 * Created by Ahmed on 2/17/2018.
 */




import android.content.Context;
import android.text.Layout;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import java.lang.Object;

import static android.os.SystemClock.sleep;
import static android.view.View.*;

public class TicTacToeGame1 implements android.view.View.OnClickListener {

    // Characters used to represent the human, computer, and open spots
    public static final char HUMAN_PLAYER = 'X';
    public static final char COMPUTER_PLAYER = 'O';
    public static final char OPEN_SPOT = ' ';
    public char player;

    public Button mBoardButtons[] = new Button[9];
    Button button0 = mBoardButtons[0];
    Button button1 = mBoardButtons[1];
    Button button2 = mBoardButtons[2];
    Button button3 = mBoardButtons[3];
    Button button4 = mBoardButtons[4];
    Button button5 = mBoardButtons[5];
    Button button6 = mBoardButtons[6];
    Button button7 = mBoardButtons[7];
    Button button8 = mBoardButtons[8];

    public TicTacToeGame1() {
        // Seed the random number generator
        Random mRand = new Random();
    }

    /** Clear the board of all X's and O's by setting all spots to OPEN_SPOT. */
    public void clearBoard(){

        Button button1 = mBoardButtons[0];
        Button button2 = mBoardButtons[1];
        Button button3 = mBoardButtons[2];
        Button button4 = mBoardButtons[3];
        Button button5 = mBoardButtons[4];
        Button button6 = mBoardButtons[5];
        Button button7 = mBoardButtons[6];
        Button button8 = mBoardButtons[7];
        Button button9 = mBoardButtons[8];

        button1.setText(String.valueOf(OPEN_SPOT));
        button2.setText(String.valueOf(OPEN_SPOT));
        button3.setText(String.valueOf(OPEN_SPOT));
        button4.setText(String.valueOf(OPEN_SPOT));
        button5.setText(String.valueOf(OPEN_SPOT));
        button6.setText(String.valueOf(OPEN_SPOT));
        button7.setText(String.valueOf(OPEN_SPOT));
        button8.setText(String.valueOf(OPEN_SPOT));
        button9.setText(String.valueOf(OPEN_SPOT));


    }

    /** Set the given player at the given location on the game board.
     * The location must be available, or the board will not be changed.
     *
     * @param player - The HUMAN_PLAYER or COMPUTER_PLAYER
     * //@param location - The location (0-8) to place the move
     */
    public void setMove(final char player, int location){
       // player = HUMAN_PLAYER;

            Button button1 = mBoardButtons[0];
            Button button2 = mBoardButtons[1];
            Button button3 = mBoardButtons[2];
            Button button4 = mBoardButtons[3];
            Button button5 = mBoardButtons[4];
            Button button6 = mBoardButtons[5];
            Button button7 = mBoardButtons[6];
            Button button8 = mBoardButtons[7];
            Button button9 = mBoardButtons[8];

            //on click listener
            //see soduku1.java

            button1.setOnClickListener(this);
            button2.setOnClickListener(this);
            button3.setOnClickListener(this);
            button4.setOnClickListener(this);
            button5.setOnClickListener(this);
            button6.setOnClickListener(this);
            button7.setOnClickListener(this);
            button8.setOnClickListener(this);
            button9.setOnClickListener(this);

    }

    public void onClick(View v) {

        Button button1 = mBoardButtons[0];
        Button button2 = mBoardButtons[1];
        Button button3 = mBoardButtons[2];
        Button button4 = mBoardButtons[3];
        Button button5 = mBoardButtons[4];
        Button button6 = mBoardButtons[5];
        Button button7 = mBoardButtons[6];
        Button button8 = mBoardButtons[7];
        Button button9 = mBoardButtons[8];

        switch (v.getId()) {
            case R.id.one: if(button1.getText().equals(OPEN_SPOT)){
                button1.setText(HUMAN_PLAYER);
            }
                break;
            case R.id.two: if(button2.getText().equals(OPEN_SPOT)){
                button2.setText(HUMAN_PLAYER);
            }
                break;
            case R.id.three: if(button3.getText().equals(OPEN_SPOT)){
                button3.setText(HUMAN_PLAYER);
            }
                break;
            case R.id.four: if(button4.getText().equals(OPEN_SPOT)){
                button4.setText(HUMAN_PLAYER);
            }
                break;
            case R.id.five: if(button5.getText().equals(OPEN_SPOT)){
                button5.setText(HUMAN_PLAYER);
            }
                break;
            case R.id.six: if(button6.getText().equals(OPEN_SPOT)){
                button6.setText(HUMAN_PLAYER);
            }
                break;
            case R.id.seven: if(button7.getText().equals(OPEN_SPOT)){
                button7.setText(HUMAN_PLAYER);
            }
                break;
            case R.id.eight: if(button8.getText().equals(OPEN_SPOT)){
                button8.setText(HUMAN_PLAYER);
            }
                break;
            case R.id.nine: if(button9.getText().equals(OPEN_SPOT)){
                button9.setText(HUMAN_PLAYER);
            }
                break;
        }
    }

    /** Return the best move for the computer to make. You must call setMove()
     * to actually make the computer move to that location.
     * @return The best move for the computer to make (0-8).
     */
    public int getComputerMove(){
        Button button1 = mBoardButtons[0];
        Button button2 = mBoardButtons[1];
        Button button3 = mBoardButtons[2];
        Button button4 = mBoardButtons[3];
        Button button5 = mBoardButtons[4];
        Button button6 = mBoardButtons[5];
        Button button7 = mBoardButtons[6];
        Button button8 = mBoardButtons[7];
        Button button9 = mBoardButtons[8];

        ArrayList<Integer>  availableButtons = new ArrayList<Integer>();


        if(button1.getText().equals(""+OPEN_SPOT)){
            availableButtons.add(0);
        }
        if(button2.getText().equals(""+OPEN_SPOT)){
            availableButtons.add(1);
        }
        if(button3.getText().equals(""+OPEN_SPOT)){
            availableButtons.add(2);
        }
        if(button4.getText().equals(""+OPEN_SPOT)){
            availableButtons.add(3);
        }
        if(button5.getText().equals(""+OPEN_SPOT)){
            availableButtons.add(4);
        }
        if(button6.getText().equals(""+OPEN_SPOT)){
            availableButtons.add(5);
        }
        if(button7.getText().equals(""+OPEN_SPOT)){
            availableButtons.add(6);
        }
        if(button8.getText().equals(""+OPEN_SPOT)){
            availableButtons.add(7);
        }
        if(button9.getText().equals(""+OPEN_SPOT)){
            availableButtons.add(8);
        }

        Random r = new Random();
        int random = r.nextInt(availableButtons.size());
        int buttonSelectedByComputer = availableButtons.get(r.nextInt(availableButtons.size()));
        return buttonSelectedByComputer;
    }

    /**
     * Check for a winner and return a status value indicating who has won.
     * @return Return 0 if no winner or tie yet, 1 if it's a tie, 2 if X won,
     * or 3 if O won.
     */
    public int checkForWinner(){

            int winner = 4;
            Boolean humanWin = false;
            Boolean computerWin = false;
            Button button1 = mBoardButtons[0];
            Button button2 = mBoardButtons[1];
            Button button3 = mBoardButtons[2];
            Button button4 = mBoardButtons[3];
            Button button5 = mBoardButtons[4];
            Button button6 = mBoardButtons[5];
            Button button7 = mBoardButtons[6];
            Button button8 = mBoardButtons[7];
            Button button9 = mBoardButtons[8];

            //O player Computer win 3
            if(button1.getText().equals(String.valueOf(COMPUTER_PLAYER)) && button2.getText().equals(String.valueOf(COMPUTER_PLAYER))
                    && button3.getText().equals(String.valueOf(COMPUTER_PLAYER))){
                //winner = 3;
                computerWin = true;
            }else if(button1.getText().equals(String.valueOf(COMPUTER_PLAYER)) && button4.getText().equals(String.valueOf(COMPUTER_PLAYER))
                    && button7.getText().equals(String.valueOf(COMPUTER_PLAYER))){
                //winner = 3;
                computerWin = true;
            }else if(button2.getText().equals(String.valueOf(COMPUTER_PLAYER)) && button5.getText().equals(String.valueOf(COMPUTER_PLAYER))
                    && button8.getText().equals(String.valueOf(COMPUTER_PLAYER))){
                //winner = 3;
                computerWin = true;
            }else if(button3.getText().equals(String.valueOf(COMPUTER_PLAYER)) && button6.getText().equals(String.valueOf(COMPUTER_PLAYER))
                    && button9.getText().equals(String.valueOf(COMPUTER_PLAYER))){
                //winner = 3;
                computerWin = true;
            }else if(button4.getText().equals(String.valueOf(COMPUTER_PLAYER)) && button5.getText().equals(String.valueOf(COMPUTER_PLAYER))
                    && button6.getText().equals(String.valueOf(COMPUTER_PLAYER))){
                //winner = 3;
                computerWin = true;
            }else if(button7.getText().equals(String.valueOf(COMPUTER_PLAYER)) && button8.getText().equals(String.valueOf(COMPUTER_PLAYER))
                    && button9.getText().equals(String.valueOf(COMPUTER_PLAYER))){
                //winner = 3;
                computerWin = true;
            }else if(button1.getText().equals(String.valueOf(COMPUTER_PLAYER)) && button5.getText().equals(String.valueOf(COMPUTER_PLAYER))
                    && button9.getText().equals(String.valueOf(COMPUTER_PLAYER))){
                //winner = 3;
                computerWin = true;
            }else if(button3.getText().equals(String.valueOf(COMPUTER_PLAYER)) && button5.getText().equals(String.valueOf(COMPUTER_PLAYER))
                    && button7.getText().equals(String.valueOf(COMPUTER_PLAYER))){
                //winner = 3;
                computerWin = true;

                //X player human win 2
            } if(button1.getText().equals(String.valueOf(HUMAN_PLAYER)) && button2.getText().equals(String.valueOf(HUMAN_PLAYER))
                    && button3.getText().equals(String.valueOf(HUMAN_PLAYER))){
                // winner = 2;
                humanWin = true;
            }else if(button1.getText().equals(String.valueOf(HUMAN_PLAYER)) && button4.getText().equals(String.valueOf(HUMAN_PLAYER))
                    && button7.getText().equals(String.valueOf(HUMAN_PLAYER))){
                //winner = 3;
                humanWin = true;
            }else if(button2.getText().equals(String.valueOf(HUMAN_PLAYER)) && button5.getText().equals(String.valueOf(HUMAN_PLAYER))
                    && button8.getText().equals(String.valueOf(HUMAN_PLAYER))){
                //winner = 3;
                humanWin = true;
            }else if(button3.getText().equals(String.valueOf(HUMAN_PLAYER)) && button6.getText().equals(String.valueOf(HUMAN_PLAYER))
                    && button9.getText().equals(String.valueOf(HUMAN_PLAYER))){
                //winner = 3;
                humanWin = true;
            }else if(button4.getText().equals(String.valueOf(HUMAN_PLAYER)) && button5.getText().equals(String.valueOf(HUMAN_PLAYER))
                    && button6.getText().equals(String.valueOf(HUMAN_PLAYER))){
                //winner = 3;
                humanWin = true;
            }else if(button7.getText().equals(String.valueOf(HUMAN_PLAYER)) && button8.getText().equals(String.valueOf(HUMAN_PLAYER))
                    && button9.getText().equals(String.valueOf(HUMAN_PLAYER))){
                //winner = 3;
                humanWin = true;
            }else if(button1.getText().equals(String.valueOf(HUMAN_PLAYER)) && button5.getText().equals(String.valueOf(HUMAN_PLAYER))
                    && button9.getText().equals(String.valueOf(HUMAN_PLAYER))){
                //winner = 3;
                humanWin = true;
            }else if(button3.getText().equals(String.valueOf(HUMAN_PLAYER)) && button5.getText().equals(String.valueOf(HUMAN_PLAYER))
                    && button7.getText().equals(String.valueOf(HUMAN_PLAYER))){
                //winner = 3;
                humanWin = true;
                //if it is tie
            }

            if (computerWin && humanWin){
                winner = 1;
            }
            else if(computerWin && !humanWin){
                winner = 3;
            }
            else if (!computerWin && humanWin){
                winner = 2;
            }else{
                winner = 0;
            }


        return winner;
    }

    public boolean allButtonsPlayed(){
        if (numOfButtonsPlayed()>=9){
            return true;
        }else{
            return false;
        }
    }
    public int numOfButtonsPlayed(){
        Button button1 = mBoardButtons[0];
        Button button2 = mBoardButtons[1];
        Button button3 = mBoardButtons[2];
        Button button4 = mBoardButtons[3];
        Button button5 = mBoardButtons[4];
        Button button6 = mBoardButtons[5];
        Button button7 = mBoardButtons[6];
        Button button8 = mBoardButtons[7];
        Button button9 = mBoardButtons[8];
        int numberOfButtonsPlayed = 0;
        for (Button button: mBoardButtons){
            if(!button.getText().equals(String.valueOf(OPEN_SPOT))){
                numberOfButtonsPlayed++;
            }
        }
            return numberOfButtonsPlayed;
    }

    public int fillTheLastByComputer(){
        Button button1 = mBoardButtons[0];
        Button button2 = mBoardButtons[1];
        Button button3 = mBoardButtons[2];
        Button button4 = mBoardButtons[3];
        Button button5 = mBoardButtons[4];
        Button button6 = mBoardButtons[5];
        Button button7 = mBoardButtons[6];
        Button button8 = mBoardButtons[7];
        Button button9 = mBoardButtons[8];
        int numberOfButtonsPlayed = 0;
        int index=0, indexToReturn = 0;
        for (Button button: mBoardButtons){
            index ++;
            if(!button.getText().equals(String.valueOf(OPEN_SPOT))){
                indexToReturn = index;
            }
        }
        return indexToReturn;
    }
    public void enableButtons(){
        for (Button button: mBoardButtons) {
            button.setEnabled(true);
        }
    }
}
