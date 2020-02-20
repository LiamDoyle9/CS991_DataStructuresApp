package com.example.cs991_datastructuresapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.*;


public class Queue_Activity extends AppCompatActivity {

    private Queue<String> q;
    private int currIndex;
    private int tempIndex;
    private String[] tempArr;


    Button enqueueButton;
    Button dequeueButton;
    TextView inputText;
    TextView q1;
    TextView q2;
    TextView q3;
    TextView q4;
    TextView q5;
    TextView head;
    TextView tail;

    /**
     * Setters & Getters
     */
    public Queue<String> getQueue() {
        return q;
    }

    public void setQueue(Queue<String> q) {
        this.q = q;
    }

    public int getCurrIndex() {
        return currIndex;
    }

    public void setCurrIndex(int currIndex) {
        this.currIndex = currIndex;
    }

    public int getTempIndex() {
        return tempIndex;
    }

    public void setTempIndex(int tempIndex) {
        this.tempIndex = tempIndex;
    }

    /**
     Constructor
     **/
    public Queue_Activity(){
        q = new LinkedList<String>();
        tempArr = new String[5];
        setTempIndex(0);
        setCurrIndex(0);
    }


    /**
     * Class Methods
     */

    public void enqueue(){
        if (q.size() < 5){
            q.add(inputText.getText().toString());
            tempArr[getCurrIndex()] = inputText.getText().toString();
        }
        updateDisplay();
        setCurrIndex(getCurrIndex()+1);
    }

    public void dequeue(){
        tempArr[tempIndex] = "";
        setTempIndex(getTempIndex()+1);
        updateDisplay();
    }

    public void updateDisplay(){
        head.setText(q.peek());

        q1.setText(tempArr[0]);
        q2.setText(tempArr[1]);
        q3.setText(tempArr[2]);
        q4.setText(tempArr[3]);
        q5.setText(tempArr[4]);
    }




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_queue_);

        inputText = findViewById(R.id.input);

        q1 = findViewById(R.id.q1);
        q2 = findViewById(R.id.q2);
        q3 = findViewById(R.id.q3);
        q4 = findViewById(R.id.q4);
        q5 = findViewById(R.id.q5);
        head = findViewById(R.id.head);
        tail = findViewById(R.id.tail);

        enqueueButton = (Button)findViewById(R.id.button_enqueue);
        dequeueButton = (Button)findViewById(R.id.button_dequeue);

        enqueueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                enqueue();
            }
        });

        dequeueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dequeue();
            }
        });

    }
}
