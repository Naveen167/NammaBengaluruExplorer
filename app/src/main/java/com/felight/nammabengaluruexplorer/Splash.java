package com.felight.nammabengaluruexplorer;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Splash extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Thread myThread=new Thread(){

            @Override
            public void run(){
                try{
                    sleep(3000);
                    Intent intent=new Intent(getApplicationContext(),MainActivity.class);
                    startActivity(intent);
                    finish();
                }
                catch (Exception e){
                    e.printStackTrace();
                }
            }
        };myThread.start();
    }
}
