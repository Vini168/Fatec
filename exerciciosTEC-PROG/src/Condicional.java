import java.util.Scanner;

public class Condicional {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int idade;
		String nome;
		
		System.out.println("Digite o seu nome:");
		nome = sc.next();
		
		System.out.println("Digite a sua idade:");
		idade = sc.nextInt();;
		
		if(idade >= 60) {
			System.out.println(nome+", você tem preferencia");
		}
		else if(idade >= 18) {
			System.out.println(nome+", você é adulto, fique na fila");
		}
		else {
			System.out.println(nome+", você é criança, vá para escola");
		}

	}

}
