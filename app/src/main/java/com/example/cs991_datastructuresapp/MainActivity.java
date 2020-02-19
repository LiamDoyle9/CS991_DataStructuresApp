package com.example.cs991_datastructuresapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void openActivity1(View view){
        Intent intent  = new Intent (this, Stack_Activity.class);
        startActivity(intent);
    }

    public void openActivity2(View view){
        Intent intent = new Intent(this, Queue_Activity.class);
        startActivity(intent);
    }






}
