package locadoraDeVeiculos;

public class Main {
    public static void main(String[] args) {
        VeiculoCarga veiculoCarga = new VeiculoCarga();
       Veiculo veiculo = new Veiculo();

        veiculoCarga.setPlaca("733gffg33");
        veiculoCarga.setMarca("Ferrari");
        veiculoCarga.setModelo("Ferrari");
        veiculoCarga.getMarca();
    }
}
