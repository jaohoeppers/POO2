package agenda_de_contatos;

abstract class contato {

    private String nome;
    private String datanasc;
    private String telefone;
    private String email;

    public contato(String nome, String datanasc, String telefone, String email){
        setNome(nome);
        setDatanasc(datanasc);
        setTelefone(telefone);
        setEmail(email);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDatanasc() {
        return datanasc;
    }

    public void setDatanasc(String datanasc) {
        this.datanasc = datanasc;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
