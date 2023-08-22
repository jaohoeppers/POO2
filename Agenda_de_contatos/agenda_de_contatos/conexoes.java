package agenda_de_contatos;

import java.sql.DriverManager;
import java.sql.Connection;

public class conexoes {

    final static String NOME_DO_BANCO = "Poo2";
    public static Connection conectar() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3300/" + NOME_DO_BANCO;
            return DriverManager.getConnection(url,"root","");
        } catch (Exception e) {
            //System.err.println("Erro: " + e.toString());
            //e.printStackTrace();
            return null;
        }
    }
}
