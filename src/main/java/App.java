/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  Copyright 2021 William Zheng
 */

import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();
        String Num1 = myApp.readAmount();
        String state= myApp.readState();
        double taxRate = 0.055;
        double subtotal = Double.parseDouble(Num1);
        double tax = myApp.calcTax(state, subtotal, taxRate);
        double finalTotal = myApp.calcFinalTotal(tax, subtotal);
        String outputString = myApp.generateOutputString(subtotal, tax, finalTotal);
        myApp.printOutput(outputString);
    }

    public void printOutput(String outputString) {
        System.out.println(outputString);
    }

    public String readAmount(){
        System.out.print("What is the order amount? ");
        return in.nextLine();
    }

    public String readState(){
        System.out.print("What is the state? ");
        return in.nextLine();
    }

    public double calcTax(String state, double subtotal, double taxRate){
        if (state.equals("WI")){
            return subtotal * taxRate;
        }
        return 0;
    }

    public double calcFinalTotal(double tax, double subtotal){
        return tax + subtotal;
    }

    public String generateOutputString(double subtotal, double tax, double finalTotal){
        return String.format("The subtotal is $%.2f.\nThe tax is $%.2f.\nThe total is $%.2f.", subtotal, tax, finalTotal);
    }
}
