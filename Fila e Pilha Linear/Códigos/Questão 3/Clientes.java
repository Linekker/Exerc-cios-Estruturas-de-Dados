public class Clientes {

    private String nome;
    private String cfp;
    private String endereco;
    private String telefone;

    public Clientes(String nome, String cpf, String endereço, String telefone) {
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

    public void setCPF(String cpf) {
        this.cfp = cpf;
    }

    public String getCPF() {
        return cfp;
    }

    public void setEndereco(String endereço) {
        this.endereco = endereço;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getTelefone() {
        return telefone;
    }

    @Override
    public String toString() {
        return "Clientes [nome=" + nome + ", cfp=" + cfp + ", endereco=" + endereco + ", telefone=" + telefone + "]";
    }

}
