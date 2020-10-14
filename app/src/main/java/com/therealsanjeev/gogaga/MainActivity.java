package com.therealsanjeev.gogaga;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //This couple of code doesn't make any sense but still doing
        TextView textView = (TextView) findViewById(R.id.text_1);
        textView.setText("Ready to Go");
    }
}
