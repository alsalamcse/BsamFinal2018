package com.sholy.bsam.bsamtaskmangr2018;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class LogInMainActivity extends AppCompatActivity {
    private EditText etEmail , etPassword;
    private Button btnSignIn , btnSignUP;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in_main);

        etEmail = (EditText) findViewById(R.id.etEmail);
        etPassword = (EditText) findViewById(R.id.etPassword);
        btnSignIn = (Button) findViewById(R.id.btnSignIn);
        btnSignUP = (Button) findViewById(R.id.btnSignUp);


    }
}
