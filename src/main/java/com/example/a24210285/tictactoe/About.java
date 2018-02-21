package com.example.a24210285.tictactoe;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Ahmed on 2/20/2018.
 */

public class About extends Activity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about);

        Button exit_button = findViewById(R.id.btn_close);
        exit_button.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_close:
                Intent i = new Intent(this, MainMenu.class);
                startActivity(i);
                break;
            }
        }
}
