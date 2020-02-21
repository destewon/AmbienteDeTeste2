package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import controler.AlunoController;

public class AlunoView {

	private JFrame janela;
	private JPanel painelDaTela;
	private JLabel lblMatricula;
	private JLabel lblNome;
	private JLabel lblDataNascimento;
	private JLabel lblSexo;
	private JLabel lblRg;
	private JLabel lblCpf;
	private JLabel lblTelefone;
	private JLabel lblLogradouro;
	private JLabel lblComplemento;
	private JLabel lblNumero;
	private JLabel lblCep;
	private JLabel lblBairro;
	private JTextField txtMatricula;
	private JTextField txtNome;
	private JTextField txtDataNascimento;
	private JTextField txtTelefone;
	private JTextField txtRg;
	private JTextField txtCpf;
	private JTextField txtLogradouro;
	private JTextField txtComplemento;
	private JTextField txtNumero;
	private JTextField txtCep;
	private JTextField txtBairro;
	private JPasswordField jpwSenha;
	private JPasswordField jpwSenha2;
	private JRadioButton rbtMasculino;
	private JRadioButton rbtFeminino;
	private JButton btm1;
	private JButton btm2;
	private JLabel lblTitulo;
	private JLabel lblSenha;
	private JLabel lblSenha2;
	private JLabel lblCidade;
	private JLabel lblEstado;
	private ButtonGroup grpRadio;
	private JComboBox cboCidade;
	private String[] cidades = { "Barueri", "Osasco", "Itapevi", "Carapicuiba", "Jandira" };
	private JComboBox cboEstado;
	private String[] estados = { "São Paulo", "Rio de Janeiro", "Minas Gerais", "Bahia", "Amazonas" };

	public AlunoView() {
		iniciaGui();
	}

