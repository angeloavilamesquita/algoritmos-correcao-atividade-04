package atividade04;

import java.util.Scanner;

/**
 * Exercício 04
 * Crie um programa que exiba um menu com as seguintes opções:
 * 1 - Somar
 * 2 - Subtrair
 * 3 - Multiplicar
 * 4 - Dividir
 * 5 - Sair
 * 
 * Após a escolha da opção, o usuário deve fornecer 2 números
 * e o programa deve mostrar o resultado da operação
 */
public class Exercicio04 {
    
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int option = 0;
        double firstNumber, secondNumber;
        do {
            System.out.println("=========================");
            System.out.println("Calculadora ADS 2022/2");
            System.out.println("1 - Somar");
            System.out.println("2 - Subtrair");
            System.out.println("3 - Multiplicar");
            System.out.println("4 - Dividir");
            System.out.println("5 - Sair");
            System.out.println("=========================");
            System.out.print("Digite a opcao desejada: ");
            option = read.nextInt();
            switch (option) {
                case 1 -> {
                    System.out.println("SOMA");
                    System.out.print("Digite o primeiro numero: ");
                    firstNumber = read.nextDouble();
                    System.out.print("Digite o segundo numero: ");
                    secondNumber = read.nextDouble();
                    System.out.printf("Total = %.2f \n", (firstNumber + secondNumber));
                }
                case 2 -> {
                    System.out.println("SUBTRACAO");
                    System.out.print("Digite o primeiro numero: ");
                    firstNumber = read.nextDouble();
                    System.out.print("Digite o segundo numero: ");
                    secondNumber = read.nextDouble();
                    System.out.printf("Total = %.2f \n", (firstNumber - secondNumber));
                }
                case 3 -> {
                    System.out.println("MULTIPLICACAO");
                    System.out.print("Digite o primeiro numero: ");
                    firstNumber = read.nextDouble();
                    System.out.print("Digite o segundo numero: ");
                    secondNumber = read.nextDouble();
                    System.out.printf("Total = %.2f \n", (firstNumber * secondNumber));
                }
                case 4 -> {
                    System.out.println("DIVISAO");
                    System.out.print("Digite o primeiro numero: ");
                    firstNumber = read.nextDouble();
                    System.out.print("Digite o segundo numero: ");
                    secondNumber = read.nextDouble();
                    System.out.printf("Total = %.2f \n", (firstNumber / secondNumber));
                }
                case 5 -> {
                    System.out.println("Saindo...");
                }
                default -> System.out.println("Opcao Invalida!");
            }
        } while (option != 5);
    }
}
