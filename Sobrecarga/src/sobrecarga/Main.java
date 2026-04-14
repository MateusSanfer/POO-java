package sobrecarga;

public class Main {
    static void main() {
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Aves a  = new Aves();
        Canguru c = new Canguru();
        Cachorro k = new Cachorro();
        Cobra j = new Cobra();
        Tartaruga t = new Tartaruga();
        GoldFish g = new GoldFish();
        Arara e = new Arara();



        c.locomover();
        k.emitirSom();
        k.alimentar();

    }
}
