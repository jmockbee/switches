package com.JonMockbee;

public class Main {



    public static void main(String[] args) {
//        int value = 3;
//        if (value ==1){
//            System.out.println("Value was 1");
//        }else if(value == 2){
//            System.out.println("Value was 2");
//        }else (value ==3 ){
//            System.out.println("was not 1 or 2 ");
//        }
//
//        int switchValue =4;
//        switch (switchValue) {
//            case 1:
//                System.out.println("value was 1");
//                break;
//
//
//            case 2:
//                System.out.println("value was 2");
//                break;
//
//            case 3: case 4: case 5:
//                System.out.println("was a 3 , 4 or 5");
//                System.out.println("Actually was a "+ switchValue);
//                break;
//
//
//                default:
//                    System.out.println("was not 1 or 2 ");
//                    break;
//        }

        char switchchar = 'c';

        switch(switchchar){
            case 'a': case 'b': case 'c': case 'd': case 'e':
                System.out.println("it was a,b,c,d,e");
                System.out.println("actually it was " + switchchar );
                break;
            default:
                System.out.println("not found ");
                break;
        }

        String month= "jaNuary";
        switch (month.toLowerCase()){
            case "january":
                System.out.println("Jan");
                break;
            case "june":
                System.out.println("june");
                break;
                default:
                    System.out.println("not sure");
        }
    }

}
