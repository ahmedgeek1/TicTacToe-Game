package com.example.a24210285.tictactoe;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.support.design.widget.Snackbar;


import static com.example.a24210285.tictactoe.TicTacToeGame1.COMPUTER_PLAYER;
import static com.example.a24210285.tictactoe.TicTacToeGame1.HUMAN_PLAYER;
import static com.example.a24210285.tictactoe.TicTacToeGame1.OPEN_SPOT;

public class MainActivity extends Activity implements View.OnClickListener {
    // Represents the internal state of the game
    private TicTacToeGame1 mGame;
    // Buttons making up the board
    private Button mBoardButtons[];

    boolean humanPlay = true;

    //TextView start= (TextView)findViewById(R.id.start);

    // Various text displayed
    private TextView mInfoTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try{
            mGame = new TicTacToeGame1();

            mBoardButtons = mGame.mBoardButtons;

            mGame.mBoardButtons[0] = findViewById(R.id.one);
            mGame.mBoardButtons[1] = findViewById(R.id.two);
            mGame.mBoardButtons[2] = findViewById(R.id.three);
            mGame.mBoardButtons[3] = findViewById(R.id.four);
            mGame.mBoardButtons[4] = findViewById(R.id.five);
            mGame.mBoardButtons[5] = findViewById(R.id.six);
            mGame.mBoardButtons[6] = findViewById(R.id.seven);
            mGame.mBoardButtons[7] = findViewById(R.id.eight);
            mGame.mBoardButtons[8] = findViewById(R.id.nine);

            //mGame.mBoardButtons = mBoardButtons;

        }catch (Exception ex){
            Log.e("Error:  " , ex.getMessage());
        }

        startNewGame();

        /*if(!humanPlay){
            //mInfoTextView.setText(R.string.turn_computer);
            mGame.player = 'O';
            setMove('O', mGame.getComputerMove());
        }*/

        /*if(humanPlay){
            for(int i=0; i<=7; i++){
                mGame.player = 'X';
                for (Button button : mGame.mBoardButtons) {
                    button.setOnClickListener(this);
                }

                //mInfoTextView.setText(R.string.turn_computer);
                mGame.player = 'O';
                setMove('O', mGame.getComputerMove());
                // mInfoTextView.setText(R.string.turn_human);
            }
        }*/

        if(mGame.checkForWinner()==3){
            //mInfoTextView.setText(R.string.result_computer_wins);
        } else if(mGame.checkForWinner()==2){
            //mInfoTextView.setText(R.string.result_human_wins);
        }else if(mGame.checkForWinner()==1){
           // mInfoTextView.setText(R.string.result_tie);
        }



    }
    // Set up the game board.
    private void startNewGame() {
        mGame.clearBoard();
        nextTurn();

        //start.setText(R.string.first_human);
        //mInfoTextView.setText("You go first");

    }

    private void nextTurn(){
       // if(!mGame.allButtonsPlayed()){
            if (mGame.numOfButtonsPlayed()<8){
                for (Button button : mGame.mBoardButtons) {
                    button.setOnClickListener(this);
               }
           }
           else
               if (mGame.numOfButtonsPlayed()==8){
                    setMove('X', mGame.getComputerMove());
                    //check for winner and show message

            }else if(mGame.numOfButtonsPlayed()>8){
                setMove('X', mGame.fillTheLastByComputer());

            }
        //}
    }
    private void setMove(char player, int location) {
        mGame.setMove(player, location);
        mGame.mBoardButtons[location].setEnabled(false);
        mGame.mBoardButtons[location].setText(String.valueOf(player));
        if (player == HUMAN_PLAYER)
            mGame.mBoardButtons[location].setTextColor(Color.rgb(0, 200, 0));
        else
            mGame.mBoardButtons[location].setTextColor(Color.rgb(200, 0, 0));
        if (mGame.numOfButtonsPlayed()>=8){
            CharSequence text;// = "Game over";
            if (mGame.checkForWinner()==3){
                 text = "Computer!";
            }else if (mGame.checkForWinner()==2){
                 text = "Human!";
            }else if (mGame.checkForWinner()==1){
                 text = "Tie!";
            }else if (mGame.checkForWinner()==0){
                 text = "No winner!";
            }else{
                text = "nothing";
            }


            Context context = getApplicationContext();
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        }
    }

    @Override
    public void onClick(View view) {
        Button button1 = mGame.mBoardButtons[0];
        Button button2 = mGame.mBoardButtons[1];
        Button button3 = mGame.mBoardButtons[2];
        Button button4 = mGame.mBoardButtons[3];
        Button button5 = mGame.mBoardButtons[4];
        Button button6 = mGame.mBoardButtons[5];
        Button button7 = mGame.mBoardButtons[6];
        Button button8 = mGame.mBoardButtons[7];
        Button button9 = mGame.mBoardButtons[8];

        switch (view.getId()) {
            case R.id.one: if(button1.getText().equals(""+OPEN_SPOT)){
                button1.setText(""+HUMAN_PLAYER);
                button1.setEnabled(false);
                setMove('O', mGame.getComputerMove());
                mGame.player = COMPUTER_PLAYER;
                nextTurn();
            }
                break;
            case R.id.two: if(button2.getText().equals(""+OPEN_SPOT)){
                button2.setText(""+HUMAN_PLAYER);
                button2.setEnabled(false);
                setMove('O', mGame.getComputerMove());
                mGame.player = COMPUTER_PLAYER;
                nextTurn();
            }
                break;
            case R.id.three: if(button3.getText().equals(""+OPEN_SPOT)){
                button3.setText(""+HUMAN_PLAYER);
                button3.setEnabled(false);
                setMove('O', mGame.getComputerMove());
                mGame.player = COMPUTER_PLAYER;
                nextTurn();
            }
                break;
            case R.id.four: if(button4.getText().equals(""+OPEN_SPOT)){
                button4.setEnabled(false);
                button4.setText(""+HUMAN_PLAYER);
                setMove('O', mGame.getComputerMove());
                mGame.player = COMPUTER_PLAYER;
                nextTurn();
            }
                break;
            case R.id.five: if(button5.getText().equals(""+OPEN_SPOT)){
                button5.setEnabled(false);
                button5.setText(""+HUMAN_PLAYER);
                setMove('O', mGame.getComputerMove());
                mGame.player = COMPUTER_PLAYER;
                nextTurn();
            }
                break;
            case R.id.six: if(button6.getText().equals(""+OPEN_SPOT)){
                button6.setEnabled(false);
                button6.setText(""+HUMAN_PLAYER);
                setMove('O', mGame.getComputerMove());
                mGame.player = COMPUTER_PLAYER;
                nextTurn();
            }
                break;
            case R.id.seven: if(button7.getText().equals(""+OPEN_SPOT)){
                button7.setEnabled(false);
                button7.setText(""+HUMAN_PLAYER);
                setMove('O', mGame.getComputerMove());
                mGame.player = COMPUTER_PLAYER;
                nextTurn();
            }
                break;
            case R.id.eight: if(button8.getText().equals(""+OPEN_SPOT)){
                button8.setEnabled(false);
                button8.setText(""+HUMAN_PLAYER);
                setMove('O', mGame.getComputerMove());
                mGame.player = COMPUTER_PLAYER;
                nextTurn();
            }
                break;
            case R.id.nine: if(button9.getText().equals(""+OPEN_SPOT)){
                button9.setEnabled(false);
                button9.setText(""+HUMAN_PLAYER);
                setMove('O', mGame.getComputerMove());
                mGame.player = COMPUTER_PLAYER;
                nextTurn();
            }
                break;
        }

    }
}
