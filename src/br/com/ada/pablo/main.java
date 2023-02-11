package br.com.ada.pablo;

import br.com.ada.pablo.controller.EventoController;
import br.com.ada.pablo.modelo.Pessoa;

import java.util.*;

public class main {

    public static void main(String[] args) {
        boolean rodando = true;
        Scanner scanner = new Scanner(System.in);
        while (rodando) {
            EventoController evento = new EventoController();

            evento.adicionarNaListaDeEventos();
            
            evento.escrevendoMensagemParaPessoas();

            evento.notificador();

            System.out.println();
            System.out.println("Deseja mandar outra mensagem? (s/n)");
            String continuar = scanner.nextLine();
            if (continuar.equalsIgnoreCase("n")){
                rodando = false;
            }
        }
    }
}
