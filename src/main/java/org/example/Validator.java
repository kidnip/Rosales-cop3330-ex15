package org.example;

import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Jeremy Rosales
 */
public class Validator
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        Password word = new Password();
        String phrase;

        System.out.print("What is the password? ");
        phrase = input.next();

        if(phrase.equals(word.getKey())){
            System.out.println("Welcome!");
        }
        else {
            System.out.println("I don't know you.");
        }
    }
}
