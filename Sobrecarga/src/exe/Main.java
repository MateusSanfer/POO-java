package exe;

public class Main {
    public static void main(String[] args) {
        Area calculador = new Area();

        System.out.println("Área do Quadrado: " + calculador.areas(20));
        System.out.println("Área do Retângulo: " + calculador.areas(10, 2.2));
        System.out.println("Área do Trapézio: " + calculador.areas(10, 5, 4));

        // Criamos o objeto Homem
        Homem h = new Homem();

        // 1. Acessando método da classe ANIMAL (Vovô)
        h.setNome("Mateus");
        h.respirar();

        // 2. Acessando atributo da classe MAMIFERO (Pai)
        h.setTipoPelo("Curto");
        System.out.println("Tipo de pelo herdado: " + h.getTipoPelo());

        // 3. Acessando atributo da própria classe HOMEM
        h.setEtnia("Latino-americano");
        System.out.println("Etnia específica: " + h.getEtnia());

        System.out.println("\nResumo: O objeto 'h' tem acesso a tudo na árvore genealógica!");

    }
}
