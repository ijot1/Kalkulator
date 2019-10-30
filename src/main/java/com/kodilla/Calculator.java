package com.kodilla;

public class Calculator {
    private int firstNumber;
    private int secondNumber;


    public Calculator(int i1, int i2) {
        firstNumber = i1;
        secondNumber = i2;
    }

    public int getFirstNumber() {
        return firstNumber;
    }

    public int getSecondNumber() {
        return secondNumber;
    }

    public int addNumbers() {
        int sum = firstNumber + secondNumber ;
        return sum;
    }

    public int multiplyNumbers() {
        int product = firstNumber * secondNumber;
        return product;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator(2, 3);
        System.out.println(calculator.addNumbers());
        System.out.println(calculator.multiplyNumbers());
    }
}
