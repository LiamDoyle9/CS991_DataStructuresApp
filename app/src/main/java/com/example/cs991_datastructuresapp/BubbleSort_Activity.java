package com.example.cs991_datastructuresapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class BubbleSort_Activity extends AppCompatActivity {


    private int[] arr;

    /**
     * Constructor
     */
    public BubbleSort_Activity() {

        arr = new int[5];
        int temp = 5;

        for(int i = 0; i <= arr.length; i++){
            arr[i] = temp;
            temp--;
        }
    }


    /**
     * Setters & Getters
     */



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bubble_sort_);
    }
}
