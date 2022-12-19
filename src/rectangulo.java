public class rectangulo extends figura{
    private double base;
    private double altura;

    public rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
        calcularArea();
        calcularPerimetro();
    }
    @Override
    protected void calcularArea() {area = base * altura;}
    protected void calcularPerimetro() {perimetro = base*2+altura*2;}
}
