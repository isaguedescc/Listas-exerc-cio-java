package supermercado.classes;

public class Cliente {
    private String nome;
    private String cpf;
    private String email;

    public Cliente (String nome, String cpf, String email){
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Cliente [Nome=" + getNome() + "\n"+
        "| CPF=" + getCpf() + "\n"+
        "| Email=" + getEmail() + "]";
    }

    
    

}
