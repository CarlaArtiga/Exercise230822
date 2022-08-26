/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia1poo1.ejercicio;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class POO {
    private int num1 = 0;
    private int num2 = 0;
    private int num3 = 0;
    private Scanner reader = new Scanner(System.in);
    private int Smallest = 0;
    private int Greatest = 0;
    private int Adittion = 0;
    private int Subtract = 0;

    public POO() {
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getNum3() {
        return num3;
    }

    public void setNum3(int num3) {
        this.num3 = num3;
    }

    public int getSmallest() {
        return Smallest;
    }

    public void setSmallest(int Smallest) {
        this.Smallest = Smallest;
    }

    public int getGreatest() {
        return Greatest;
    }

    public void setGreatest(int Greatest) {
        this.Greatest = Greatest;
    }

    public int getAdittion() {
        return Adittion;
    }

    public void setAdittion(int Adittion) {
        this.Adittion = Adittion;
    }

    public int getSubtract() {
        return Subtract;
    }

    public void setSubtract(int Subtract) {
        this.Subtract = Subtract;
    }
    
    
    
     public void AskNumbers(){
         System.out.print("Type the first number: ");
         num1 = reader.nextInt();
         System.out.print("Type the second number: ");
         num2 = reader.nextInt();
         System.out.print("Type the third number: ");
         num3 = reader.nextInt();
     }
     public void MultipleFive(){
         if(num1%5 == 0){
             System.out.println(num1 + " is multiple of five");
         }
         else{
             System.out.println("None of the numbers are multiple of five");
         }
         if(num2%5 == 0){
             System.out.println(num2 + " is multiple of five");
         }
         else{
             System.out.println("None of the numbers are multiple of five");
         }
         if(num3%5 == 0){
             System.out.println(num3 + " is multiple of five");
         }
         else{
             System.out.println("None of the numbers are multiple of five");
         }
     }
    
    
    public void GreatestNum(){
        if(num1 == num2 || num1 == num3 || num2 ==num1 || num2 == num3 || num3==num1 || num3==num2){
            System.out.println("Type different numbers");
            System.exit(0);
        }
        if(num1 > num2 && num1 > num3){
            System.out.println(num1 + " is the greatest");
            Greatest = num1;
            
        }
        if(num2 > num1 && num2 > num3){
            System.out.println(num2 + " is the greatest");
            Greatest = num2;
            
        }
        if(num3 > num1 && num3 > num2){
            System.out.println(num3 + " is the greatest");
            Greatest = num3;
            
        }
         
    }
    public void Smallest(){
        if(num1 == num2 || num1 == num3 || num2 ==num1 || num2 == num3 || num3==num1 || num3==num2){
            System.out.println("Type different numbers");
            System.exit(0);
        }
        if(num1 < num2 && num1 < num3){
            System.out.println(num1 + " is the smallest");
           Smallest = num1;
           
        }
        if(num2 < num1 && num2 < num3){
            System.out.println(num2 + " is the smallest");
            Smallest = num2;
             
        }
        if(num3 < num1 && num3 < num2){
            System.out.println(num3 + " is the smallest");
            Smallest = num3;
             
        }
    }
    public void PlusTen(){
        if(Smallest > 10){
            Adittion = Greatest + 10;
            System.out.println(Greatest + " + " + " 10 " + " = " + Adittion);
        }
    }
    public void SubtractFive(){
        if(Greatest < 50){
            Subtract = Smallest - 5;
            System.out.println(Smallest + " - " + " 5 " + " = " + Subtract);
        }
    }
    
}
