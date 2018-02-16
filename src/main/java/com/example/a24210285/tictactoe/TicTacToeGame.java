package com.example.a24210285.tictactoe;

import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.Random;

import static android.view.View.*;

/**
 * Created by 24210285 on 2/15/2018.
 */

public class TicTacToeGame implements android.view.View.OnClickListener {

    // Characters used to represent the human, computer, and open spots
    public static final char HUMAN_PLAYER = 'X';
    public static final char COMPUTER_PLAYER = 'O';
    public static final char OPEN_SPOT = ' ';
    public char player;
    public int location;


    public TicTacToeGame() {
        // Seed the random number generator
        Random mRand = new Random();
    }

    /** Clear the board of all X's and O's by setting all spots to OPEN_SPOT. */
    public void clearBoard(){
        Button button1 = null, button2 = null, button3 = null, button4 = null, button5 = null, button6 = null,
                button7 = null, button8=null, button9=null;
        button1 = (Button) button1.findViewById(R.id.one);
        button2 = (Button) button2.findViewById(R.id.two);
        button3 = (Button) button3.findViewById(R.id.three);
        button4 = (Button) button4.findViewById(R.id.four);
        button5 = (Button) button5.findViewById(R.id.five);
        button6 = (Button) button6.findViewById(R.id.six);
        button7 = (Button) button7.findViewById(R.id.seven);
        button8 = (Button) button8.findViewById(R.id.eight);
        button9 = (Button) button9.findViewById(R.id.nine);

        button1.setText(OPEN_SPOT);
        button2.setText(OPEN_SPOT);
        button3.setText(OPEN_SPOT);
        button4.setText(OPEN_SPOT);
        button5.setText(OPEN_SPOT);
        button6.setText(OPEN_SPOT);
        button7.setText(OPEN_SPOT);
        button8.setText(OPEN_SPOT);
        button9.setText(OPEN_SPOT);


    }

