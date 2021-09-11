/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Carter I. Walker
 */

package org.example;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        //Necessary variable declaration
        Scanner input = new Scanner(System.in);
        int numOne, numTwo;

        System.out.println("What is the first number?");
        numOne = input.nextInt();

        System.out.println("What is the second number?");
        numTwo = input.nextInt();

        System.out.println(numOne + " + " + numTwo + " = " + (numOne+numTwo) + '\n' + numOne + " - " + numTwo + " = " + (numOne-numTwo) + '\n' + numOne + " * " + numTwo + " = " + (numOne*numTwo) + '\n' + numOne + " / " + numTwo + " = " + (numOne/numTwo));
    }
}
