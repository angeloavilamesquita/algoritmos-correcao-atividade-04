package atividade04;

import java.util.Scanner;

/**
 * Exercício 03
 * Dadas as duas notas de um aluno, informa a sua média.
 * Seu programa deverá forçar o usuário a digitar notas
 * na faixa de 0 a 10.
 */
public class Exercicio03 {
    
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        double firstGrade = 0;
        double secondGrade = 0;
        do  {
            System.out.printf("Digite a primeira nota do aluno: ");
            firstGrade = read.nextDouble();
        } while(firstGrade < 0 || firstGrade > 10);
        do  {
            System.out.printf("Digite a segunda nota do aluno: ");
            secondGrade = read.nextDouble();
        } while(secondGrade < 0 || secondGrade > 10);
        double gradeAverage = (firstGrade + secondGrade) / 2;
        System.out.println("A media do aluno eh: " + gradeAverage);
    }
    
}
