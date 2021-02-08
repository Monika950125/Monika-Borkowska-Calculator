package com.calculator;

public class Calculator {
  private double variableA;
  private double variableB;


  public double getVariableA() {
    return variableA;
  }
    public double getVariableB() {
      return variableB;
    }
    public void addition () {
      double total = this.variableA + this.variableB;
      System.out.println("The result is " + total);
    }

    public void subtraction () {
      double difference = this.variableA - this.variableB;
    }


    public static void main (String[]args){
      Calculator calculator = new Calculator();
      calculator.addition();
    }
  }