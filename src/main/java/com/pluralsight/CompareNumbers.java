package com.pluralsight;

public class CompareNumbers {
    public static void main(String[] args) {


        System.out.println(isEven(  5));
        System.out.println(isEven(  4 ));
    }

        public static boolean isEven(int number){

            if(number % 2 ==0){
                return true;
            }

            return false;
    }


}

