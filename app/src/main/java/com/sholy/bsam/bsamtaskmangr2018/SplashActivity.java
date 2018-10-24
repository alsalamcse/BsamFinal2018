package com.sholy.bsam.bsamtaskmangr2018;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
    }
    @Override
    protected void onRestart() {
        MyThread myThread=new MyThread();
        myThread.start();
        super.onRestart();
    }

    public class MyThread extends Thread
    {
        @Override
        public void run() {
            try {
                sleep(1000);
                Intent intent=new Intent(getApplicationContext(),MainTabsActivity.class);
                startActivity(intent);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
