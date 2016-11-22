package com.felight.nammabengaluruexplorer;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btnsign;
    private Button btnlog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnsign=(Button)findViewById(R.id.btnsign);
        btnlog=(Button)findViewById(R.id.btnlog);
    }

    public void sign(View view){
        Intent i = new Intent(MainActivity.this, Registration1.class);
        //Kill the activity from which you will go to next activity
        startActivity(i);
    }

    public void log(View view){
        Intent i = new Intent(MainActivity.this, Login.class);
        //Kill the activity from which you will go to next activity
        startActivity(i);
    }







}
