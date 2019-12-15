package com.example.newandroidlab2;


public  class WordCounter {

    private void TextView(String string) {
        MainActivity m =new MainActivity();

    }
    public static int charCounter(String stringToCount) {
       // String stringToCount = "The best of both worlds";
        int count = 0;

        //Counts each character except space
        for(int i = 0; i < stringToCount.length(); i++) {
            if(stringToCount.charAt(i) != ' ')
                count++;
        }
        return count;

    }
        // Displays the total number of characters present in the given string
       // Toast.makeText(parent.getContext(),text,Toast.LENGTH_SHORT).show();

    public static int wordCounter (String stringToCount){
        int count = 0 ;

        for (int i = 0 ; i<stringToCount.length();i++){
            int cur = stringToCount.charAt(i);
            if( cur ==' ' || cur == '.' || cur ==',' ){
                count++;
            }
        }
    return count;
    }

}

