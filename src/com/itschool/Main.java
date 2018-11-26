package com.itschool;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
      task1();
      task2();
      task3();

      task7();
      task8();
      task11();



    }

    public static void task1() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Программа для вычисления значений функции.");
        System.out.println("Задайте пределы отрезка [a,b]:");
        System.out.print("Предел а ->");
        double a_task1 = scan.nextDouble();
        System.out.print("Предел b ->");
        double b_task1 = scan.nextDouble();
        System.out.print("Шаг ->");
        double step_task1 = scan.nextDouble();
        System.out.println("Задайте аргумент х -> ");
        double x = scan.nextDouble();
        double y1_task1 = 0;
        double y2_task1 = 0;
        double y3_task1 = 0;
        System.out.println("x | y");
        for(x = a_task1; x<=b_task1; x+=step_task1){
            y1_task1 = x - Math.sin(x);

            System.out.println(x + " | " + y1_task1);
        }
        System.out.println();
        System.out.println("x | y");
        for(x = a_task1; x<=b_task1; x+=step_task1){
            y2_task1 = Math.pow(Math.sin(x), 2);
            System.out.println(x + " | " + y2_task1);
        }
        System.out.println();
        System.out.println("x | y");
        for(x = a_task1; x<=b_task1; x+=step_task1){
            y3_task1 = (2 * Math.cos(x)) - 1;
            System.out.println(x + " | " + y3_task1);
        }

    }

    public static void task2(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Программа вычисления функции");
        double a = 3, b = -5;
        double y = 0;
        System.out.println("x  |  y");
       for (double x = 1; x<=5; x+=0.5) {
           y = (a * x * x) + b;
           System.out.println(x + "|" + y);
       }
    }

    public static void task3() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Дано натуральное число. Верно ли, что цифра а встречается в нем реже, чем\n" +
                "цифра b?");
        int a = 0, b = 0, number = 0, counter_a = 0, counter_b = 0;
        System.out.print("Введите натуральное число -> ");
        number = scan.nextInt();
        System.out.print("Введите цифру a -> ");
        a = scan.nextInt();
        System.out.print("Введите цифру b -> ");
        b = scan.nextInt();
        do {
            if (a == number % 10) {
                counter_a++;
            } else if (a == number / 10 % 10) {
                counter_a++;
            }

            if (b == number % 10) {
                counter_b++;
            } else if (b == number / 10 % 10) {
                counter_b++;
            }

            number = number / 10;
        } while (number != 0);
        if (counter_a > counter_b) {
            System.out.println("Цифра а встречается чаще чем b");
        } else if (counter_a < b) {
            System.out.println("Цифра b встречается чаще чем а");
        } else
            System.out.println("Цифры a и b встречаються одинаково часто");

    }

    public static void task7(){
        int a = 0 , b = 100;
        System.out.println("15 первых натуральных чисел, делящихся нацело на 19 и больших 100 :");
        do{
            b++;
            if (b % 19 ==0 ){
                a++;
                System.out.println(b);
            }
        }while (a!=15);

    }

    public static void task8(){
        System.out.println("20 первых натуральных чисел, делящихся нацело на 13 или на 17 и\n" +
                "больших 500:");
        int a = 0, b = 500;
        do {
            b++;
            if ((0 == b % 13) || (0 == b % 17)){
                a++;
                System.out.println(b);
            }
        }while (a != 20);
    }

    public  static void task11(){
        System.out.println("Прямоугольник");
        for (int i = 0; i<50; i++)
            System.out.print("-");
        System.out.println();
        for (int i = 0; i<6; i++)
            System.out.println("|\t \t \t \t \t \t \t \t \t \t \t   \t |");
        for (int i = 0; i<50; i++)
            System.out.print("-");
        System.out.println();
        System.out.println("Прямоугольный треугольник");






    }



}


