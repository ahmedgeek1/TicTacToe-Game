package com.example.a24210285.tictactoe;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


import static android.os.SystemClock.sleep;
import static com.example.a24210285.tictactoe.R.string.result_human_wins;
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
    }

    // Set up the game board.
    private void startNewGame() {
        mGame.clearBoard();
        mGame.enableButtons();
        String text = getResources().getString(R.string.first_human);
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();

        nextTurn();

        //start.setText(R.string.first_human);
        //mInfoTextView.setText("You go first");

    }

    private void nextTurn(){
        // if(!mGame.allButtonsPlayed()){
        String text = getResources().getString(R.string.turn_human);
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_LONG;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();

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
        if (mGame.numOfButtonsPlayed()>8){
            CharSequence text;// = "Game over";
            String str;
            int winner = mGame.checkForWinner();
            if (winner==3){
                 text = getResources().getString(R.string.result_computer_wins);
            }else if (winner==2){
                 text = getResources().getString(R.string.result_human_wins);
            }else if (winner==1){
                 text = getResources().getString(R.string.result_tie);
            }else if (winner==0){
                 text = getResources().getString(R.string.result_no_winner);
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
            case R.id.one: if(button1.getText().equals(String.valueOf(OPEN_SPOT))){
                button1.setText(String.valueOf(HUMAN_PLAYER));
                button1.setEnabled(false);
                setMove('O', mGame.getComputerMove());
                mGame.player = COMPUTER_PLAYER;
                nextTurn();
            }
                break;
            case R.id.two: if(button2.getText().equals(String.valueOf(OPEN_SPOT))){
                button2.setText(String.valueOf(HUMAN_PLAYER));
                button2.setEnabled(false);
                setMove('O', mGame.getComputerMove());
                mGame.player = COMPUTER_PLAYER;
                nextTurn();
            }
                break;
            case R.id.three: if(button3.getText().equals(String.valueOf(OPEN_SPOT))){
                button3.setText(String.valueOf(HUMAN_PLAYER));
                button3.setEnabled(false);
                setMove('O', mGame.getComputerMove());
                mGame.player = COMPUTER_PLAYER;
                nextTurn();
            }
                break;
            case R.id.four: if(button4.getText().equals(String.valueOf(OPEN_SPOT))){
                button4.setEnabled(false);
                button4.setText(String.valueOf(HUMAN_PLAYER));
                setMove('O', mGame.getComputerMove());
                mGame.player = COMPUTER_PLAYER;
                nextTurn();
            }
                break;
            case R.id.five: if(button5.getText().equals(String.valueOf(OPEN_SPOT))){
                button5.setEnabled(false);
                button5.setText(String.valueOf(HUMAN_PLAYER));
                setMove('O', mGame.getComputerMove());
                mGame.player = COMPUTER_PLAYER;
                nextTurn();
            }
                break;
            case R.id.six: if(button6.getText().equals(String.valueOf(OPEN_SPOT))){
                button6.setEnabled(false);
                button6.setText(String.valueOf(HUMAN_PLAYER));
                setMove('O', mGame.getComputerMove());
                mGame.player = COMPUTER_PLAYER;
                nextTurn();
            }
                break;
            case R.id.seven: if(button7.getText().equals(String.valueOf(OPEN_SPOT))){
                button7.setEnabled(false);
                button7.setText(String.valueOf(HUMAN_PLAYER));
                setMove('O', mGame.getComputerMove());
                mGame.player = COMPUTER_PLAYER;
                nextTurn();
            }
                break;
            case R.id.eight: if(button8.getText().equals(String.valueOf(OPEN_SPOT))){
                button8.setEnabled(false);
                button8.setText(String.valueOf(HUMAN_PLAYER));
                setMove('O', mGame.getComputerMove());
                mGame.player = COMPUTER_PLAYER;
                nextTurn();
            }
                break;
            case R.id.nine: if(button9.getText().equals(String.valueOf(OPEN_SPOT))){
                button9.setEnabled(false);
                button9.setText(String.valueOf(HUMAN_PLAYER));
                setMove('O', mGame.getComputerMove());
                mGame.player = COMPUTER_PLAYER;
                nextTurn();
            }
                break;
        }
        //sleep(1000);
/*
        CharSequence text;
        text = getResources().getString(R.string.turn_computer);
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
*/
        //sleep(1000);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
        //respond to menu item selection
        case R.id.btn_new_game:
        startNewGame();
        return true;
        case R.id.btn_close:
        finish();
        return true;
        case R.id.btn_home:
        Intent i = new Intent(this, MainMenu.class);
        startActivity(i);
        return true;
        default:
        return super.onOptionsItemSelected(item);
        }
    }
}

