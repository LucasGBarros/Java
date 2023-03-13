package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_002 {
    public static void main(String[] args) {
        System.out.printf("%nFaça um programa que leia o valor do raio em um círculo e depois mostre o valor da área deste círculo com quatro casas decimais conforme exemplo. %n%n Formula: area = TT . raio² %n Considete o valor de TT = 3.14159%n%n");
        Locale.setDefault(Locale.US);

        Scanner valor = new Scanner(System.in);

        double area = 3.14159, x, circulo, A;
        x = valor.nextDouble();
        A = Math.pow(x, 2.0);
        circulo = area * A;

        System.out.printf("O valor do circulo é de: %.4f%n", circulo);

        valor.close();
    }
}
