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
    protected void onResume() {
        MyThread myThread = new MyThread();
        myThread.start();
        super.onResume();
    }


    public class MyThread extends Thread {
        @Override
        public void run() {
            try {
                sleep(2000);
                Intent intent = new Intent(getApplicationContext(), LogInMainActivity.class);
                startActivity(intent);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

