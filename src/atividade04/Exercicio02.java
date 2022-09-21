package atividade04;

import java.util.Scanner;

/**
 * Exercício 02
 * Dados um capital, uma taxa de juros mensal e um
 * período em meses, informe o montante ao final de
 * cada mês.
 * 
 * O programa deverá funcionar da seguinte maneira:
 * 1 - Digite o capital;
 * 2 - Digite a taxa de juros;
 * 3 - Digite o período;
 * 4 - Exiba mês a mês o montante.
 */
public class Exercicio02 {
    
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Digite o capital: ");
        double capital = read.nextDouble();
        System.out.print("Digite a taxa de juros mensal: ");
        double fees = read.nextDouble();
        System.out.print("Digite o periodo em meses: ");
        int period = read.nextInt();
        int counter = 1;
        double amount = capital;
        while (counter <= period) {
            double yield = amount * (fees / 100);
            amount += yield;
            System.out.printf("Montante no mes %d: %.2f \n", counter, amount);
            counter++;
        }   
    }
    
}
