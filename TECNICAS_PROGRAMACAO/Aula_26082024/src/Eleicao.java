import java.util.Scanner;

public class Eleicao {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		Candidatos opcao = new Candidatos();
		int voto = 0;
		
		opcao.exibirCandidatos();
		
		while (voto != 260824) {
			voto = leia.nextInt();
			switch (voto) {
				case 10:
					opcao.votosChaves();
					break;
				case 20:
					opcao.votosChiquinha();
					break;
				case 30:
					opcao.votosKiko();
					break;
				case 40:
					opcao.votosMadruga();
					break;
				case 50:
					opcao.votosBranco();
					break;
				case 180334:
					opcao.sair();
					break;
				default:
					opcao.padrao();
			}
		}
		opcao.exibirVotos();
		opcao.totalVotos();
		opcao.ganhador();

	}

}
