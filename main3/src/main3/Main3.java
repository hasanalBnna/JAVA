/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main3;

import java.util.Scanner;
import java.util.Stack;

public class Main3
{

public static void main(String[] args)
{
Stack<Float> stack = new Stack<Float>(); //to create our stack
stack.push(1.1f);
stack.push(2.1f);
stack.push(3.1f);
stack.push(4.1f);
stack.push(5.1f); //added 5 values to the stack using push() function

Scanner sc = new Scanner(System.in); //to read user input
boolean quit = false; //to set condition for loop

while(!quit) //quit will be set true once the user wants to exit
{
System.out.println("=======================================================");
System.out.println("Please Enter Choice as followed : \n" +
"1 -> Enter element at top of stack\n" +
"2 -> Remove element from top of stack\n" +
"3 -> Print the top element of stack\n" +
"4 -> Exit"); //printing choices to the user
int choice; //reading user input
choice = sc.nextInt();
sc.nextLine();
switch(choice) //checking value of user input
{
case 1 : //1 means add a value to top of stack
System.out.print("Please Enter float value to insert : ");
float item = sc.nextFloat(); //take value from user
sc.nextLine();
stack.push(item); //add the value to stack
break;
case 2 : //2 means remove value from top of stack
if(stack.empty()) //to check if stack is empty
System.out.println("Stack is already empty!");
else //if stack is not empty remove one element from the top
System.out.println(stack.pop() + " has been removed");
break;
case 3 : //3 means print value at top of stack
if(stack.empty()) //to check if stack is empty
System.out.println("Stack is empty! No item to display.");
else //if stack is not empty, print the value at top
System.out.println("Top element of stack is : " + stack.peek());
break;
case 4 : //4 means exit and we will set quit to true here to exit the program
quit = true;
break;
default : //if none of the above choices entered means user entered invalid input
System.out.println("Invalid Choice!");
}
System.out.println("=======================================================");
}
}
}
