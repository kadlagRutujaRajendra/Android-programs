package com.example.ass5b1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText usernameInput, passwordInput;
    Button loginBtn;
    MyDBHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        db = new MyDBHelper(this);

        usernameInput = findViewById(R.id.usernameInput);
        passwordInput = findViewById(R.id.passwordInput);
        loginBtn = findViewById(R.id.loginBtn);

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = usernameInput.getText().toString();
                String password = passwordInput.getText().toString();

                if (db.checkUser(username, password)) {

                    Intent intent = new Intent(MainActivity.this, WelcomeActivity.class);
                    intent.putExtra("username", username);
                    startActivity(intent);
                } else {

                    Toast.makeText(MainActivity.this, "Invalid Username or Password!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
