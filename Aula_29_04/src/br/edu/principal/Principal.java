package br.edu.principal;
import java.util.Scanner;
public class Principal {
	public static void Soma( int x, int y) {
		System.out.println("Resultado Da Soma: " + (x + y));
		}
	public static void subtração( int x, int y) {
		System.out.println("Resultado Da Subtração: " + (x - y));
		}
	public static void divisao( int x, int y) {
		System.out.println("Resultado Da Divisão: " + (x / y));
		}
	public static void multiplicação( int x, int y) {
		System.out.println("Resultado Da Multiplicação: " + (x * y));
		}
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Digite o primeiro numero: ");
		int x = sc.nextInt();
		System.out.println("Digite o segundo numero: ");
		int y = sc.nextInt();
	
		Soma(x,y);
		subtração(x,y);
		divisao(x,y);
		multiplicação(x,y);
}
}

