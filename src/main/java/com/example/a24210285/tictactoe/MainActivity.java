package com.example.a24210285.tictactoe;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static com.example.a24210285.tictactoe.TicTacToeGame.COMPUTER_PLAYER;
import static com.example.a24210285.tictactoe.TicTacToeGame.HUMAN_PLAYER;
import static com.example.a24210285.tictactoe.TicTacToeGame.OPEN_SPOT;

public class MainActivity extends Activity implements View.OnClickListener {
    // Represents the internal state of the game
    private TicTacToeGame mGame;
    // Buttons making up the board
    private Button mBoardButtons[];

    // Various text displayed
    private TextView mInfoTextView;

    boolean mGameOver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mGame = new TicTacToeGame();

        mBoardButtons = new Button[8];

        mBoardButtons[0] = findViewById(R.id.one);
        mBoardButtons[1] = findViewById(R.id.two);
        mBoardButtons[2] = findViewById(R.id.three);
        mBoardButtons[3] = findViewById(R.id.four);
        mBoardButtons[4] = findViewById(R.id.five);
        mBoardButtons[5] = findViewById(R.id.six);
        mBoardButtons[6] = findViewById(R.id.seven);
        mBoardButtons[7] = findViewById(R.id.eight);
        mBoardButtons[8] = findViewById(R.id.nine);

        startNewGame();

        for(int i=0; i<=7; i++){
            mInfoTextView.setText(R.string.turn_computer);
            mGame.player = 'O';
            mGame.setMove('O', mGame.getComputerMove());
            mInfoTextView.setText(R.string.turn_human);
            mGame.player = 'X';
            for (Button button : mBoardButtons) {
                button.setOnClickListener(this);
            }
        }


        if(mGame.checkForWinner()==3){
            mGameOver = true;
            mInfoTextView.setText(R.string.result_computer_wins);
        } else if(mGame.checkForWinner()==2){
            mGameOver = true;
            mInfoTextView.setText(R.string.result_human_wins);
        }else if(mGame.checkForWinner()==1){
            mGameOver = true;
            mInfoTextView.setText(R.string.result_tie);
        }

        if(mGameOver){
            for (Button button : mBoardButtons) {
                button.setEnabled(false);
            }

        }


    }
    // Set up the game board.
    private void startNewGame() {
        mGameOver = false;
        mGame.clearBoard();

        mInfoTextView.setText(R.string.first_human);

        for (Button button : mBoardButtons) {
            button.setText(OPEN_SPOT);
            button.setEnabled(true);
            button.setOnClickListener(this);
        }

    }

    private void setMove(char player, int location) {
        mGame.setMove(player, location);
        mBoardButtons[location].setEnabled(false);
        mBoardButtons[location].setText(String.valueOf(player));
        if (player == HUMAN_PLAYER)
            mBoardButtons[location].setTextColor(Color.rgb(0, 200, 0));
        else
            mBoardButtons[location].setTextColor(Color.rgb(200, 0, 0));
    }

    @Override
    public void onClick(View view) {
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

        switch (view.getId()) {
            case R.id.one: if(button1.getText().equals(OPEN_SPOT)){
                if(mGame.player == HUMAN_PLAYER){
                    button1.setText(HUMAN_PLAYER);
                    setMove('X', 0);
                    button1.setEnabled(false);
                }else if(mGame.player == COMPUTER_PLAYER){
                    button1.setText(COMPUTER_PLAYER);
                    setMove('O', 0);
                    button1.setEnabled(false);
                }
            }
                break;
            case R.id.two: if(button2.getText().equals(OPEN_SPOT)){
                if(mGame.player == HUMAN_PLAYER){
                    button2.setText(HUMAN_PLAYER);
                    setMove('X', 1);
                    button2.setEnabled(false);
                }else if(mGame.player == COMPUTER_PLAYER){
                    button2.setText(COMPUTER_PLAYER);
                    setMove('O', 1);
                    button2.setEnabled(false);
                }
            }
                break;
            case R.id.three: if(button3.getText().equals(OPEN_SPOT)){
                if(mGame.player == HUMAN_PLAYER){
                    button3.setText(HUMAN_PLAYER);
                    setMove('X', 2);
                    button3.setEnabled(false);
                }else if(mGame.player == COMPUTER_PLAYER){
                    button3.setText(COMPUTER_PLAYER);
                    setMove('O', 2);
                    button3.setEnabled(false);
                }
            }
                break;
            case R.id.four: if(button4.getText().equals(OPEN_SPOT)){
                if(mGame.player == HUMAN_PLAYER){
                    button4.setText(HUMAN_PLAYER);
                    setMove('X', 3);
                    button4.setEnabled(false);
                }else if(mGame.player == COMPUTER_PLAYER){
                    button4.setText(COMPUTER_PLAYER);
                    setMove('O', 3);
                    button4.setEnabled(false);
                }
            }
                break;
            case R.id.five: if(button5.getText().equals(OPEN_SPOT)){
                if(mGame.player == HUMAN_PLAYER){
                    button5.setText(HUMAN_PLAYER);
                    setMove('X', 4);
                    button5.setEnabled(false);
                }else if(mGame.player == COMPUTER_PLAYER){
                    button5.setText(COMPUTER_PLAYER);
                    setMove('O', 4);
                    button5.setEnabled(false);
                }
            }
                break;
            case R.id.six: if(button6.getText().equals(OPEN_SPOT)){
                if(mGame.player == HUMAN_PLAYER){
                    button6.setText(HUMAN_PLAYER);
                    setMove('X', 5);
                    button6.setEnabled(false);
                }else if(mGame.player == COMPUTER_PLAYER){
                    button6.setText(COMPUTER_PLAYER);
                    setMove('O', 5);
                    button6.setEnabled(false);
                }
            }
                break;
            case R.id.seven: if(button7.getText().equals(OPEN_SPOT)){
                if(mGame.player == HUMAN_PLAYER){
                    button7.setText(HUMAN_PLAYER);
                    setMove('X', 6);
                    button7.setEnabled(false);
                }else if(mGame.player == COMPUTER_PLAYER){
                    button7.setText(COMPUTER_PLAYER);
                    setMove('O', 6);
                    button7.setEnabled(false);
                }
            }
                break;
            case R.id.eight: if(button8.getText().equals(OPEN_SPOT)){
                if(mGame.player == HUMAN_PLAYER){
                    button8.setText(HUMAN_PLAYER);
                    setMove('X', 7);
                    button8.setEnabled(false);
                }else if(mGame.player == COMPUTER_PLAYER){
                    button8.setText(COMPUTER_PLAYER);
                    setMove('O', 7);
                    button8.setEnabled(false);
                }
            }
                break;
            case R.id.nine: if(button9.getText().equals(OPEN_SPOT)){
                if(mGame.player == HUMAN_PLAYER){
                    button9.setText(HUMAN_PLAYER);
                    setMove('X', 8);
                    button9.setEnabled(false);
                }else if(mGame.player == COMPUTER_PLAYER){
                    button9.setText(COMPUTER_PLAYER);
                    setMove('O', 8);
                    button9.setEnabled(false);
                }
            }
                break;
        }

    }
}
