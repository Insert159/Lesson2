package ru.geekbrains.lesson2;

public class Homework2 {

    public static void main(String[] args) {
        /*isSumBetween10And20();
        isPositiveOrNegative();
        isNegative();
        printWordNTimes();*/
        methodWithAStar();
    }

    public static boolean isSumBetween10And20() {
        int a =5;
        int b= 1;
        int sum = a+b;
        if (sum>=10 && sum<=20) {
            return true;
        } else {
            return false;
        }
    }

    public static void isPositiveOrNegative() {
        int a=10;
        if (a>0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    public static boolean isNegative() {
        int a = 10;
        if (a<0){
            return true;
        } else
            return false;
    }

    public static void printWordNTimes() {
        for (int  a = 0; a < 10; a++) {
            System.out.println("word");
        }
        System.out.println();
    }

    public static boolean methodWithAStar() {
        int a = 25;
        if ((a % 4 == 0) || (a % 400 == 0)) {
            return true;
        } if (a % 100 == 0) {
            return false;
        }else {
            return false;
        }
    }

}
