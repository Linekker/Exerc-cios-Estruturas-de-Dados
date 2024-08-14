public class Clientes {

    private String nome;
    private int cfp;
    private String endereco;
    private int telefone;

    public Clientes(String nome, int cpf, String endereço, int telefone) {
        this.nome = nome;
        this.cfp = cpf;
        this.endereco = endereço;
        this.telefone = telefone;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setCPF(int cpf) {
        this.cfp = cpf;
    }

    public int getCPF() {
        return cfp;
    }

    public void setEndereco(String endereço) {
        this.endereco = endereço;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setTelefone(int telefone){
        this.telefone = telefone;
    }
    public int getTelefone(){
        return telefone;
    }

}
