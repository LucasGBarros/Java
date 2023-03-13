package curso;
import java.util.Locale;

public class Curso {

	public static void main(String[] args) { 
		
/* --------- Operadores aritméticos ----------
 * + Adição
 * - Subtração
 * * Multiplicação
 * / Divisão
 * % Resto da divisão ("mod")
 * 
 * Precedencia 1° lugar: * / %
 * 			   2° lugar: + -	
 */

/* --------- Variaveis -----------
 * Uma variavel é uma porção de memória (RAM) utilizada para amarzenar dados durante a execução dos programas
 * 
 * Declaração de variavel
 * Exemplo:
 * 
 * 	Sintaxe:
 * 		
 * 	<tipo> <nome> = <valor inicial>;
 * 						opcional
 * 
 * Melhor forma para declarar variavel é utilizando camel case ( EX: salarioDoFuncionario )
 * 
 * Exemplo: 
 * 
 * int idade = 25;			Memória RAM = 25 -> Idade
 * double altura = 1.68;
 * char sexo = 'F';
 *
 * -------- Tipos primitivos em Java --------
 * 
 * Tipos numéricos inteiros:
 * 
 * BYTE 
 * SHORT
 * INT
 * LONG
 * 
 * Tipos Ponto Flutuantes:
 *
 * FLOAT
 * DOUBLE
 * 
 * Caracteres Unicode:
 * 
 * CHAR = tipo de dados para armazenar um único caracter
 * 
 * Valor Verdade ou Falso:
 * 
 * BOOLEAN
 * 
 * -------------------------------------------
 * 
 * STRING - CADEIA DE CARACTERES (PALAVRAS OU TEXTO)
 */
		int y = 32;
		double x = 10.35784;

		System.out.println(y);
		System.out.println(x);

		System.out.printf("%.2f%n", x); // Para limitar as casas decimais, será utilizado método PRINTF
		// "%n" representa a quebra de linha

		// Outro exemplo utilizando 4 casas decimais:
		System.out.printf("%.4f%n", x);

		Locale.setDefault(Locale.US);
		System.out.printf("%.4f%n", x); // Imprimindo com a Localização USA (Utilizando formatação Americana)
		
		System.out.println("Olá mundo!");

		// ------------------------------------------------------------------------------------------------------------
		String nome = "Maria";
		int idade = 58;
		double renda = 4500.0;
		int parede = 21;
		double chao = 25.7851;

		/* --------------- MARCADORES --------------

		 * %f = Pontos Flutoantes (Float ou Double)
		 * %d = Inteiro (BYTE, SHORT, INT, LONG)
		 * %s = texto (String)
		 * %n = quebra de linha
		 * 
		 * ------------------------------------------
		 */

		System.out.printf("%s tem %d anos, em seu trabalho, tem uma renda fixa de R$ %.2f! Em sua casa, sua parede tem " + parede + " metros e de terreno tem mais de %.2fm²%n", nome, idade, renda, chao);

		// ------------ Utilizando nomes de Variaveis para calculos -------------
		System.out.println("----------------------------------------------------------------------");
		
		int i;
		int u;
		
		i = 5;
		u = 2 * i;

		System.out.println(i);
		System.out.println(u);

		System.out.println("----------------------------------------------------------------------");

		int p;
		double r;

		p = 5;
		r = 2 * p;

		System.out.println(p);
		System.out.println(r);

		System.out.println("----------------------------------------------------------------------");

		double b, B, h, area;

		// Mesmo sendo flutuante (double), sempre é bom idnicar os números atribuidos em flutante, mesmo que nao tenha casas decimais
		// para DOUBLE ".0"
		// para FLOAT "f" Ex: b = 6f
		b = 6.0;
		B = 8.0;
		h = 5.0;
		
		area = (b + B) / 2.0 * h;

		System.out.println(area);

		System.out.println("----------------------------------------------------------------------------");

		int a, c;
		double resultado;

		a = 5;
		c = 2;

		// resultado = a / c; Deve retornar "2,5", porém, como a variavel A e C estão no tipo inteiro, não será feito a divisão em numeros flutuantes 

		resultado = (double) a / c;

		System.out.println(resultado);

		System.out.println("----------------------------------------------------------------------------");

		double g;
		int k;

		g = 5.0;
		k = (int) g; // para transformar a variavel K em tipo double para inteiro, basta colocar antes (INT) 
					 // CASTING

		System.out.println(k);
	}

}
