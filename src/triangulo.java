public class triangulo extends figura {
    private double base;
    private double altura;
    private double lado;
    public triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
        calcularArea();
        calcularPerimetro();
    }
    @Override
    public void calcularArea(){area=(base*altura)/2;}
    @Override
    public void calcularPerimetro(){perimetro=lado*3;}
}
