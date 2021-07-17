package com.loiane.cursojava.aula57.wrappers;

public class TesteWrapper {

	public static void main(String[] args) {
		
		short num1 = 1;
		byte num2 = 10;
		int num3 = 100;
		long num4 = 100000l;
		float num5 = 3.5f;
		double num6 = 3.5555;
		boolean flag = true;
		char a = 'a';
		
		Short num7 = new Short((short) 1);
		Byte num8 = new Byte((byte) 10);
		Integer num9 = new Integer(10);
		Long num10 = new Long(10000l);
		Float num11 = new Float(3.5f);
		Double num12 = new Double(3.555);
		Boolean flag2 = new Boolean(true);
		Character b = new Character('b');
		
		Integer num13 = new Integer("101");		
		Double num14 = new Double("3.5");
		
		System.out.println(num13.intValue());
		System.out.println(num8.longValue());
		System.out.println(num12.intValue());
		
		System.out.println(num13.shortValue());
		
		Long num15 = num13.longValue();
		
		
		
		try {
			System.out.println(converterStringParaInt("83h") + num15);
		} catch(NumberFormatException e) {
			e.printStackTrace();
		}
		System.out.println("Chegou aqui!");
		System.out.println("Continuando o programa...");
		System.out.println("lalaalal");
		
		
	}
	
	public static int converterStringParaInt(String numString) throws NumberFormatException{
		int num16 = Integer.parseInt("83h");
		return num16;
	}

}
