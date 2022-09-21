package atividade04;

import java.util.Scanner;

/**
 * Exercício 01
 * Dadas as notas dos alunos de uma turma,
 * informe a média da turma.
 * 
 * o programa deverá funcionar da seguinte maneira:
 * 1 - Digite o número de alunos;
 * 2 - Digite a nota de cada um dos alunos;
 * 3 - Informe a média da nota dos alunos.
 */
public class Exercicio01 {
    
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Digite o numero de alunos: ");
        int numberOfStudents = read.nextInt();
        double totalGrades = 0;
        for (int counter = 1; counter <= numberOfStudents; counter++) {
            System.out.printf("Digite a nota do aluno %d: ", counter);
            totalGrades += read.nextDouble();
        }
        double gradeAverage = totalGrades / numberOfStudents;
        System.out.printf("A media da turma eh: %.2f \n",gradeAverage);
    }
    
}
