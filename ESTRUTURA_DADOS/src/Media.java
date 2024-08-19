import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double v1, v2, media;
		
		System.out.println("Digite o 1ª valor:");
		v1 = sc.nextDouble();
		
		System.out.println("Digite o 2ª valor:");
		v2 = sc.nextDouble();
		
		media = (v1+v2)/2;
		
		System.out.print("A média é "+media);
	}

}