    /** Set the given player at the given location on the game board.
     * The location must be available, or the board will not be changed.
     *
     * @param player - The HUMAN_PLAYER or COMPUTER_PLAYER
     * //@param location - The location (0-8) to place the move
     */
    public void setMove(final char player, int location){
        Button button1 = null, button2 = null, button3 = null, button4 = null, button5 = null, button6 = null,
                button7 = null, button8=null, button0=null, button = null;

        /*button0 = (Button) button0.findViewById(R.id.one);
        final Button finalButton0 = button0;
        button0.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                if(finalButton0.getText().equals(OPEN_SPOT)){
                    if(player == HUMAN_PLAYER){
                        finalButton0.setText(HUMAN_PLAYER);
                    }else if(player == COMPUTER_PLAYER){
                        finalButton0.setText(COMPUTER_PLAYER);
                    }
                }
            }
        });

        button1 = (Button) button1.findViewById(R.id.two);
        final Button finalButton1 = button1;
        button1.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                if(finalButton1.getText().equals(OPEN_SPOT)){
                    if(player == HUMAN_PLAYER){
                        finalButton1.setText(HUMAN_PLAYER);
                    }else if(player == COMPUTER_PLAYER){
                        finalButton1.setText(COMPUTER_PLAYER);
                    }
                }
            }
        });

        button2 = (Button) button2.findViewById(R.id.three);
        final Button finalButton2 = button2;
        button1.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                if(finalButton2.getText().equals(OPEN_SPOT)){
                    if(player == HUMAN_PLAYER){
                        finalButton2.setText(HUMAN_PLAYER);
                    }else if(player == COMPUTER_PLAYER){
                        finalButton2.setText(COMPUTER_PLAYER);
                    }
                }
            }
        });

        button3 = (Button) button3.findViewById(R.id.four);
        final Button finalButton3 = button3;
        button1.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                if(finalButton3.getText().equals(OPEN_SPOT)){
                    if(player == HUMAN_PLAYER){
                        finalButton3.setText(HUMAN_PLAYER);
                    }else if(player == COMPUTER_PLAYER){
                        finalButton3.setText(COMPUTER_PLAYER);
                    }
                }
            }
        });

        button4 = (Button) button4.findViewById(R.id.five);
        final Button finalButton4 = button4;
        button1.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                if(finalButton4.getText().equals(OPEN_SPOT)){
                    if(player == HUMAN_PLAYER){
                        finalButton4.setText(HUMAN_PLAYER);
                    }else if(player == COMPUTER_PLAYER){
                        finalButton4.setText(COMPUTER_PLAYER);
                    }
                }
            }
        });

        button5 = (Button) button5.findViewById(R.id.six);
        final Button finalButton5 = button5;
        button1.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                if(finalButton5.getText().equals(OPEN_SPOT)){
                    if(player == HUMAN_PLAYER){
                        finalButton5.setText(HUMAN_PLAYER);
                    }else if(player == COMPUTER_PLAYER){
                        finalButton5.setText(COMPUTER_PLAYER);
                    }
                }
            }
        });

        button6 = (Button) button6.findViewById(R.id.seven);
        final Button finalButton6 = button6;
        button1.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                if(finalButton6.getText().equals(OPEN_SPOT)){
                    if(player == HUMAN_PLAYER){
                        finalButton6.setText(HUMAN_PLAYER);
                    }else if(player == COMPUTER_PLAYER){
                        finalButton6.setText(COMPUTER_PLAYER);
                    }
                }
            }
        });

        button7 = (Button) button7.findViewById(R.id.eight);
        final Button finalButton7 = button7;
        button1.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                if(finalButton7.getText().equals(OPEN_SPOT)){
                    if(player == HUMAN_PLAYER){
                        finalButton7.setText(HUMAN_PLAYER);
                    }else if(player == COMPUTER_PLAYER){
                        finalButton7.setText(COMPUTER_PLAYER);
                    }
                }
            }
        });*/

//        button8 = (Button) button8.findViewById(R.id.nine);
//        final Button finalButton8 = button1;
//        button8.setOnClickListener(new OnClickListener() {
//            public void onClick(View v) {
//                // Do something in response to button click
//                if(finalButton8.getText().equals(OPEN_SPOT)){
//                    if(player == HUMAN_PLAYER){
//                        finalButton8.setText(HUMAN_PLAYER);
//                    }else if(player == COMPUTER_PLAYER){
//                        finalButton8.setText(COMPUTER_PLAYER);
//                    }
//                }
//            }
//        });

        //on click listener
        //see soduku1.java
        button0 = (Button) button0.findViewById(R.id.one);
        button0.setOnClickListener(this);
        button1 = (Button) button1.findViewById(R.id.two);
        button1.setOnClickListener(this);
        button2 = (Button) button2.findViewById(R.id.three);
        button2.setOnClickListener(this);
        button3 = (Button) button3.findViewById(R.id.four);
        button3.setOnClickListener(this);
        button4 = (Button) button4.findViewById(R.id.five);
        button4.setOnClickListener(this);
        button5 = (Button) button5.findViewById(R.id.six);
        button5.setOnClickListener(this);
        button6 = (Button) button6.findViewById(R.id.seven);
        button6.setOnClickListener(this);
        button7 = (Button) button7.findViewById(R.id.eight);
        button7.setOnClickListener(this);
        button8 = (Button) button8.findViewById(R.id.nine);
        button8.setOnClickListener(this);

    }

