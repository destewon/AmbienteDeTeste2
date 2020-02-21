package controler;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;

import model.Aluno;
import model.Cidade;
import model.Data;
import model.Endereco;
import model.Estado;

public class AlunoController {

	// gravar dados do aluno

	public void inserirAluno(String nome, String matricula, String data, String rg, String cpf, String telefone,
			char sexo, String senha, String logradouro, String numero, String cep, String complemento, String bairro,
			String cidade, String estado) {

		Aluno aluno1 = new Aluno();
		String data2[] = data.split("/");
		Cidade cidade2 = new Cidade();
		Estado estado2 = new Estado();
		
		Endereco endereco = new Endereco( logradouro,  numero,  complemento,  bairro,  cidade2,  estado2,
				cep);

		Data data1 = new Data(Integer.parseInt(data2[0]), Integer.parseInt(data2[1]), Integer.parseInt(data2[2]));

		aluno1.setNome(nome);
		aluno1.setMatricula(matricula);
		aluno1.setDataNascimento(data1);
		aluno1.setRg(rg);
		aluno1.setCpf(cpf);
		aluno1.setTelefone(telefone);
		aluno1.setSexo(sexo);
		// aluno1.setSenha(senha);
		endereco.setLogradouro(logradouro);
		endereco.setNumero(numero);
		endereco.setCep(cep);
		endereco.setComplemento(complemento);
		endereco.setBairro(bairro);
		endereco.setCidade(cidade2);
		endereco.setEstado(estado2);
		
		

		try {
			File arquivo = new File("aluno.txt");
			FileOutputStream arquivoOutput = new FileOutputStream(arquivo, true);
			PrintStream gravador = new PrintStream(arquivoOutput);
			
			gravador.print(aluno1.getNome());
			gravador.print(";");
			gravador.print(aluno1.getMatricula());
			gravador.print(";");
			gravador.print(aluno1.getRg());
			gravador.print(";");
			gravador.print(aluno1.getCpf());
			gravador.print(";");
			gravador.print(aluno1.getTelefone());
			gravador.print(";");
			gravador.print(data.toString());
			gravador.print(";");
			gravador.print(aluno1.getSexo());
			gravador.print(";");
			gravador.print(aluno1.getSenha());
			gravador.print(";");
			gravador.print(endereco.getLogradouro());
			gravador.print(";");
			gravador.print(endereco.getNumero());
			gravador.print(";");
			gravador.print(endereco.getCep());
			gravador.print(";");
			gravador.print(endereco.getComplemento());
			gravador.print(";");
			gravador.print(endereco.getBairro());
			gravador.print(";");
			gravador.print(endereco.getCidade());
			gravador.print(";");
			gravador.print(endereco.getEstado());
			gravador.print(";");	
			
			gravador.println();

			gravador.close();
			arquivoOutput.close();
			System.out.println("Gravado com sucesso");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	// exibe todos os arquivos do arquivo aluno
	public void listarTodos() {

		try {
			InputStream is = new FileInputStream("aluno.txt");
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader leitor = new BufferedReader(isr);
			String aluno = leitor.readLine();
			String data2[] = aluno.split(";");
			// System.out.println(aluno);

			System.out.println();
			while (aluno != null) {

				aluno = leitor.readLine();
				System.out.print("Matricula: ");
				System.out.println(data2[0]);
				System.out.print("Nome: ");
				System.out.println(data2[1]);
				System.out.print("Data de aniversario: ");
				System.out.println(data2[2]);
				System.out.print("Sexo: ");
				System.out.println(data2[3]);
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Arquivo de entrada não encontrado!");
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Arquivo de entrada não encontrado!");
			e.printStackTrace();
		}

	}

	// listar aniversariantes no mes
	/*public void listarAniversariantes(int mes) {

		try {
			InputStream is = new FileInputStream("aluno.txt");
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader leitor = new BufferedReader(isr);

			String aluno = leitor.readLine();

			System.out.println("Aniversariantes do mes: ");
			while (aluno != null) {

				String data2[] = aluno.split(";");
				String aniversario[] = data2[2].split("/");

				if ((Integer.parseInt(aniversario[1])) == (mes)) {
					System.out.println();
					System.out.println("Aniversariantes do mes: ");

					if ((Integer.parseInt(aniversario[1])) == (6)) {
						System.out.println("");

						System.out.print("Matricula: ");
						System.out.println(data2[0]);
						System.out.print("Nome: ");
						System.out.println(data2[1]);
						System.out.print("Data de aniversario: ");
						System.out.println(data2[2]);
						System.out.print("Sexo: ");
						System.out.println(data2[3]);

					} else {

					}

					aluno = leitor.readLine();

				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Arquivo de entrada não encontrado!");
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Arquivo de entrada não encontrado!");
			e.printStackTrace();
		}

	}*/

}
