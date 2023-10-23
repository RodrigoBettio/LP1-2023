import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AplicativoTarefas aplicativo = new AplicativoTarefas();

        Usuario usuario1 = new Usuario("usuario1", "senha1");
        Usuario usuario2 = new Usuario("usuario2", "senha2");
        aplicativo.adicionarUsuario(usuario1);
        aplicativo.adicionarUsuario(usuario2);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome de usuário: ");
        String nomeUsuario = scanner.nextLine();
        System.out.print("Senha: ");
        String senha = scanner.nextLine();

        if (aplicativo.autenticarUsuario(nomeUsuario, senha)) {
            System.out.println("Autenticação bem-sucedida!");
            boolean executando = true;

            while (executando) {
                System.out.println("\nOpções:");
                System.out.println("1. Listar tarefas");
                System.out.println("2. Adicionar tarefa");
                System.out.println("3. Marcar tarefa como concluída");
                System.out.println("4. Sair");

                int escolha = scanner.nextInt();
                scanner.nextLine(); // Limpar a quebra de linha

                switch (escolha) {
                    case 1:
                        aplicativo.listarTarefas();
                        break;
                    case 2:
                        System.out.print("Título da tarefa: ");
                        String tituloTarefa = scanner.nextLine();
                        System.out.print("Descrição da tarefa: ");
                        String descricaoTarefa = scanner.nextLine();
                        aplicativo.adicionarTarefa(tituloTarefa, descricaoTarefa);
                        break;
                    case 3:
                        System.out.print("Índice da tarefa para marcar como concluída: ");
                        int indiceTarefa = scanner.nextInt();
                        aplicativo.marcarTarefaConcluida(indiceTarefa);
                        break;
                    case 4:
                        executando = false;
                        break;
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                }
            }
        } else {
            System.out.println("Autenticação falhou. Usuário ou senha incorretos.");
        }
    }
}