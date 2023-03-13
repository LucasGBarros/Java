package aulas;

public class Funcoes_Matemáticas {
    public static void main (String[] args) {
        
        /*Funções Matemáticas em JAVA
         * 
         * A = Math.sqrt(x);         > Variavel A recebe a raiz quadrada de X.
         * A = Math.pow(x, y);       > Variavel A recebe o resultado de X elevado ao Y.
         * A = Math.abs(x);          > Variavel A recebe o valor absoluto de X
         */

         double x = 3.0;
         double y = 4.0;
         double z = -5.0;
         double A, B, C;

         A = Math.sqrt(x);
         B = Math.sqrt(y);
         C = Math.sqrt(25.0);

         System.out.println("Raiz Quadradada de " + x + " = " + A);
         System.out.println("Raiz Quadradada de " + y + " = " + B);
         System.out.println("Raiz Quadradada de 25 = " + C);

         System.out.println("================================================================");

         A = Math.pow(x, y);
         B = Math.pow(x, 2.0);
         C = Math.pow(5.0, 2.0);

         System.out.println(x + " Elevado a " + y + " = " + A);
         System.out.println(x + " Elevado ao quadrado = " + B);
         System.out.println("5 Elevado ao quadrado = " + C);

         System.out.println("================================================================");

         A = Math.abs(y);
         B = Math.abs(z);

         System.out.println("Valor absoluto de " + y + " = " + A);
         System.out.println("Valor absoluto de " + z + " = " + B);

    }
}
