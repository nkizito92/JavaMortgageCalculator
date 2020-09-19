package com.company;

import java.awt.*;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] num) {
//        Fizz Buzz in Java
//        for (var i = 1; i <= 30; i++) {
//            if (i % 5 == 0 && i % 3 == 0) {
//                System.out.println("FizzBuzz");
//            } else if (i % 3 == 0) {
//
//                System.out.println("Fizz");
//            } else if (i % 5 == 0) {
//                System.out.println("Fizz");
//            } else {
//                System.out.println(i);
//            }
//        }
//    ******************************
//   primitive types total of 8

//    ******************************
//        byte day = 30;
//        short month =12; 2 bytes
//       int godswillsAge = 10; 4 bytes
//        float years = 2020F;
//                double miles = 12.2354511;
//                boolean carMiles = true;
//                char letter = 'A';
//                long footSteps = 6_565_456_455L;
//                System.out.println(month);
//        Date now = new Date();
//        System.out.print(now);
//        When dealing with references types you don't need to allocate memory.
//        ******************************************
//
        /*
        *
        * Reference types are copied by the references whereas Primitive types are copied by their value and are completely dependent by each other.
        * */

        Point point1 = new Point( 1, 1);
        Point pointing = point1;
        point1.x = 5;
        System.out.println(pointing+ "\n");

//        More Reference types

//   Added double quotes in a string
        String message = "Hello man \"Hello\" what is up???";

//        added a backslash in a string.
        String message1A = "Hello man \\Hello\\ what is up???";

        String message2 = message.replace("a", "STOP");
//        Strings are immutable in java, so any methods that modify a string create a new string object.
        System.out.println(message2.concat(" Noooooo"));

//        Arrays
// old way of creating an array
            int[] numbers = new int[5];
            numbers[0] = 1;
            numbers[1] = 5;
            numbers[2] = 1;
        numbers[3] = 4;
        numbers[4] = 3;
//        there reason why you get weird items in an arrays is because by default java returns array string which is calculated based on the address of this object in memory.

//        So use the class call Arrays
// Arrays.toString(numbers)
        System.out.println(Arrays.toString(numbers));

//        new way of creating an array in Java
        int[][] numbers2 = {{2, 4, 5, 2, 5}};
        Arrays.sort(numbers2[0]);
//        deepToString Class will display the full array that has an inner array
        System.out.println(Arrays.deepToString(numbers2));

//        Creating a constant in java using final before using the primitive types.
            final int num2 = 5;


//        Java arithmetic operators
//         (+-*/ %)

//        division is a little different

            double result = 10 / 3;

//            This is an express (double)10 / (double)3
            double result2 = (double)10 / (double) 3;
            int x = 1;

//            Augmented assignment operator "+="
            System.out.println(result);
            System.out.println(result2);

//            explicit casting converting z to an integer
                double z = 1.1;
                int y = (int)z + 2;
                System.out.println(y);
//                can't cast a string to a integer
//         but you can use the reference class to convert a string into a number like so:
            String number3 = "4";
            int c = Integer.parseInt(number3);

            System.out.println(c + 2 +"\n");

//            Math class
                double result3 = Math.random() * 100;
//                 using explicit casting
//                            ⬇
                int test = (int) (Math.random() * 100);
//                Rounding it with Math.round
                System.out.println(test);

                System.out.println(result3);
                System.out.println(Math.round(result3));

//                Formatting numbers
//                classes that are abstract cannot be instantiated
//                 Factory method       ⬇
        String answer = NumberFormat.getPercentInstance().format(0.1);
        System.out.println(answer);


//        Input set up

        Scanner scanner = new Scanner(System.in);
        System.out.print("Name: ");
        String name = scanner.nextLine().trim();
        System.out.println("You are " + name);
    }

}
