
package classes;

public class Pessoa {
   private int codPessoa;
   private String nome;
   private int idade;
   private String sexo;

    public Pessoa(int codPessoa, String nome, int idade, String sexo) {
        this.codPessoa = codPessoa;
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getCodPessoa() {
        return codPessoa;
    }

    public void setCodPessoa(int codPessoa) {
        this.codPessoa = codPessoa;
    }
   
   
}
