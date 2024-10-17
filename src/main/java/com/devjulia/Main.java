package com.devjulia;

import java.util.Scanner;

/**
 * Descrição: Uma aplicação de linha de comando que realiza operações básicas como
 * adição, subtração, multiplicação e divisão.
 * Conceitos Abordados: Operadores, controle de fluxo (if/else, switch), entrada e saída de dados.
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Digite a operação que você deseja fazer: ");
            System.out.println("1- Adição");
            System.out.println("2- Subtração");
            System.out.println("3- Multiplicação");
            System.out.println("4- Divisão");
            System.out.println("5- Sair");

            int operacao = scanner.nextInt();

            if (operacao == 5) {
                System.out.println("Encerrando..");
                break;
            }
        }
    }
}
