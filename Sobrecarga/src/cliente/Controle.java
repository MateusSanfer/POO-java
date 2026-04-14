package cliente;

public class Controle {
    static void main() {
        Cliente c = new Cliente();
        Cliente c1 = new Cliente("Jasa");
        Cliente c2 = new Cliente(23);
        Cliente c3 = new Cliente("Juan", "Ducasca",67);

        System.out.println(c);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
    }
}
