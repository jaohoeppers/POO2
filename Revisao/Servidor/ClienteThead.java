package FACULDADE;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class ClienteThead extends Thread {
    private Cliente2 cliente2;
    private static ClienteThead CT;

    public static ClienteThead getInstance(Cliente2 cliente2){
        if (CT==null)
            CT = new ClienteThead(cliente2);
        return CT;
    }

    public ClienteThead(Cliente2 cliente2){
        this.cliente2 = cliente2;
    }

    @Override
    public void run(){
        Scanner entrada = new Scanner(System.in);
        String txt="";
        while (!(txt.equals("sair"))) {
            try {
                txt = entrada.nextLine();
                cliente2.enviar(txt);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }

}
