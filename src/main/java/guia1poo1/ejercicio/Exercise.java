/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package guia1poo1.ejercicio;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;

public class Exercise {

    static POO exercise = new POO();

    static int menu() {
        Scanner reader = new Scanner(System.in);
        int opc = 0;
        System.out.println("1. Type the numbers");
        System.out.println("2. Get the greatest number");
        System.out.println("3. Type the smallest number");
        System.out.println("4. Get the multiple of 5");
        System.out.println("5. Get the adittion");
        System.out.println("6. Get the subtract");
        System.out.print("Please type an option: ");

        return opc;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("***Program that evaluates three numbers***");
        System.out.println("");

        int op = menu();
        do {
            System.out.flush();
            op = reader.nextInt();
            switch (op) {
                case 1:
                    System.out.println("");
                    exercise.AskNumbers();
                    break;
                case 2:
                    System.out.println("");
                    exercise.GreatestNum();
                    break;
                case 3:
                    System.out.println("");
                    exercise.Smallest();
                    break;
                case 4:
                    System.out.println("");
                    exercise.MultipleFive();
                    break;
                case 5:
                    System.out.println("");
                    exercise.PlusTen();
                    break;
                case 6:
                    System.out.println("");
                    exercise.SubtractFive();
                    break;
                default:
                    System.out.println("");
                    System.out.println("Option not defined");
                    System.exit(0);
                    break;

            }
            reader.nextLine();
        } while (op != 6);

    }
}
