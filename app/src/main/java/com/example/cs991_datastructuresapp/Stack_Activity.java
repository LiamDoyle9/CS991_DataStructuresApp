package com.example.cs991_datastructuresapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.*;


public class Stack_Activity extends AppCompatActivity {

    Button pushButton;
    Button popButton;

    TextView inputText;

    TextView arr0;
    TextView arr1;
    TextView arr2;
    TextView arr3;
    TextView arr4;

    private Stack<String> stack = new Stack<String>();
    private Object[] arr = stack.toArray();
    private int currIndex;


    /**
     * Constructor
     */
    public Stack_Activity(){
        currIndex = 0;
//        stack.empty();
    }

    /**
     * Setters & Getters
     */

    public Stack getStack() {
        return stack;
    }

    public void setStack(Stack stack) {
        this.stack = stack;
    }

    public int getCurrIndex() {
        return currIndex;
    }

    public void setCurrIndex(int currIndex) {
        this.currIndex = currIndex;
    }

    /**
     * Class Methods
     */
    public void pushStack(){
        stack.push(inputText.getText().toString());
        if (stack.size() == 1){
            arr0.setText(stack.get(getCurrIndex()));
        }
        if (stack.size() == 2){
            arr1.setText(stack.get(getCurrIndex()));
        }
        if (stack.size() == 3){
            arr2.setText(stack.get(getCurrIndex()));
        }
        if (stack.size() == 4){
            arr3.setText(stack.get(getCurrIndex()));
        }
        if (stack.size() == 5){
            arr4.setText(stack.get(getCurrIndex()));
        }
        setCurrIndex(getCurrIndex()+1);
    }

    public void popStack(){

        if (stack.size() == 1){
            arr0.setText("");
        }
        if (stack.size() == 2){
            arr1.setText("");
        }
        if (stack.size() == 3){
            arr2.setText("");
        }
        if (stack.size() == 4){
            arr3.setText("");
        }
        if (stack.size() == 5){
            arr4.setText("");
        }
        stack.pop();
        setCurrIndex(getCurrIndex()-1);
    }




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stack);

        inputText = findViewById(R.id.input);

        arr0 = findViewById(R.id.arr_0);
        arr1 = findViewById(R.id.arr_1);
        arr2 = findViewById(R.id.arr_2);
        arr3 = findViewById(R.id.arr_3);
        arr4 = findViewById(R.id.arr_4);

        pushButton = (Button)findViewById(R.id.button_push);
        popButton = (Button)findViewById(R.id.button_pop);


        pushButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pushStack();

            }
        });

        popButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                popStack();
            }
        });

    }
}
