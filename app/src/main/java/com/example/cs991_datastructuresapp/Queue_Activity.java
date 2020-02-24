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
    private String[] displayArr;

    Button addButton;
    Button removeButton;
    TextView inputText;
    TextView q1;
    TextView q2;
    TextView q3;
    TextView q4;
    TextView q5;
    TextView head;

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

    public String[] getDisplayArr() {
        return displayArr;
    }

    public void setDisplayArr(String[] displayArr) {
        this.displayArr = displayArr;
    }

    /**
     Constructor
     **/
    public Queue_Activity(){
        q = new LinkedList<String>();
        displayArr = new String[5];
        setTempIndex(0);
        setCurrIndex(0);

    }


    /**
     * Class Methods
     */

    public void addElement(){
        if (q.size() < 5 ){
            q.add(inputText.getText().toString());
            displayArr[getCurrIndex()] = inputText.getText().toString();
        }
        updateDisplay();
        setCurrIndex(getCurrIndex()+1);
    }

    public void removeElement(){
        displayArr[tempIndex] = "";
        q.remove();
        setTempIndex(getTempIndex()+1);
        updateDisplay();

    }

    public void updateDisplay(){
        head.setText(q.peek());
        q1.setText(displayArr[0]);
        q2.setText(displayArr[1]);
        q3.setText(displayArr[2]);
        q4.setText(displayArr[3]);
        q5.setText(displayArr[4]);
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

        addButton = (Button)findViewById(R.id.button_add);
        removeButton = (Button)findViewById(R.id.remove);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addElement();
            }
        });

        removeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                removeElement();
            }
        });

    }
}
