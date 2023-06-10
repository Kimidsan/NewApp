package com.example.newapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import com.google.android.material.textfield.TextInputLayout;

public class Login extends AppCompatActivity {

    Button callSignUp;
    TextInputLayout username,email,password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_login);


        //Hooks
        callSignUp = findViewById(R.id.signup_screen);
        username = findViewById(R.id.username);
//        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        callSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Login.this,SignUp.class);

                Pair[] pairs = new Pair[2];
                pairs[0] = new Pair<>(username,"user_tran");
//                pairs[1] = new Pair<>(email,"email_tran");
                pairs[1] = new Pair<>(password,"password_tran");

                ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(Login.this,pairs);
                startActivity(intent,options.toBundle());

            }
        });
    }
}