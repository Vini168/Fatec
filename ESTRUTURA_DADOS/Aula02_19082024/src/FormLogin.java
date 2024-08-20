import javax.swing.*;
import java.awt.*;

public class FormLogin extends JFrame{
	
	//Construtor da classe
	public FormLogin() {
		//Configurações da janela
		setTitle("Tela de Login");
		setSize(400, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null); //Centraliza a janela na tela
		setLayout(new BorderLayout()); //Usando BorderLayout para organizar os componentes
		
		//Criando o label "Acesso Restrito"
		JLabel lbRestrito = new JLabel("Acesso Restrito", SwingConstants.CENTER);
		lbRestrito.setFont(new Font("Arial", Font.BOLD, 18));// Define fonte e tamanho
		
		//Adicionando o label ao topo da janela
		add(lbRestrito, BorderLayout.NORTH);
		
		//Criando o painel para os campos de texto e botões
		JPanel panel = new JPanel(new GridLayout(3, 2));
		
		//Criando os componentes
		JLabel lbuser =  new JLabel("Usuário:");
		JTextField txtUser = new JTextField();
		
		JLabel lbsenha = new JLabel("Senha:");
		JPasswordField txtSenha = new JPasswordField();
		
		JButton btLogin = new JButton("Entrar");
		JButton btSair  = new JButton("Sair");
		
		//Adicionando componentes ao painel
		panel.add(lbuser);
		panel.add(txtUser);
		panel.add(lbsenha);
		panel.add(txtSenha);
		panel.add(btLogin);
		panel.add(btSair);
		
		//Adicionando o painel ao centro da janela
		add(panel, BorderLayout.CENTER);
		
		//Ação para o botão "Entrar"
		btLogin.addActionListener(e -> {
			String username = txtUser.getText();
			String password = new String(txtSenha.getPassword());
			
			//Aqui você pode adicionar a lógica de verificação de usuário e senha
			if (username.equals("admin") && password.equals("1234")) {
				dispose(); // Fecha a janela de login
				new FormPrincipal(); //Abre novo formulário
			} else {
				JOptionPane.showMessageDialog(null, "Usuário ou senha incorretos");
				txtUser.setText("");
				txtSenha.setText("");
				txtUser.grabFocus();
			}
		});
		// Ação para o botão "Sair"
		btSair.addActionListener(e -> System.exit(0)); // Fecha a aplicação
		// Exibe a janela
		setVisible(true);
	}
	// Método principal para rodar a aplicação
	public static void main(String[] args) {
		new FormLogin();
	}
}
