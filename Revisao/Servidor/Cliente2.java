
package FACULDADE;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

import FACULDADE.ClienteThead;

public class Cliente2 {

    private Socket socket;
    private OutputStream outputStream;
    private OutputStreamWriter saida;
    private PrintWriter writer;
    private Scanner entrada;

    public Cliente2() throws IOException {

        socket = new Socket("172.16.3.12", 7000);
        outputStream = socket.getOutputStream();
        saida = new OutputStreamWriter(outputStream);
        writer = new PrintWriter(saida);

        // entrada = new Scanner(System.in);
        // while (!(entrada.nextLine().equals("sair"))){
        // enviar(entrada.nextLine());
        // }

        // String teclado = entrada.nextLine();
        // saida.write(teclado);
    }

    public void enviar(String txt) throws IOException {

        if (txt.equals("sair")) {
            writer.println("Desconectado ");
            System.out.println("Desconectado");
            writer.close();
            saida.close();
            outputStream.close();
            socket.close();
        } else {
            writer.println(txt);
        }
        writer.flush();
    }

    public void escutar() throws IOException {

        InputStream inputStream = socket.getInputStream();
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader reader = new BufferedReader(inputStreamReader);
        String txt = "";

        while (!(txt.equalsIgnoreCase("sair"))) {
            if (reader.ready()) {
                txt = reader.readLine();
                // if(txt.equals("sair")) {
                // System.out.println("Server caiu");
                // writer.close();
                // saida.close();
                // outputStream.close();
                // socket.close();
                // }else {
                System.out.println(txt);
                // }
            }
        }
    }

    public static void main(String[] args) throws IOException {

        Cliente2 cli = new Cliente2();
        ClienteThead clienteThead = ClienteThead.getInstance(cli);
        clienteThead.start();
        System.out.println("conectado");
        cli.escutar();

    }
}