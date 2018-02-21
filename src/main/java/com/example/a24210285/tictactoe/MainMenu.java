package com.example.a24210285.tictactoe;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by Ahmed on 2/20/2018.
 */

public class MainMenu extends Activity implements View.OnClickListener {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        setContentView(R.layout.start);

        //Set up click listeners for all buttons
        View newGame = findViewById(R.id.btn_new_game);
        newGame.setOnClickListener(this);
        View closeGame = findViewById(R.id.btn_close);
        closeGame.setOnClickListener(this);
        View AboutTheApp = findViewById(R.id.btn_about);
        AboutTheApp.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_new_game:
                Intent i = new Intent(this, MainActivity.class);
                startActivity(i);
                break;
            case R.id.btn_close:
                finish();
                break;
            case R.id.btn_about:
                Intent j = new Intent(this, About.class);
                startActivity(j);
                break;

        }
        }

    }
