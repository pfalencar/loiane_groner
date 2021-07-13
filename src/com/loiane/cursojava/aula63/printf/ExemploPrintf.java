package com.loiane.cursojava.aula63.printf;

public class ExemploPrintf {

	public static void main(String[] args) {

		System.out.printf("%s", "Ol�, Mundo!"); // sa�da de String
		System.out.println();
		System.out.printf("%S", "Ol�, Mundo!"); // toda a String em caixa alta
		System.out.println();

		System.out.printf("%c", 'c'); // um �nico caractere
		System.out.println();
		System.out.printf("%C", 'c'); // um �nico caractere em caixa alta

		System.out.printf("%n"); // serve s� pra pular a linha, usar no lugar de \n, como boa pr�tica

		int valor = 123456789;
		System.out.printf("%d", valor); // regex para imprimir n�mero inteiro

		System.out.println();

		double pontoFlutuante = 3.14153892873;
		System.out.printf("%f", pontoFlutuante); // regex para imprimir n�mero com v�rgula (ele arredonda)

		System.out.println();

		String olaMundo = "Ol�, Mundo!";
		System.out.printf("%20s", olaMundo); // tamanho total da String: 20 caracteres, alinhado � direita

		System.out.println();

		System.out.printf("%-20s", olaMundo); // tamanho total da String: 20 caracteres, alinhado � esquerda

		System.out.println();

		System.out.printf("%+d", valor); // for�a o m�todo a imprimir o sinal do n�mero seja positivo ou negativo.

		System.out.println();

		System.out.printf("%015d", valor); // tem que ter 15 d�gitos. Complete com 0 antes do n�mero.
		
		System.out.println();

		System.out.printf("%,d", valor); // separa os milhares com v�rgula (se o pc der erro, use o ponto)
		
		System.out.println();
		
		int valor2 = -123456789;
		System.out.printf("% d", valor2); //imprime o sinal junto ao n�mero. Se o n�mero for negativo, IMPRIME o sinal.
		System.out.println();
		System.out.printf("% d", valor); //imprime o sinal junto ao n�mero. Se o n�mero for positivo, N�O IMPRIME o sinal, mas imprime um espa�o antes
		
		System.out.println();
		
		System.out.printf("%.3f", pontoFlutuante); // imprime com 3 casas decimais depois da v�rgula (ele arredonda)
		
		System.out.println();
		
		System.out.printf("%.2f", pontoFlutuante); // imprime com 2 casas decimais depois da v�rgula (ele arredonda)

		System.out.println();
		
		System.out.printf("R$%10.2f", pontoFlutuante); //10 d�gitos depois do R$. E com 2 casas depois da v�rgula.
		
		System.out.println();
		
		testeMaisCompleto();
	}
	
	private static void testeMaisCompleto() {
		
		double[] precos = {10000, 123.54, 7892.387, 1, 4.5321};
		
		for (int i = 0; i < precos.length; i++) {
			System.out.printf("%s %02d: total de R$%,10.2f%n", "Item", i+1, precos[i]);
		}
		
//		Java.util.Formatter  //como se usa as formata��es na vida real.
		
		//o printf � apenas um atalho para o format. Pode usar qualquer um dos dois.
//		System.out.printf("formato-string", [arg1, arg2, arg3]); 
//		System.out.format("formato-string", [arg1, arg2, arg3]);
		
		//"formato-string" 
		// %[flags] [largura] [.precisao] caractere-de-conversao
		// [] � opcional
		
		
		
	}

}
