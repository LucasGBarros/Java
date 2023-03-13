package aulas;
import java.util.Locale;
import java.util.Scanner;

public class Entrada_dados {
    public static void main (String[] args) {

        System.out.println(("------------------------- ENTRADA DE DADOS -------------------------------"));
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in); // Função onde o Usuário poderá digitar um valor para guardar na Variavel

        String x;

        x = sc.next(); // essa variavel vai permitir que eu digite uma palavra e sera armazenada dentro da variavel X
        System.out.println("Você digitou: " + x);

        System.out.println("-------------------------------------------------------------------------");

        int c;

        c = sc.nextInt();
        System.out.println("Você digitou um valor inteiro: " + c);

        System.out.println("-------------------------------------------------------------------------");

        double d;

        d = sc.nextDouble();
        System.out.printf("Você digitou um valor double: %.2f%n", d);

        System.out.println("-------------------------------------------------------------------------");

        char cc;

        cc = sc.next().charAt(0); // a função do charAt(0), pega o primeiro caractere das palavras inseridas
        System.out.println("Você digitou um caractere: " + cc);

        System.out.println("-------------------------------------------------------------------------");

        // Digitandos todos os dados na mesma linha com espaço: 

        String t;
        int r;
        double z;

        t = sc.next();
        r = sc.nextInt();
        z = sc.nextDouble();

        System.out.println("Dados Digitados:");
        System.out.println(t);
        System.out.println(r);
        System.out.println(z);

        sc.close();

        System.out.println("-------------------------------------------------------------------------");

        Scanner a = new Scanner(System.in);

        String s1, s2, s3;

        s1 = a.nextLine();
        s2 = a.nextLine();
        s3 = a.nextLine();

        System.out.println("Dados Digitados:");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        a.close();

        System.out.println("-------------------------------------------------------------------------");

        Scanner rc = new Scanner(System.in);

        int f;
        String a1, a2, a3;

        f = rc.nextInt();
        rc.nextLine();
        a1 = rc.nextLine();
        a2 = rc.nextLine();
        a3 = rc.nextLine();

        System.out.println("Dados Digitados:");
        System.out.println(f);
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);

        rc.close();
        /*Quando utilizamos uma leitura diferente do NextLine e dá alguma quebra de linha
         * fica "pendente" na entrada padrão, sendo assim, deixando o campo da variavel vazia.
         * Obrigando assim, inserir um novo nextLine
         */

    } 
}
