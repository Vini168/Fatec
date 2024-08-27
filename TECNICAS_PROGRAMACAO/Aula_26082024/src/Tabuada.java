import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {

		int tab = 0, result = 0;
		String resposta = "S";

		Scanner sc = new Scanner(System.in);

		while (resposta.equals("S")) {
			System.out.println("Digite a tabuada:");
			tab = sc.nextInt();

			for (int n = 1; n <= 10; n++) {

				result = tab * n;
				System.out.println(tab + "x" + n + "=" + result);
			}

			System.out.println("Deseja continuar? (S/N)");
			resposta = sc.next().toUpperCase();
		}
		sc.close();
	}
}