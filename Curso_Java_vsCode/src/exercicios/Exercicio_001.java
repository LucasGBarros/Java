package exercicios;

import java.util.Scanner;

public class Exercicio_001 {
    public static void main (String[] args) {
        System.out.println();
        System.out.printf("faça um programa para ler dois valores inteiros e depois mostre na tela a soma desses números com a mensagem explicativa, conforme exemplos:%n Entrada: 10/30 Saida: SOMA = 40. %n Entrada: 10/-30 Saida: SOMA = -20. %n Entrada: 0/0 Saida: SOMA = 0.%n");
        System.out.println();

        Scanner valor = new Scanner(System.in);
        int x, y, soma;

        x = valor.nextInt();
        y = valor.nextInt();
        soma = x + y;

        System.out.printf("A soma entre %d e %d é de: " + soma, x, y);
        valor.close();
    }
    
}
