package com.example.akirisurely.sgdapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
         Thread timer = new Thread(){
             public  void run(){
                 try{
                     sleep(2500);
                     Intent i = new Intent(SplashActivity.this,MainActivity.class);
                     startActivity(i);
                 }
                 catch (InterruptedException e){
                     e.printStackTrace();
                 }
             }
         };
         timer.start();

    }
}
