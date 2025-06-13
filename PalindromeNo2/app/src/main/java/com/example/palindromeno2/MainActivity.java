package com.example.palindromeno2;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.EditText;

public class MainActivity extends Activity {
    EditText e1;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=findViewById(R.id.no);
        b1=findViewById(R.id.b1);
        b1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                int no=Integer.parseInt(e1.getText().toString());
                int temp=no;
                int rem,rev=0;
                while(temp>0){
                    rem=temp%10;
                    rev=(rev*10)+rem;
                    temp=temp/10;
                }
                Intent i=new Intent(getApplicationContext())

            }
        });
    }
}