import java.util.Scanner;

import javax.swing.JOptionPane;

public class Exercicio01 {
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		float soma = 0;
		String nota;
		float media = 0;
		String nome;
	
		System.out.println("Digite o seu nome:");
		nome = sc.next();
	
		
		for(int contador=0;contador<4;contador++) {
			System.out.println("Digite sua nota:");
			nota = sc.next();
			soma += Float.parseFloat(nota);
		}
		media = soma/4;
		if (media >= 6) {
			System.out.println(nome + ", sua média é: " + media + ", Aprovado!");
		} else {
			System.out.println(nome + ", sua média é: " + media + ", Reprovado");
		}
	}

}