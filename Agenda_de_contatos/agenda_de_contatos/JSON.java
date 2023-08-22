package agenda_de_contatos;

public class JSON extends contato{

    public JSON(String nome, String datanasc, String telefone, String email) {
        super(nome, datanasc, telefone, email);
    }

    public boolean salvar(){
        return true;
    }

}
