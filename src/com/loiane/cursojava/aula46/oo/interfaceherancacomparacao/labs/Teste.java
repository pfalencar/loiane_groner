package com.loiane.cursojava.aula46.oo.interfaceherancacomparacao.labs;

public class Teste {

	public static void main(String[] args) {
		
		Quadrado quadrado = new Quadrado(2);
		quadrado.setNome("Quadrado");

		Circulo circulo = new Circulo(2);
		circulo.setNome("Círculo");			
		
		Triangulo triangulo = new Triangulo(3, 2);
		triangulo.setNome("Triângulo");
		
		Cubo cubo = new Cubo(3);
		cubo.setNome("Cubo");
		
		Cilindro cilindro = new Cilindro(2, 3);
		cilindro.setNome("Cilindro");
		
		Piramide piramide = new Piramide(2, 3, quadrado);
		piramide.setNome("Pirâmide");
		
		
		FiguraGeometrica[] figuras = new FiguraGeometrica[6];
		figuras[0] = circulo;
		figuras[1] = quadrado;
		figuras[2] = triangulo;
		figuras[3] = cubo;
		figuras[4] = cilindro;
		figuras[5] = piramide;
		for (FiguraGeometrica fg : figuras) {
			System.out.println("----------------------------------");
			System.out.println(fg.getNome());
			
			if (fg instanceof Figura2D) {
				Figura2D f2d = (Figura2D) fg;
				System.out.println(f2d.calcularArea());
			}
			if (fg instanceof Figura3D) {
				Figura3D f3d = (Figura3D) fg;
				System.out.println(f3d.calcularArea());
				System.out.println(f3d.calcularVolume());
			}
		}
	}

}
