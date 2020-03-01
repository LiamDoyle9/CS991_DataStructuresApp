package com.example.cs991_datastructuresapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Arrays;

public class BubbleSort_Activity extends AppCompatActivity {

    private TextView tv_unsortedArray;
    private TextView tv_sortedArray;

    private int[] unsortedArray;
    private int[] sortedArray;

    private TextView arr_0_0;
    private TextView arr_0_1;
    private TextView arr_0_2;
    private TextView arr_0_3;
    private TextView arr_0_4;

    private TextView arr_1_0;
    private TextView arr_1_1;
    private TextView arr_1_2;
    private TextView arr_1_3;
    private TextView arr_1_4;

    private TextView arr_2_0;
    private TextView arr_2_1;
    private TextView arr_2_2;
    private TextView arr_2_3;
    private TextView arr_2_4;

    private TextView arr_3_0;
    private TextView arr_3_1;
    private TextView arr_3_2;
    private TextView arr_3_3;
    private TextView arr_3_4;

    private Button button;


    /**
     * Setters & Getters
     */
    public int[] getUnsortedArray() {
        return unsortedArray;
    }

    public void setUnsortedArray(int[] unsortedArray) {
        this.unsortedArray = unsortedArray;
    }

    public int[] getSortedArray() {
        return sortedArray;
    }

    public void setSortedArray(int[] sortedArray) {
        this.sortedArray = sortedArray;
    }

    /**
     *Constructor
     */
    public BubbleSort_Activity(){
        unsortedArray = new int[]{5,4,3,2,1};
        sortedArray = new int[5];
    }


    /**
     * Class Methods
     */

    public void updateDisplay(){
        bubbleSort(unsortedArray);
        arr_0_0.setText("4");
        arr_0_1.setText("3");
        arr_0_2.setText("2");
        arr_0_3.setText("1");
        arr_0_4.setText("5");

        arr_1_0.setText("3");
        arr_1_1.setText("2");
        arr_1_2.setText("1");
        arr_1_3.setText("4");
        arr_1_4.setText("5");

        arr_2_0.setText("2");
        arr_2_1.setText("1");
        arr_2_2.setText("3");
        arr_2_3.setText("4");
        arr_2_4.setText("5");

        arr_3_0.setText("1");
        arr_3_1.setText("2");
        arr_3_2.setText("3");
        arr_3_3.setText("4");
        arr_3_4.setText("5");

        tv_sortedArray.setText(Arrays.toString(bubbleSort(unsortedArray)));

    }

    public int[] bubbleSort(int[]array){
        int temp = 0;
        for (int i = 0; i < array.length; i++){
            for (int j = 1; j<(array.length-i); j++){
                if(array[j-1] > array[j]){
                    temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bubblesort);

        tv_unsortedArray = findViewById(R.id.arr_unsorted);
        tv_sortedArray = findViewById(R.id.arr_sorted);
        button = findViewById(R.id.button_sort);

        arr_0_0 = findViewById(R.id.arr_0_0);
        arr_0_1 = findViewById(R.id.arr_0_1);
        arr_0_2 = findViewById(R.id.arr_0_2);
        arr_0_3 = findViewById(R.id.arr_0_3);
        arr_0_4 = findViewById(R.id.arr_0_4);

        arr_1_0 = findViewById(R.id.arr_1_0);
        arr_1_1 = findViewById(R.id.arr_1_1);
        arr_1_2 = findViewById(R.id.arr_1_2);
        arr_1_3 = findViewById(R.id.arr_1_3);
        arr_1_4 = findViewById(R.id.arr_1_4);

        arr_2_0 = findViewById(R.id.arr_2_0);
        arr_2_1 = findViewById(R.id.arr_2_1);
        arr_2_2 = findViewById(R.id.arr_2_2);
        arr_2_3 = findViewById(R.id.arr_2_3);
        arr_2_4 = findViewById(R.id.arr_2_4);

        arr_3_0 = findViewById(R.id.arr_3_0);
        arr_3_1 = findViewById(R.id.arr_3_1);
        arr_3_2 = findViewById(R.id.arr_3_2);
        arr_3_3 = findViewById(R.id.arr_3_3);
        arr_3_4 = findViewById(R.id.arr_3_4);

        tv_unsortedArray.setText(Arrays.toString(unsortedArray));

        button.setOnClickListener(new View.OnClickListener() {
            //Code that is run after the button has been pressed
            @Override
            public void onClick(View v) {
                updateDisplay();
            }
        });

    }
}
