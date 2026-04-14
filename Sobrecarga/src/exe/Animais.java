package exe;

// NÍVEL 1: O "Vovô" (Superclasse Base)
class Animais {
    private String nome;

    public void setNome(String nome) { this.nome = nome; }
    public String getNome() { return nome; }

    public void respirar() {
        System.out.println(nome + " está respirando...");
    }
}

// NÍVEL 2: O "Pai" (Subclasse de Animal / Superclasse de Homem)
class Mamifero extends Animais {
    private String tipoPelo;

    public void setTipoPelo(String tipoPelo) { this.tipoPelo = tipoPelo; }
    public String getTipoPelo() { return tipoPelo; }
}

// NÍVEL 3: O "Filho" (Subclasse de Mamifero)
class Homem extends Mamifero {
    private String etnia;

    public void setEtnia(String etnia) { this.etnia = etnia; }
    public String getEtnia() { return etnia; }
}
