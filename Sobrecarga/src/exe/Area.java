package exe;

public class Area {
    private double lado;
    private double base;
    private double altura;

    public double areas(double lado) {
        System.out.println("Calculando Quadrado (Lado: " + lado + ")");
        return lado * lado;
    }

    public double areas(double base, double altura) {
        System.out.println("Calculando Retângulo (Base: " + base + ", Altura: " + altura + ")");
        return base * altura;
    }

    public double areas(double baseM, double basem, double altura) {
        System.out.println("Calculando Trapézio (B. Maior: " + baseM + ", B. Menor: " + basem + ", Altura: " + altura + ")");
        return ((baseM + basem) * altura)/2;
    }

}
