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


            System.out.println("Digite o primeiro número: ");
            int primeiroNumero = scanner.nextInt();

            System.out.println("Digite o segundo número: ");
            int segundoNumero = scanner.nextInt();

            switch (operacao) {
                case 1:
                    int respostaAdicao = primeiroNumero + segundoNumero;
                    System.out.println("A resposta de " + primeiroNumero + " + " + segundoNumero + " é: " + respostaAdicao);
                    break;
                case 2:
                    int respostaSubtracao = primeiroNumero - segundoNumero;
                    System.out.println("A resposta de " + primeiroNumero + " - " + segundoNumero + " é: " + respostaSubtracao);
                    break;
                case 3:
                    int respostaMultiplicação = primeiroNumero * segundoNumero;
                    System.out.println("A resposta de " + primeiroNumero + " * " + segundoNumero + " é: " + respostaMultiplicação);
                    break;
                case 4:
                    if (segundoNumero != 0) {
                        int respostaDivisao = primeiroNumero / segundoNumero;
                        System.out.println("A resposta de " + primeiroNumero + " / " + segundoNumero + " é: " + respostaDivisao);
                        break;
                    } else {
                        System.out.println("Não é permitido divisão por 0.");
                    }
                default:
                    System.out.println("Operação inválida.");
            }
        }
        scanner.close();

    }
}