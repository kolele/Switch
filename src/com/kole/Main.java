package com.kole;

public class Main {

    public static void main(String[] args) {

//        int value = 3;
//	    if (value == 1) {
//            System.out.println("Value was 1");
//        } else if (value == 2) {
//            System.out.println("Value was 2");
//        } else {
//            System.out.println("Value was not 1 or 2");
//        }
        int switchValue = 3;

        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;

            case 2:
                System.out.println("Value was 2");
                break;

            case 3: case 4: case 5:
                System.out.println("Value was 3");
                System.out.println("Actually it was " + switchValue);
                break;

            default:
                System.out.println("Was not one or two");
                break;
        }

        char myChar = 'C';

        switch (myChar) {
            case 'A':
                System.out.println("It was A");
                break;

            case 'B':
                System.out.println("It was B");
                break;
            case 'C':
                System.out.println("It was C");
                break;
            case 'D':
                System.out.println("It was D");
                break;
            case 'E':
                System.out.println("It was E");
                break;

            default:
                System.out.println("Was not ABCDE");
                break;
        }

        String month = "January";
        switch (month.toLowerCase()){
            case "january":
                System.out.println("Jan");
                break;
            case "june":
                System.out.println("Jun");
                break;
            default:
                System.out.println("Not sure");
        }



    }
}
