/*
 *  UCF COP3330 Fall 2021 Assignment 17 Solution
 *  Copyright 2021 Blake Baez
 */
package org.example;
import java.util.Scanner;

public class App 
{
        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            System.out.print("Enter a 1 if you are male or a 2 if you are female: ");
            double gender = scan.nextDouble();
            System.out.print("How many ounces of alcohol did you have? ");
            double ounces = scan.nextDouble();
            System.out.print("What is your weight, in pounds? ");
            double pounds = scan.nextDouble();
            System.out.print("How many hours has it been since your last drink? ");
            double hours = scan.nextDouble();

            double r;
            if(gender==1) {
                r = 0.73;
            }
            else {
                r = 0.66;
            }

            double BAC= ounces * 5.14/pounds * r - 0.015 * hours;

            System.out.println("Your BAC is " + BAC);

            if(BAC <= 0.08) {
                System.out.println("It is legal for you to drive.");
            }
            else {
                System.out.println("It is not legal for you to drive.");
            }

        }
    }
