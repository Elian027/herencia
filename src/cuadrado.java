public class cuadrado extends figura{
    double lado;
    public cuadrado(double lado) {
        this.lado = lado;
        calcularArea();
        calcularPerimetro();
    }
    @Override
    protected void calcularArea(){
        area = lado*lado;
    }

    @Override
    public void calcularPerimetro() {
        perimetro = lado*4;
    }
}
