package com.company;

public class Main {

    public static void main(String[] args) {
        String helloWorld;
        final int NUM = 5;
        String word ="Barcode";
        helloWorld = NUM+word;
        System.out.println(helloWorld);
        if (NUM < 0){
            System.out.println("вы сохранили отрицательное число");
        } else if (NUM >0){
            System.out.println("вы сохранили положительное число");
        }else {
            System.out.println("вы сохранили ноль");
        }




    }
}
