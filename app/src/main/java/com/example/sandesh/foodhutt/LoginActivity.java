package com.example.sandesh.foodhutt;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class LoginActivity extends AppCompatActivity {
    EditText etUser;
    EditText etPass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        final TextView tvRegister = (TextView) findViewById(R.id.tvRegister);
        final Button btLogin = (Button) findViewById(R.id.btLogin);

        final FoodHutUser userOne = new FoodHutUser("Username","Password");
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
                 etUser = (EditText) findViewById(R.id.etUsername);
                etPass = (EditText) findViewById(R.id.etPassword);
                String username = etUser.getText().toString();

                if (userOne.getUsername() == username) {
                    Intent MainActivity = new Intent(LoginActivity.this, MainActivity.class);
                    LoginActivity.this.startActivity(MainActivity);
                }
               //}
            }

        }))
                ;

    }
}
