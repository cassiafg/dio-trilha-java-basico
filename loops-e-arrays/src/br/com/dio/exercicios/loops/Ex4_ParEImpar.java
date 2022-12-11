package br.com.dio.exercicios.loops;
/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
*/

import java.util.Scanner;

public class Ex4_ParEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantNumeros;
        int numero;
        int quantPares = 0, quantImpares = 0;

        System.out.println("Quantos números você quer digitar?");
        quantNumeros = scan.nextInt();

        int count = 0;
        do{
            System.out.println("Digite um número: ");
            numero = scan.nextInt();

            if (numero % 2 == 0) quantPares++;
            else quantImpares++;

            count++;

        }while(count < quantNumeros);

        System.out.println("Quantidade de números pares: " + quantPares);
        System.out.println("Quantidade de números ímpares: " + quantImpares);
    }
}
