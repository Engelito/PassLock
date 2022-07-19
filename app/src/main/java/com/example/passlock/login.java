package com.example.passlock;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

public class login extends AppCompatActivity {
    private EditText password,username;
    private Button login;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        password = (EditText)findViewById(R.id.password);
        username = (EditText)findViewById(R.id.username);
        login = (Button) findViewById(R.id.login);

    }
    public void validate(View view){
        String name = username.getText().toString();
        String pass = password.getText().toString();

        if(name.equals("Angel") && pass.equals("1234")){
            Intent intent = new Intent(this, savedPass.class);
            startActivity(intent);

        }
        else{
            Toast.makeText( this, "Username/Password is incorrect", Toast.LENGTH_SHORT).show();
        }
    }
}