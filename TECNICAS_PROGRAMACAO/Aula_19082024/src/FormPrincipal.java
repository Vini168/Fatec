import javax.swing.*;

public class FormPrincipal extends JFrame{
	
	public FormPrincipal() {
		// Configuração da janela
		setTitle("Formulário Principal");
		setSize(400, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null); // Centraliza a janela na tela
		
		// Adicionando algum conteúdo (opcional)
		JLabel welcomeLabel = new JLabel("Bem-vindo ao sistema!", SwingConstants.CENTER);
		add(welcomeLabel);
		
		//Exibe a janela
		setVisible(true);
	}

}
