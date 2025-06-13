package com.example.ass5b1;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class WelcomeActivity extends AppCompatActivity {

    TextView welcomeMsg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        welcomeMsg = findViewById(R.id.welcomeMsg);

        String username = getIntent().getStringExtra("username");
        welcomeMsg.setText("Welcome, " + username + "!");
    }
}
