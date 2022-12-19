public class dosDimensiones {
    private double base;
    private double altura;
    dosDimensiones() {
        base = altura =0.0;
    }
    dosDimensiones(double h, double b) {
        base = b;
        altura = h;
    }
    dosDimensiones(double x) {
        base = altura = x;
    }

    double getBase() {
        return base;
    }

    double getAltura() {
        return altura;
    }

    void setBase(double b) {
        base = b;
    }

    void setAltura(double h) {
        altura = h;
    }
    void mostrarDime() {
        System.out.println("La base es ("+base+") y la altura es ("+altura+")");
    }
}
