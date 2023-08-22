package agenda_de_contatos;

public class CSV extends contato{

    public CSV(String nome, String datanasc, String telefone, String email) {
        super(nome, datanasc, telefone, email);
    }

    public boolean salvar(){
        return true;
    }

}
