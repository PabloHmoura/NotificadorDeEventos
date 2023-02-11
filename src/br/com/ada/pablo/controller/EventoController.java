package br.com.ada.pablo.controller;

import br.com.ada.pablo.modelo.Pessoa;
import br.com.ada.pablo.repository.INotificador;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EventoController implements INotificador {

    List<Pessoa> listaPessoas = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    @Override
    public void adicionarNaListaDeEventos() {
        System.out.println("Digite o número de pessoas que irão ser notificadas");
        int quantidade = scanner.nextInt();
        if (quantidade == 0) {
            System.out.println("Nenhuma pessoa para notificar");
            System.exit(0);
        }
        System.out.println();
        scanner.skip("((?<!\\R)\\s)*");

        for (int i = 1; i < quantidade + 1; i++) {
            Pessoa pessoa = new Pessoa();
            System.out.println("Digite o nome da " + i + "ª pessoa");
            String nome = scanner.nextLine();
            pessoa.setNome(nome);
            this.listaPessoas.add(pessoa);
        }
    }

    @Override
    public void escrevendoMensagemParaPessoas() {
        System.out.println("Digite a mensagem da notificação");
        String message = scanner.nextLine();
        System.out.println();
        for (Pessoa pessoa1: this.listaPessoas) {
            pessoa1.setMessage(message);
        }
    }

    @Override
    public void notificador() {
        this.listaPessoas.forEach(System.out::println);
    }
}
