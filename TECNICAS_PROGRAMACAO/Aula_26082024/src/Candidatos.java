
public class Candidatos {

	int chaves = 0, chiquinha = 0, kiko = 0, madruga = 0, branco = 0, total = 0;
	
	public void exibirCandidatos() {
		System.out.println("=======Eleição 2024=======");
		System.out.println("========Canditatos========");
		System.out.println("Digite 10 para Chaves:");
		System.out.println("Digite 20 para Chiquinha:");
		System.out.println("Digite 30 para Kiko:");
		System.out.println("Digite 40 para Madruga:");
		System.out.println("Digite 50 para Branco ou Nulo:");
		System.out.println("Digite a senha para sair:");
		System.out.println("=============================");
	}
	
	public void votosChaves() {
		System.out.println("Você escolheu Chaves->10.");
		chaves++;
		System.out.println("=============================");
	}
	public void votosChiquinha() {
		System.out.println("Você escolheu Chiquinha->20.");
		chiquinha++;
		System.out.println("=============================");
	}
	public void votosKiko() {
		System.out.println("Você escolheu Kiko->30.");
		kiko++;
		System.out.println("=============================");
	}
	public void votosMadruga() {
		System.out.println("Você escolheu Madruga->40.");
		madruga++;
		System.out.println("=============================");
	}
	public void votosBranco() {
		System.out.println("Você escolheu Branco->50.");
		branco++;
		System.out.println("=============================");
	}
	public void padrao() {
		System.out.println("Candidato Inválido.");
		System.out.println("=============================");
	}
	public void sair() {
		System.out.println("Pesquisa Encerrada, Obrigado!!");
		System.out.println("=============================");
	}
	public void exibirVotos() {
		System.out.println("Total de votos: Chaves: " +chaves);
		System.out.println("Total de votos: Chiquinha: "+chiquinha);
		System.out.println("Total de votos: Kiko: "+kiko);
		System.out.println("Total de votos: Madruga: "+madruga);
		System.out.println("Total de votos: Branco ou Nulo: "+branco);
	}
	public void totalVotos() {
		total = chaves + chiquinha + kiko + madruga + branco;
		System.out.println("Total de votos: "+total);
	}
	public void ganhador() {
		if(chaves > chiquinha && chaves > madruga && chaves > kiko) {
			System.out.println("=====Chaves venceu a eleição=====");
		}
		else if(chiquinha > chaves && chiquinha > madruga && chiquinha > kiko) {
			System.out.println("=====Chaves venceu a eleição=====");
		}
		else if(madruga > chiquinha && madruga > chaves && madruga > kiko) {
			System.out.println("=====Chaves venceu a eleição=====");
		}
		else if(kiko > chiquinha && kiko > madruga && kiko > chaves) {
			System.out.println("=====Chaves venceu a eleição=====");
		}
		else {
			System.out.println("=====A eleição está empatada=====");
		}
	}

}
