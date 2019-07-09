package com.example.myfinancr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Button button1 = (Button) findViewById(R.id.new_account);
        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openNewUser();
            }
        });

        Button button2 = (Button) findViewById(R.id.sign_in);
        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openExistingUser();
            }
        });
    }
    public void openNewUser(){
        Intent intent = new Intent(this, NewUser.class);
        startActivity(intent);
    }

    public void openExistingUser(){
        Intent intent = new Intent(this, ExistingUser.class);
        startActivity(intent);
    }
}
