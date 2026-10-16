import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Livro> livros = new ArrayList<>();

        String saida = "";

        while (!saida.equals("4")) {
            System.out.println("Bem vindo á Biblioteca!" + "\nOque gostaria de fazer?" +
                    "1-Cadastrar um livro\n" +
                    "2-Emprestar um livro\n" +
                    "3-Listar livros\n" +
                    "4-Sair");

            System.out.println("Digite 1,2,3 ou 4: ");
            saida = scanner.nextLine();

            if (saida.equals("1")) {

                System.out.println("Digite o título do livro: ");
                String novoTitulo = scanner.nextLine();

                System.out.println("Digite o autor do livro: ");
                String novoAutor = scanner.nextLine();

                System.out.println("Digite o ano de lançamento do livro: ");
                int novoAno = scanner.nextInt();
                scanner.nextLine();

                Livro novoLivro = new Livro(novoTitulo, novoAutor, novoAno, "");
                livros.add(novoLivro);
                System.out.println("Livro cadastrado com sucesso!");

            } else if (saida.equals("2")) {
                if (livros.size() == 0) {
                    System.out.println("Sem livros no momento!");
                } else {
                    for (int i = 0; i < livros.size(); i++){
                        System.out.println((i + 1) + " - " + livros.get(i).getTitulo());
                    }
                    System.out.println("Digite o número do livro que deseja emprestar: ");
                    int escolha = scanner.nextInt();
                    scanner.nextLine();

                    if (escolha < 1 || livros.size() < escolha) {
                        System.out.println("Número desconhecido");
                    } else {
                        Livro livroEscolhido = livros.get(escolha - 1);

                        if (livroEscolhido.getEmprestado() == true) {
                            System.out.println("O livro ja foi emprestado!");
                        } else {
                            livroEscolhido.emprestar();
                            System.out.println("Livro emprestado!");
                        }
                    }
                }
            } else if (saida.equals("3")) {
                listarLivro(livros);
            } else if (saida.equals("4")) {
                System.out.println("Saindo...");
            } else {
                System.out.println("Digite um número válido!");
            }


            /*System.out.println("Deseja emprestar-lo?(Sim/Não): ");
            String resposta = scanner.next();

            if (resposta.equals("Sim")) {
                novoLivro.emprestar();
            } else if (resposta.equals("Não")) {
                System.out.println("Livro disponível!");
            } else {
                System.out.println("Erro, resposta inválida");
            }*/
        }
    }
    public static void listarLivro(ArrayList<Livro> livros) {
        for (Livro livro : livros) {
            System.out.println("Título: " + livro.getTitulo());
            System.out.println("Autor: " + livro.getAutor());
            System.out.println("Ano: " + livro.getAno());
            System.out.println(livro.getEmprestimo() + "\n");
        }
    }
}