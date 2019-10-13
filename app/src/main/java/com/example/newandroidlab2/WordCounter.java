package com.example.newandroidlab2;


import android.widget.Toast;

public class WordCounter {


    public void charCounter(String stringToCount) {
       // String stringToCount = "The best of both worlds";
        int count = 0;

        //Counts each character except space
        for(int i = 0; i < stringToCount.length(); i++) {
            if(stringToCount.charAt(i) != ' ')
                count++;
        }

        //Displays the total number of characters present in the given string
       // Toast.makeText(parent.getContext(),text,Toast.LENGTH_SHORT).show();
    }
}

