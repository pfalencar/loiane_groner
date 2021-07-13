package com.loiane.cursojava.aula63.printf;

public class ExemploPrintf {

	public static void main(String[] args) {

		System.out.printf("%s", "Olá, Mundo!"); // saída de String
		System.out.println();
		System.out.printf("%S", "Olá, Mundo!"); // toda a String em caixa alta
		System.out.println();

		System.out.printf("%c", 'c'); // um único caractere
		System.out.println();
		System.out.printf("%C", 'c'); // um único caractere em caixa alta

		System.out.printf("%n"); // serve só pra pular a linha, usar no lugar de \n, como boa prática

		int valor = 123456789;
		System.out.printf("%d", valor); // regex para imprimir número inteiro

		System.out.println();

		double pontoFlutuante = 3.14153892873;
		System.out.printf("%f", pontoFlutuante); // regex para imprimir número com vírgula (ele arredonda)

		System.out.println();

		String olaMundo = "Olá, Mundo!";
		System.out.printf("%20s", olaMundo); // tamanho total da String: 20 caracteres, alinhado à direita

		System.out.println();

		System.out.printf("%-20s", olaMundo); // tamanho total da String: 20 caracteres, alinhado à esquerda

		System.out.println();

		System.out.printf("%+d", valor); // força o método a imprimir o sinal do número seja positivo ou negativo.

		System.out.println();

		System.out.printf("%015d", valor); // tem que ter 15 dígitos. Complete com 0 antes do número.
		
		System.out.println();

		System.out.printf("%,d", valor); // separa os milhares com vírgula (se o pc der erro, use o ponto)
		
		System.out.println();
		
		int valor2 = -123456789;
		System.out.printf("% d", valor2); //imprime o sinal junto ao número. Se o número for negativo, IMPRIME o sinal.
		System.out.println();
		System.out.printf("% d", valor); //imprime o sinal junto ao número. Se o número for positivo, NÃO IMPRIME o sinal, mas imprime um espaço antes
		
		System.out.println();
		
		System.out.printf("%.3f", pontoFlutuante); // imprime com 3 casas decimais depois da vírgula (ele arredonda)
		
		System.out.println();
		
		System.out.printf("%.2f", pontoFlutuante); // imprime com 2 casas decimais depois da vírgula (ele arredonda)

		System.out.println();
		
		System.out.printf("R$%10.2f", pontoFlutuante); //10 dígitos depois do R$. E com 2 casas depois da vírgula.
		
		System.out.println();
		
		testeMaisCompleto();
	}
	
	private static void testeMaisCompleto() {
		
		double[] precos = {10000, 123.54, 7892.387, 1, 4.5321};
		
		for (int i = 0; i < precos.length; i++) {
			System.out.printf("%s %02d: total de R$%,10.2f%n", "Item", i+1, precos[i]);
		}
		
//		Java.util.Formatter  //como se usa as formatações na vida real.
		
		//o printf é apenas um atalho para o format. Pode usar qualquer um dos dois.
//		System.out.printf("formato-string", [arg1, arg2, arg3]); 
//		System.out.format("formato-string", [arg1, arg2, arg3]);
		
		//"formato-string" 
		// %[flags] [largura] [.precisao] caractere-de-conversao
		// [] é opcional
		
		
		
	}

}
