package com.example.cheery.hellofromcheery;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);

        /* Change text color */
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("Cheery", "Button1 clicked"); // Record in the log if button is clicked
                ((TextView) findViewById(R.id.textView)).setTextColor(getResources().getColor(R.color.colorPrimaryDark));
            }
        });

        /* Change background color */
        findViewById(R.id.button3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.background).setBackgroundColor(getResources().getColor(R.color.light_pink));
            }
        });

        /* Greet Cheery */
        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((TextView) findViewById(R.id.textView)).setText("Hello Cheery, nice to meet you!");
            }
        });

        /* Guess what? */
        findViewById(R.id.button4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((TextView) findViewById(R.id.textView)).setText("Android is Awesome!");
            }
        });
    }
}