	public void iniciaGui() {

		cboCidade = new JComboBox();
		cboEstado = new JComboBox();
		txtTelefone = new JTextField();
		txtRg = new JTextField();
		txtCpf = new JTextField();
		lblTelefone = new JLabel();
		lblRg = new JLabel();
		lblCpf = new JLabel();

		// Instanciando Janela de cadastro
		janela = new JFrame();
		janela.setSize(790, 370);
		painelDaTela = (JPanel) janela.getContentPane();
		painelDaTela.setBackground(new Color(230, 230, 250));

		// label titulo
		lblTitulo = new JLabel();
		lblTitulo.setText("Cadastro de Aluno");
		lblTitulo.setBounds(10, 22, 300, 20);
		lblTitulo.setFont(new Font("Consolas", Font.BOLD, 22));
		painelDaTela.add(lblTitulo);

		// label nome
		lblNome = new JLabel();
		lblNome.setText("Nome:");
		lblNome.setBounds(10, 80, 150, 20);
		lblNome.setFont(new Font("Consolas", Font.BOLD, 16));
		painelDaTela.add(lblNome);

		// JText nome
		txtNome = new JTextField();
		txtNome.setBounds(55, 80, 250, 20);
		txtNome.setBackground(new Color(240, 255, 255));
		txtNome.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				//txtNome.setBorder(new LineBorder(Color.BLUE));
			}
		});
		// trocar borda da txtfield
		// txtNome.setBorder(new LineBorder(Color.RED));
		painelDaTela.add(txtNome);

		// label matricula
		lblMatricula = new JLabel();
		lblMatricula.setText("Matricula:");
		lblMatricula.setBounds(10, 110, 150, 20);
		lblMatricula.setFont(new Font("Consolas", Font.BOLD, 16));
		// janela.getContentPane().add(BorderLayout.EAST,lblMatricula);
		painelDaTela.add(lblMatricula);
		// painelDaTela.setBackground(new Color(217,232,238));
		// painelDaTela.setBackground(new Color(176,224,230));

		// JText matricula
		txtMatricula = new JTextField();
		txtMatricula.setBounds(100, 110, 205, 20);
		txtMatricula.setBackground(new Color(240, 255, 255));
		painelDaTela.add(txtMatricula);

		// label Data de Nascimento
		lblDataNascimento = new JLabel();
		lblDataNascimento.setText("Data de Nascimento:");
		lblDataNascimento.setBounds(10, 140, 200, 20);
		lblDataNascimento.setFont(new Font("Consolas", Font.BOLD, 16));
		painelDaTela.add(lblDataNascimento);

		// JText Data de Nasc.
		txtDataNascimento = new JTextField();
		
		
		try {
			javax.swing.text.MaskFormatter dt = new javax.swing.text.MaskFormatter("##/##/####");
			txtDataNascimento = new javax.swing.JFormattedTextField(dt);
		} catch (Exception e) {
			
		}
		txtDataNascimento.setBackground(new Color(240, 255, 255));
		txtDataNascimento.setBounds(180, 140, 125, 20);
		painelDaTela.add(txtDataNascimento);
		
		//txtDataNascimento = new JTextField();
			
			//txtDataNascimento.setBounds(110, 60, 350, 20);

		// label RG
		lblRg = new JLabel();
		lblRg.setText("Rg:");
		lblRg.setBounds(10, 170, 200, 20);
		lblRg.setFont(new Font("Consolas", Font.BOLD, 16));
		painelDaTela.add(lblRg);

		// JText RG
		txtRg = new JTextField();
		txtRg.setBounds(38, 170, 268, 20);
		txtRg.setBackground(new Color(240, 255, 255));
		painelDaTela.add(txtRg);

		// label cpf
		lblCpf = new JLabel();
		lblCpf.setText("Cpf:");
		lblCpf.setBounds(10, 200, 200, 20);
		lblCpf.setFont(new Font("Consolas", Font.BOLD, 16));
		painelDaTela.add(lblCpf);

		// JText cpf
		txtCpf = new JTextField();
		txtCpf.setBounds(45, 200, 261, 20);
		txtCpf.setBackground(new Color(240, 255, 255));
		painelDaTela.add(txtCpf);

		// label telefone
		lblTelefone = new JLabel();
		lblTelefone.setText("Telefone:");
		lblTelefone.setBounds(10, 230, 200, 20);
		lblTelefone.setFont(new Font("Consolas", Font.BOLD, 16));
		painelDaTela.add(lblTelefone);

		// JText telefone
		txtTelefone = new JTextField();
		txtTelefone.setBounds(90, 230, 215, 20);
		txtTelefone.setBackground(new Color(240, 255, 255));
		painelDaTela.add(txtTelefone);

		// label Senha
		lblSenha = new JLabel();
		lblSenha.setText("Cadastrar Senha:");
		lblSenha.setBounds(10, 290, 200, 20);
		lblSenha.setFont(new Font("Consolas", Font.BOLD, 16));
		painelDaTela.add(lblSenha);

		// JText Senha
		jpwSenha = new JPasswordField();
		jpwSenha.setBounds(155, 290, 150, 20);
		jpwSenha.setBackground(new Color(240, 255, 255));
		painelDaTela.add(jpwSenha);

		/*// label Senha
		lblSenha2 = new JLabel();
		lblSenha2.setText("Confirmar Senha:");
		lblSenha2.setBounds(10, 320, 200, 20);
		lblSenha2.setFont(new Font("Consolas", Font.BOLD, 16));
		painelDaTela.add(lblSenha2);

		// JText Senha
		jpwSenha2 = new JPasswordField();
		jpwSenha2.setBounds(155, 320, 150, 20);
		jpwSenha2.setBackground(new Color(240, 255, 255));
		painelDaTela.add(jpwSenha2);*/

		// label Sexo
		lblSexo = new JLabel();
		lblSexo.setText("Sexo:");
		lblSexo.setBounds(10, 260, 150, 20);
		lblSexo.setFont(new Font("Consolas", Font.BOLD, 16));

		painelDaTela.add(lblSexo);

		rbtMasculino = new JRadioButton();
		rbtFeminino = new JRadioButton();
		grpRadio = new ButtonGroup();
		grpRadio.add(rbtMasculino);
		grpRadio.add(rbtFeminino);
		painelDaTela.add(rbtMasculino);
		painelDaTela.add(rbtFeminino);

		rbtMasculino.setText("Masculino");
		rbtMasculino.setFont(new Font("Consolas", Font.BOLD, 16));

		rbtMasculino.setBounds(65, 260, 120, 20);
		rbtMasculino.setAlignmentX(JRadioButton.CENTER_ALIGNMENT);

		rbtFeminino.setText("Feminino");
		rbtFeminino.setFont(new Font("Consolas", Font.BOLD, 16));
		// rbtFeminino.setBorder(new LineBorder(Color.RED));
		rbtFeminino.setBounds(185, 260, 120, 20);

		// label Logradouro
		lblLogradouro = new JLabel();
		lblLogradouro.setText("Logradouro:");
		lblLogradouro.setBounds(400, 80, 150, 20);
		lblLogradouro.setFont(new Font("Consolas", Font.BOLD, 16));
		painelDaTela.add(lblLogradouro);

		// JText Logradouro
		txtLogradouro = new JTextField();
		txtLogradouro.setBounds(505, 80, 260, 20);
		txtLogradouro.setBackground(new Color(240, 255, 255));
		painelDaTela.add(txtLogradouro);

		// label numero
		lblNumero = new JLabel();
		lblNumero.setText("Numero:");
		lblNumero.setBounds(400, 110, 150, 20);
		lblNumero.setFont(new Font("Consolas", Font.BOLD, 16));
		painelDaTela.add(lblNumero);

		// JText Numero
		txtNumero = new JTextField();
		txtNumero.setBounds(465, 110, 40, 20);
		txtNumero.setBackground(new Color(240, 255, 255));
		painelDaTela.add(txtNumero);

		// label Cep
		lblCep = new JLabel();
		lblCep.setText("CEP:");
		lblCep.setBounds(512, 110, 150, 20);
		lblCep.setFont(new Font("Consolas", Font.BOLD, 16));
		painelDaTela.add(lblCep);

		// JText cep
		txtCep = new JTextField();
		txtCep.setBounds(550, 110, 214, 20);
		txtCep.setBackground(new Color(240, 255, 255));
		painelDaTela.add(txtCep);

		// label Complemento
		lblComplemento = new JLabel();
		lblComplemento.setText("Complemento:");
		lblComplemento.setBounds(400, 140, 150, 20);
		lblComplemento.setFont(new Font("Consolas", Font.BOLD, 16));
		painelDaTela.add(lblComplemento);

		// JText Complemento
		txtComplemento = new JTextField();
		txtComplemento.setBounds(515, 140, 248, 20);
		txtComplemento.setBackground(new Color(240, 255, 255));
		painelDaTela.add(txtComplemento);

		// label Bairro
		lblBairro = new JLabel();
		lblBairro.setText("Bairro:");
		lblBairro.setBounds(400, 170, 150, 20);
		lblBairro.setFont(new Font("Consolas", Font.BOLD, 16));
		painelDaTela.add(lblBairro);

		// JText Bairro
		txtBairro = new JTextField();
		txtBairro.setBounds(460, 170, 304, 20);
		txtBairro.setBackground(new Color(240, 255, 255));
		painelDaTela.add(txtBairro);

		// label Cidade
		lblCidade = new JLabel();
		lblCidade.setText("Cidade:");
		lblCidade.setBounds(400, 200, 150, 20);
		lblCidade.setFont(new Font("Consolas", Font.BOLD, 16));
		painelDaTela.add(lblCidade);
		cboCidade = new JComboBox(cidades);

		// configuração do combo box da cidade
		cboCidade.setSelectedIndex(-1);
		cboCidade.setBounds(464, 200, 298, 20);
		cboCidade.setMaximumRowCount(10);
		cboCidade.setBackground(new Color(240, 255, 255));
		painelDaTela.add(cboCidade);

		// label Estado
		lblEstado = new JLabel();
		lblEstado.setText("Estado:");
		lblEstado.setBounds(400, 230, 150, 20);
		lblEstado.setFont(new Font("Consolas", Font.BOLD, 16));
		painelDaTela.add(lblEstado);
		cboEstado = new JComboBox(estados);

		// configuração do combo box da Estado
		cboEstado.setSelectedIndex(-1);
		cboEstado.setBounds(464, 230, 298, 20);
		cboEstado.setMaximumRowCount(10);
		cboEstado.setBackground(new Color(240, 255, 255));
		painelDaTela.add(cboEstado);
		
		

		/*
		 * // JText Sexo rbtSexo = new JRadioButton(); rbtSexo.setBounds(800, 800, 340,
		 * 20); rbtSexo.setBackground(new Color(240, 255, 255));
		 * painelDaTela.add(rbtSexo);
		 */

		btm1 = new JButton();
		btm1.setText("Salvar");
		btm1.setBounds(420, 290, 130, 30);
		// btm1.addActionListener(new Salvar());
		btm1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				AlunoController aluno = new AlunoController();
				String senha = new String(jpwSenha.getPassword());
				String cidade = (String) cboCidade.getSelectedItem().toString();
				String estado = (String) cboEstado.getSelectedItem().toString();
				aluno.inserirAluno(txtNome.getText(), txtMatricula.getText(), txtDataNascimento.getText(), txtRg.getText(), txtCpf.getText(), txtTelefone.getText(),opcaoSelecionada().charAt(0) ,senha , txtLogradouro.getText(), txtNumero.getText(), txtCep.getText(), txtComplemento.getText(), txtBairro.getText(), cidade, estado);
				
			}
		});
		painelDaTela.add(btm1);

		btm2 = new JButton();
		btm2.setText("Cancelar");
		btm2.setBounds(580, 290, 130, 30);
		btm2.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});
		// btm2.addActionListener(new Cancelar());
		painelDaTela.add(btm2);

		painelDaTela.setLayout(null);
		// painelDaTela.setLayout(new BorderLayout(0,0));
		// painelDaTela.setBorder(BorderFactory.createLoweredBevelBorder());

		janela.setLocationRelativeTo(null);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// janela.setUndecorated(true);
		janela.setVisible(true);
		janela.setResizable(false);
		//janela.getContentPane().setBackground(new Color(240, 255, 255));
		//janela.setUndecorated(true);
		

	}
	public String opcaoSelecionada() {
		String resposta = "";
		
		if(rbtMasculino.isSelected()) {
			resposta+=rbtMasculino.getText();
		}else	if(rbtFeminino.isSelected()) {
			resposta+=rbtFeminino.getText();
		}else {
			JOptionPane.showMessageDialog(null, "Campo Sexo Invalido","Erro",0);
			
		}		
		
		return resposta;
	}
	
	public void limpaCampos() {
		  txtMatricula.setText("");;
		  txtNome.setText("");
		  txtDataNascimento.setText("");
		  txtTelefone.setText("");
		  txtRg.setText("");
		  txtCpf.setText("");
		  txtLogradouro.setText("");
		  txtComplemento.setText("");
		  txtNumero.setText("");
		  txtCep.setText("");
		  txtBairro.setText("");
	}
	/*
	 * public class Salvar implements ActionListener {
	 * 
	 * public void actionPerformed(ActionEvent e) { Data data = new Data();
	 * AlunoController aluno = new AlunoController(); String data2[] =
	 * txtDataNascimento.getText().split("/"); if (rbtSexo.getText().equals(null) ||
	 * rbtSexo.getText().trim().equals("") || txtNome.getText().equals(null) ||
	 * txtNome.getText().trim().equals("") || txtMatricula.equals(null) ||
	 * txtMatricula.getText().trim().equals("") ||
	 * txtDataNascimento.getText().equals(null) ||
	 * txtDataNascimento.getText().trim().equals("")) {
	 * JOptionPane.showMessageDialog(null, "Campos incorretos!!!", "Erro", 0);
	 * 
	 * } else { if (!txtDataNascimento.getText().trim().contains("/") ||
	 * txtDataNascimento.getText().trim().charAt(5) != '/' || data2.length != 3) {
	 * JOptionPane.showMessageDialog(null, "Data Incorreta!!!", "Erro", 0); } else {
	 * if (Integer.parseInt(data2[2].trim()) > 2500) {
	 * JOptionPane.showMessageDialog(null, "Campo Ano incorreto!!!", "Erro", 0); }
	 * else { if (Integer.parseInt(data2[1].trim()) > 12) {
	 * JOptionPane.showMessageDialog(null, "Campo Mes incorreto!!!", "Erro", 0); }
	 * else {
	 * 
	 * if ((Integer.parseInt(data2[0].trim()) > 31 &&
	 * Integer.parseInt(data2[1].trim()) == 1) || (Integer.parseInt(data2[0].trim())
	 * > 31 && Integer.parseInt(data2[1].trim()) == 3) ||
	 * (Integer.parseInt(data2[0].trim()) > 31 && Integer.parseInt(data2[1].trim())
	 * == 5) || (Integer.parseInt(data2[0].trim()) > 31 &&
	 * Integer.parseInt(data2[1].trim()) == 7) || (Integer.parseInt(data2[0].trim())
	 * > 31 && Integer.parseInt(data2[1].trim()) == 8) ||
	 * (Integer.parseInt(data2[0].trim()) > 30 && Integer.parseInt(data2[1].trim())
	 * == 10) || (Integer.parseInt(data2[0].trim()) > 30 &&
	 * Integer.parseInt(data2[1].trim()) == 12)) {
	 * 
	 * JOptionPane.showMessageDialog(null, "Campo Dia incorreto!!!", "Erro", 0);
	 * 
	 * } else { if ((Integer.parseInt(data2[0].trim()) > 30 &&
	 * Integer.parseInt(data2[1].trim()) == 4) || (Integer.parseInt(data2[0].trim())
	 * > 30 && Integer.parseInt(data2[1].trim()) == 6) ||
	 * (Integer.parseInt(data2[0].trim()) > 30 && Integer.parseInt(data2[1].trim())
	 * == 9) || (Integer.parseInt(data2[0].trim()) > 31 &&
	 * Integer.parseInt(data2[1].trim()) == 11)) {
	 * 
	 * JOptionPane.showMessageDialog(null, "Campo Dia incorreto!!!", "Erro", 0);
	 * 
	 * } else { if (Integer.parseInt(data2[1]) == 2 && Integer.parseInt(data2[0]) >
	 * 28) { JOptionPane.showMessageDialog(null,
	 * "Campo Dia incorreto!!!\nMes de fevereiro só tem 28 dias", "Erro", 0);
	 * 
	 * } else { if ((rbtSexo.getText().trim().charAt(0) == 'M' ||
	 * rbtSexo.getText().trim().charAt(0) == 'F' ||
	 * rbtSexo.getText().trim().charAt(0) == 'm' ||
	 * rbtSexo.getText().trim().charAt(0) == 'f')) {
	 * 
	 * Data data1 = new Data(Integer.parseInt(data2[0].trim()),
	 * Integer.parseInt(data2[1].trim()), Integer.parseInt(data2[2].trim()));
	 * 
	 * aluno.inserirAluno(txtMatricula.getText().trim(), txtNome.getText(), data1,
	 * rbtSexo.getText().trim().charAt(0));
	 * 
	 * JOptionPane.showMessageDialog(null, "Cadastro feito com sucesso!!!",
	 * "Sucesso", 1); txtMatricula.setText(""); txtNome.setText("");
	 * txtDataNascimento.setText(""); rbtSexo.setText("");
	 * 
	 * } else { JOptionPane.showMessageDialog(null, "Campo Sexo incorretos!!!",
	 * "Erro", 0); } } } } } } } } }
	 * 
	 * }
	 * 
	 * public class Cancelar implements ActionListener {
	 * 
	 * public void actionPerformed(ActionEvent arg0) { // TODO Auto-generated method
	 * stub System.exit(0); }
	 * 
	 * }
	 */

}
