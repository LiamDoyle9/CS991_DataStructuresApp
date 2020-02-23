package com.example.cs991_datastructuresapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Arrays;
import java.util.HashMap;

public class Sort extends AppCompatActivity {

    private int[] unsortedArr;
    private int[] sortedArr;
    private HashMap<Integer, int[]> map;

    TextView sortedArray;
    TextView unsortedArray;

    TextView arr0;

    TextView arr_0_0;
    TextView arr_0_1;
    TextView arr_0_2;
    TextView arr_0_3;
    TextView arr_0_4;

    TextView arr_1_0;
    TextView arr_1_1;
    TextView arr_1_2;
    TextView arr_1_3;
    TextView arr_1_4;

    TextView arr_2_0;
    TextView arr_2_1;
    TextView arr_2_2;
    TextView arr_2_3;
    TextView arr_2_4;

    TextView arr_3_0;
    TextView arr_3_1;
    TextView arr_3_2;
    TextView arr_3_3;
    TextView arr_3_4;

    Button sort;

    /**
     * IDEA FOR IMPLEMENTING THE VISUALISATION FOR BUBBLE SORT
     *  -   Hard code the arrays used for the visualisation for each iteration
     *  -   Have the bubble sort algorithm sort the initial array ([5,4,3,2,2]) and display the sorted array in a textView widget
     */

    /**
     * Constructor
     */
    public Sort(){
        unsortedArr = new int[5];
        sortedArr = new int[5];
        map = new HashMap<Integer, int[]>();

        generateUnsortedArr(unsortedArr);
        bubbleSort(unsortedArr);

    }



    /**
     * Setters & Getters
     */

    public int[] getUnsortedArr() {
        return unsortedArr;
    }

    public void setUnsortedArr(int[] unsortedArr) {
        this.unsortedArr = unsortedArr;
    }

    public int[] getSortedArr() {
        return sortedArr;
    }

    public void setSortedArr(int[] sortedArr) {
        this.sortedArr = sortedArr;
    }

    public HashMap<Integer, int[]> getMap() {
        return map;
    }

    public void setMap(HashMap<Integer, int[]> map) {
        this.map = map;
    }

    /**
     * Class Methods
     */


    public int[] generateUnsortedArr(int[] array){
        int temp = 5;
        for (int i  = 0; i < array.length; i++){
            array[i] = temp;
            temp--;
        }
        return array;
    }

    public String getMapValue (int i){
        String value = Arrays.toString(map.get(i));
        return value;
    }

    public void updateDisplay(){
        unsortedArray.setText(Arrays.toString(generateUnsortedArr(unsortedArr)));
        sortedArray.setText(Arrays.toString(bubbleSort(unsortedArr)));
        arr0.setText(getMapValue(0));
    }

    public void getIncrements(int i, int[]array){
        map.put(i, array);
    }



    public int[] bubbleSort(int[] array){
        int temp = 0;

        for (int i = 0; i < array.length; i++){
            for (int j = 1; j < (array.length - i); j++){
                if (array[j-1] > array[j]) {
                    temp = array[j-1];
                    getIncrements(i, array);  /// WHYYYY IS THIS NOT WORKING ????? -.-
                    array[j-1] = array[j];
                    array[j] = temp;
                    //map.put(i, array);
                }

            }
        }
        return array;
    }




//    public void hardcodeVisualisation(){
//        arr_0_0.setText(Integer.toString(4));
//        arr_0_1.setText(Integer.toString(3));
//        arr_0_2.setText(Integer.toString(2));
//        arr_0_3.setText(Integer.toString(1));
//        arr_0_4.setText(Integer.toString(5));
//
//        arr_1_0.setText(Integer.toString(3));
//        arr_1_1.setText(Integer.toString(2));
//        arr_1_2.setText(Integer.toString(1));
//        arr_1_3.setText(Integer.toString(4));
//        arr_1_4.setText(Integer.toString(5));
//
//        arr_2_0.setText(Integer.toString(2));
//        arr_2_1.setText(Integer.toString(1));
//        arr_2_2.setText(Integer.toString(3));
//        arr_2_3.setText(Integer.toString(4));
//        arr_2_4.setText(Integer.toString(4));
//
//        arr_3_0.setText(Integer.toString(1));
//        arr_3_1.setText(Integer.toString(2));
//        arr_3_2.setText(Integer.toString(3));
//        arr_3_3.setText(Integer.toString(4));
//        arr_3_4.setText(Integer.toString(5));
//    }






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sort);



        unsortedArray = findViewById(R.id.arr_unsorted);
        sortedArray = findViewById(R.id.arr_sorted);

        arr0 = findViewById(R.id.arr0);

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

//        arr_3_0 = findViewById(R.id.arr_3_0);
//        arr_3_1 = findViewById(R.id.arr_3_1);
//        arr_3_2 = findViewById(R.id.arr_3_2);
//        arr_3_3 = findViewById(R.id.arr_3_3);
//        arr_3_4 = findViewById(R.id.arr_3_4);

        sort = findViewById(R.id.button_sort);


        //unsortedArray.setText

        sort.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bubbleSort(unsortedArr);
                updateDisplay();
            }
        });

    }
}
