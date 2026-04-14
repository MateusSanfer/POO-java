
static void main() {
    Scanner sc = new Scanner(System.in);
    int[] elemento = new int[8];
    double multi = 1;
    for (int i = 0; i < elemento.length; i++) {
        System.out.println("Digite o elemento " + (i + 1) + ":");
        elemento[i] = sc.nextInt();
    }
    for (double valor : elemento) {
        multi *= valor;
    }

    System.out.println("Multiplicador: " + multi);
    sc.close();
}
