package aplicacao;

import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		DAO dao = new DAO();
		Scanner scanner = new Scanner(System.in);
		int opcao = 0;

		System.out.println("Conectando ao banco de dados...");

		do {
			System.out.println("\n=== MENU PRINCIPAL ===");
			System.out.println("1 - Listar");
			System.out.println("2 - Inserir");
			System.out.println("3 - Atualizar");
			System.out.println("4 - Excluir");
			System.out.println("5 - Sair");
			System.out.print("Escolha uma opção: ");
			
			// Lê a opção do teclado
			opcao = scanner.nextInt();
			scanner.nextLine(); // Limpar o espaço enter

			switch (opcao) {
				case 1:
					System.out.println("\n--- Lista de Usuários ---");
					List<Usuario> lista = dao.listar();
					if (lista.isEmpty()) {
						System.out.println("Nenhum usuário cadastrado no momento.");
					} else {
						for (Usuario u : lista) {
							System.out.println(u.toString());
						}
					}
					break;
				case 2:
					System.out.println("\n--- Inserir Novo Usuário ---");
					System.out.print("Digite o NOME: ");
					String nome = scanner.nextLine();
					System.out.print("Digite a IDADE: ");
					int idade = scanner.nextInt();
					
					Usuario novoUsuario = new Usuario(0, nome, idade);
					dao.inserir(novoUsuario);
					break;
				case 3:
					System.out.println("\n--- Atualizar Usuário ---");
					System.out.print("Digite o ID do usuário que deseja atualizar: ");
					int idAtualizar = scanner.nextInt();
					scanner.nextLine(); // Limpar o espaço enter
					
					System.out.print("Digite o NOVO NOME: ");
					String novoNome = scanner.nextLine();
					System.out.print("Digite a NOVA IDADE: ");
					int novaIdade = scanner.nextInt();
					
					Usuario usuarioAtualizado = new Usuario(idAtualizar, novoNome, novaIdade);
					dao.atualizar(usuarioAtualizado);
					break;
				case 4:
					System.out.println("\n--- Excluir Usuário ---");
					System.out.print("Digite o ID do usuário que deseja excluir: ");
					int idExcluir = scanner.nextInt();
					dao.excluir(idExcluir);
					break;
				case 5:
					System.out.println("\nSaindo do programa... Até logo!");
					break;
				default:
					System.out.println("\nOpção inválida! Digite um número de 1 a 5.");
			}
		} while (opcao != 5);
		
		scanner.close();
	}
}