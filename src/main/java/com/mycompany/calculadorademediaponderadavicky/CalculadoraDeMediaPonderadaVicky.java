/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadorademediaponderadavicky;

import java.util.Scanner;

public class CalculadoraDeMediaPonderadaVicky {

    public static void main(String[] args) {

        int totalAlunos = 0;
        double somaMediasTurma = 0.0;

        Scanner scanner = new Scanner(System.in);

        System.out.println(".•°•.CALCULADORA DE MÉDIA PONDERADA .•°•.");

        while (true) {

            System.out.print("\n -> Digite o nome do aluno (ou -1 para encerrar): ");
            String nome = scanner.nextLine();

            if (nome.equals("-1")) {
                break;
            }

            System.out.print(" -> Digite a nota do 1º Bimestre (peso 2): ");
            double nota1 = scanner.nextDouble();

            System.out.print(" -> Digite a nota do 2º Bimestre (peso 3): ");
            double nota2 = scanner.nextDouble();

            scanner.nextLine();

            double mediaPonderada = (nota1 * 2 + nota2 * 3) / 5.0;

            somaMediasTurma += mediaPonderada;
            totalAlunos++;

            System.out.printf(" -> Média de %s: %.2f\n", nome, mediaPonderada);
        }

        System.out.println("\n--------------------------------------");
        System.out.println(" -> RESUMO FINAL DA TURMA:");
        System.out.println(" -> Total de alunos cadastrados: " + totalAlunos);

        if (totalAlunos > 0) {

            double mediaGeral = somaMediasTurma / totalAlunos;

            System.out.printf(" -> Média geral da turma: %.2f\n", mediaGeral);

        } else {

            System.out.println(" -> Nenhum aluno foi cadastrado.");
        }

        scanner.close();
    }
}
