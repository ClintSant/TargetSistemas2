/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.targetsistemas2;

import java.util.Scanner;

/**
 *
 * @Clinton Gonçalves dos Santos
 */
public class TargetSistemas2 {

    private static String originalString;

    public static void main(String[] args) {
        questão1();
        questão2();
        questão3();
    }

    public static void questão1() {
         System.out.println("\n#### Programa 1  #### \n");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Olá, vamos calcular se um número pertence ou não pertence a sequência de Fibonacci?\n\n");
        System.out.print("Para descobrirmos,informe um número: ");
        int num = scanner.nextInt();

        if (num == 0 || num == 1) {
            System.out.println("O número " + num + " pertence à sequência de Fibonacci.");

        } else {
            long a = 0, b = 1, c = 1;

            while (c < num) {
                c = a + b;
                a = b;
                b = c;
            }
            if (num == c) {
                System.out.println("O número " + num + " pertence à sequência de Fibonacci.");
            } else {
                System.out.println("O número " + num + " NÃO pertence à sequência de Fibonacci.");
            }
        }
    }

    public static void questão2() {
        
        System.out.println("\n#### Programa 2 ####\n ");

        

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite uma palavra: ");

            String texto = scanner.nextLine();

            int contador = 0;

            for (int i = 0; i < texto.length(); i++) {
                char caractere = texto.charAt(i);

                if (caractere == 'a' || caractere == 'A' || caractere == 'ã' || caractere == 'Ã' || caractere == 'â' || caractere == 'Â' || caractere == 'á' || caractere == 'Á') {
                    contador++;

                }
            }
            System.out.println("A letra 'a' ou 'A' aparece " + contador + " vezes na palavra digitada.");
        }

    }

    public static void questão3() {

         System.out.println("\n#### Programa 3 #### \n");

        int INDICE = 12;
        int SOMA = 0;
        int K = 1;

        while (K < INDICE) {
            K = K + 1;
            SOMA = SOMA + K;
        }
        System.out.println("O resultado da nossa somatória e ou função matemática é: " + SOMA);
    }

}
