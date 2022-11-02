package com.example.tienditav3;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AuthActivity extends AppCompatActivity {

    EditText User,contrasenia;
    Button btnlogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        setTheme(R.style.AppTheme);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        User = findViewById(R.id.idUsuario);
        contrasenia= findViewById(R.id.contrasenia);
        btnlogin= findViewById(R.id.buttonlogin);

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(User.getText().toString().equals("Admin") && contrasenia.getText().toString().equals("holamundo")){
                    startActivity(new Intent(AuthActivity.this, MenuActivity.class));
                }
            }
        });

    }
}