package cliente;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Cliente  {
    String nome;
    String sobrenome;
    int idade;

    public Cliente(){

    }
    public Cliente(String nome){
        this.nome = nome;
    }
    public Cliente(int idade){
        this.idade = idade;
    }
    public Cliente(String nome, String sobrenome, int idade){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return nome + " " + sobrenome + " " + idade;
    }
}
