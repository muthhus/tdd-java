package com.tdd.practice;

public class Calculator {

    private static final String givenStringNos = "1,2,3\n4,100,999,1010,1005,4001,2003";

    public int sumOfGivenString(){
        int result = 0;

        if(!givenStringNos.equals("") || givenStringNos != null){
            for(int i = 0; i < givenStringToArray().length; i++){
                if(givenStringToInt(givenStringToArray()[i]) <= 1000) {
                    result = compute(result, givenStringToInt(givenStringToArray()[i]));
                }
            }
        }
        return result;
    }

    public String[] givenStringToArray(){
        String givenString = givenStringNos.replace("\n", ",");
        String[] finalString = givenString.split(",");
        return finalString;
    }

    public int compute(int previous, int current){
        return previous = previous + current;
    }

    public int givenStringToInt(String input){
        return Integer.parseInt(input);
    }
}
