public abstract class figura {
    /*
    int x, y;
    double perimetro, area;
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    public void calcularPerimetro() {
        perimetro = 2*x+2*y;
    }
    public void calcularArea() {
        area = x*y;
    }
    public double getPerimetro() {
        return perimetro;
    }

    public double getArea() {
        return area;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }
     */
    protected double area;
    protected double perimetro;
    public double getArea(){return area;}
    public double getPerimetro(){return perimetro;}
    protected abstract void calcularArea();
    protected abstract void calcularPerimetro();
}
