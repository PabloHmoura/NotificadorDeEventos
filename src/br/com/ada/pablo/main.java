package br.com.ada.pablo;

import br.com.ada.pablo.modelo.Pessoa;

import java.util.*;

public class main {

    public static void main(String[] args) {
        boolean rodando = true;
        while (rodando) {
            List<Pessoa> listaPessoas = new ArrayList<>();
            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite o número de pessoas que irão ser notificadas");
            int quantidade = scanner.nextInt();
            if (quantidade == 0) {
                break;
            }
            System.out.println();
            scanner.skip("((?<!\\R)\\s)*");

            for (int i = 1; i < quantidade + 1; i++) {
                Pessoa pessoa = new Pessoa();
                System.out.println("Digite o nome da " + i + "ª pessoa");
                String nome = scanner.nextLine();
                pessoa.setNome(nome);
                listaPessoas.add(pessoa);
            }

            System.out.println("Digite a mensagem da notificação");
            String message = scanner.nextLine();
            System.out.println();
            for (Pessoa pessoa1: listaPessoas) {
                pessoa1.setMessage(message);
            }

            listaPessoas.forEach(System.out::println);

            System.out.println();
            System.out.println("Deseja mandar outra mensagem? (s/n)");
            String continuar = scanner.nextLine();
            if (continuar.equalsIgnoreCase("n")){
                rodando = false;
            }
        }
    }
}
