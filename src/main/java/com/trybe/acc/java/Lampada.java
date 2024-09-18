package com.trybe.acc.java;
import java.util.Locale;
import java.util.Scanner;

public class Lampada {

	public static void main(String[] args) {
			// Seu código aqui
		Scanner scan = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Ligar lampada ? S/N:");
		char valor = scan.next().charAt(0);
		
		boolean isLigada = (valor == 'S');
		
		scan.close();
						
			// Imprime a saída no console. OBS: descomente a próxima linha
		System.out.println("A lampada ligada: " + isLigada + "!");

	}

}