    public void onClick(View v) {
        Button button1 = null, button2 = null, button3 = null, button4 = null, button5 = null, button6 = null,
                button7 = null, button8=null, button9=null;
        button1 = (Button) button1.findViewById(R.id.one);
        button2 = (Button) button2.findViewById(R.id.two);
        button3 = (Button) button3.findViewById(R.id.three);
        button4 = (Button) button4.findViewById(R.id.four);
        button5 = (Button) button5.findViewById(R.id.five);
        button6 = (Button) button6.findViewById(R.id.six);
        button7 = (Button) button7.findViewById(R.id.seven);
        button8 = (Button) button8.findViewById(R.id.eight);
        button9 = (Button) button9.findViewById(R.id.nine);

        switch (v.getId()) {
            case R.id.one: if(button1.getText().equals(OPEN_SPOT)){
                                // Do something in response to button click
                location = 0;
                if(button1.getText().equals(OPEN_SPOT)){
                    if(player == HUMAN_PLAYER){
                        button1.setText(HUMAN_PLAYER);
                    }else if(player == COMPUTER_PLAYER){
                        button1.setText(COMPUTER_PLAYER);
                    }
               // button1.setText(HUMAN_PLAYER);
                }
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
        Button button1 = null, button2 = null, button3 = null, button4 = null, button5 = null, button6 = null,
                button7 = null, button8=null, button9=null;
        button1 = (Button) button1.findViewById(R.id.one);
        button2 = (Button) button2.findViewById(R.id.two);
        button3 = (Button) button3.findViewById(R.id.three);
        button4 = (Button) button4.findViewById(R.id.four);
        button5 = (Button) button5.findViewById(R.id.five);
        button6 = (Button) button6.findViewById(R.id.six);
        button7 = (Button) button7.findViewById(R.id.seven);
        button8 = (Button) button8.findViewById(R.id.eight);
        button9 = (Button) button9.findViewById(R.id.nine);


        ArrayList<Integer>  availableButtons = new ArrayList<Integer>();


        if(!button1.getText().equals(OPEN_SPOT)){
            availableButtons.add(1);
        }else if(!button2.getText().equals(OPEN_SPOT)){
            availableButtons.add(2);
        }else if(!button3.getText().equals(OPEN_SPOT)){
            availableButtons.add(3);
        }else if(!button4.getText().equals(OPEN_SPOT)){
            availableButtons.add(4);
        }else if(!button6.getText().equals(OPEN_SPOT)){
            availableButtons.add(5);
        }else if(!button6.getText().equals(OPEN_SPOT)){
            availableButtons.add(6);
        }else if(!button7.getText().equals(OPEN_SPOT)){
            availableButtons.add(7);
        }else if(!button8.getText().equals(OPEN_SPOT)){
            availableButtons.add(8);
        }else if(!button9.getText().equals(OPEN_SPOT)){
            availableButtons.add(9);
        }

        Random r = new Random();
        int buttonSelectedByComputer = availableButtons.get(r.nextInt(availableButtons.size()));
        return buttonSelectedByComputer;
    }

    /**
     * Check for a winner and return a status value indicating who has won.
     * @return Return 0 if no winner or tie yet, 1 if it's a tie, 2 if X won,
     * or 3 if O won.
     */
    public int checkForWinner(){
        int winner;
        Boolean humanWin = false;
        Boolean computerWin = false;
        Button button1 = null, button2 = null, button3 = null, button4 = null, button5 = null, button6 = null,
                button7 = null, button8=null, button9=null;
        button1 = (Button) button1.findViewById(R.id.one);
        button2 = (Button) button2.findViewById(R.id.two);
        button3 = (Button) button3.findViewById(R.id.three);
        button4 = (Button) button4.findViewById(R.id.four);
        button5 = (Button) button5.findViewById(R.id.five);
        button6 = (Button) button6.findViewById(R.id.six);
        button7 = (Button) button7.findViewById(R.id.seven);
        button8 = (Button) button8.findViewById(R.id.eight);
        button9 = (Button) button9.findViewById(R.id.nine);


        //O player Computer win 3
        if(button1.getText().equals(COMPUTER_PLAYER) && button2.getText().equals(COMPUTER_PLAYER)
                && button3.getText().equals(COMPUTER_PLAYER)){
            //winner = 3;
            computerWin = true;
        }else if(button1.getText().equals(COMPUTER_PLAYER) && button4.getText().equals(COMPUTER_PLAYER)
                && button7.getText().equals(COMPUTER_PLAYER)){
            //winner = 3;
            computerWin = true;
        }else if(button2.getText().equals(COMPUTER_PLAYER) && button5.getText().equals(COMPUTER_PLAYER)
                && button8.getText().equals(COMPUTER_PLAYER)){
            //winner = 3;
            computerWin = true;
        }else if(button3.getText().equals(COMPUTER_PLAYER) && button6.getText().equals(COMPUTER_PLAYER)
                && button9.getText().equals(COMPUTER_PLAYER)){
            //winner = 3;
            computerWin = true;
        }else if(button4.getText().equals(COMPUTER_PLAYER) && button5.getText().equals(COMPUTER_PLAYER)
                && button6.getText().equals(COMPUTER_PLAYER)){
            //winner = 3;
            computerWin = true;
        }else if(button7.getText().equals(COMPUTER_PLAYER) && button8.getText().equals(COMPUTER_PLAYER)
                && button9.getText().equals(COMPUTER_PLAYER)){
            //winner = 3;
            computerWin = true;
        }else if(button1.getText().equals(COMPUTER_PLAYER) && button5.getText().equals(COMPUTER_PLAYER)
                && button9.getText().equals(COMPUTER_PLAYER)){
            //winner = 3;
            computerWin = true;
        }else if(button3.getText().equals(COMPUTER_PLAYER) && button5.getText().equals(COMPUTER_PLAYER)
                && button7.getText().equals(COMPUTER_PLAYER)){
            //winner = 3;
            computerWin = true;

            //X player human win 2
        }else if(button1.getText().equals(HUMAN_PLAYER) && button2.getText().equals(HUMAN_PLAYER)
                && button3.getText().equals(HUMAN_PLAYER)){
            // winner = 2;
            humanWin = true;
        }else if(button1.getText().equals(HUMAN_PLAYER) && button4.getText().equals(HUMAN_PLAYER)
                && button7.getText().equals(HUMAN_PLAYER)){
            //winner = 3;
            humanWin = true;
        }else if(button2.getText().equals(HUMAN_PLAYER) && button5.getText().equals(HUMAN_PLAYER)
                && button8.getText().equals(HUMAN_PLAYER)){
            //winner = 3;
            humanWin = true;
        }else if(button3.getText().equals(HUMAN_PLAYER) && button6.getText().equals(HUMAN_PLAYER)
                && button9.getText().equals(HUMAN_PLAYER)){
            //winner = 3;
            humanWin = true;
        }else if(button4.getText().equals(HUMAN_PLAYER) && button5.getText().equals(HUMAN_PLAYER)
                && button6.getText().equals(HUMAN_PLAYER)){
            //winner = 3;
            humanWin = true;
        }else if(button7.getText().equals(HUMAN_PLAYER) && button8.getText().equals(HUMAN_PLAYER)
                && button9.getText().equals(HUMAN_PLAYER)){
            //winner = 3;
            humanWin = true;
        }else if(button1.getText().equals(HUMAN_PLAYER) && button5.getText().equals(HUMAN_PLAYER)
                && button9.getText().equals(HUMAN_PLAYER)){
            //winner = 3;
            humanWin = true;
        }else if(button3.getText().equals(HUMAN_PLAYER) && button5.getText().equals(HUMAN_PLAYER)
                && button7.getText().equals(HUMAN_PLAYER)){
            //winner = 3;
            humanWin = true;
            //if it is tie
        }

        if(computerWin){
            winner = 3;
        }else if(humanWin){
            winner = 2;
        }else if(computerWin && humanWin)
            //tie
            winner = 1;
        else{
            winner = 0;
        }

        return winner;
    }




}
