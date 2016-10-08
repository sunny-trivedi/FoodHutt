package com.example.sandesh.foodhutt;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        final TextView tvRegister = (TextView) findViewById(R.id.tvRegister);
        final Button btLogin = (Button) findViewById(R.id.btLogin);

        tvRegister.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent registerActivity = new Intent(LoginActivity.this, RegisterActivity.class);
                LoginActivity.this.startActivity(registerActivity);
            }

        });
        btLogin.setOnClickListener((new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                EditText etUsername = (EditText) findViewById(R.id.etUsername);
                EditText etPassword = (EditText) findViewById(R.id.etPassword);
               //if (etUsername.toString() == "Username" && etPassword.toString() == "Password")
              // {
                   Intent MainActivity = new Intent(LoginActivity.this, MainActivity.class);
                   LoginActivity.this.startActivity(MainActivity);
               //}
            }

        }))
                ;

    }
}
