import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        rectangulo rc = new rectangulo();
        rc.setX(10);
        rc.setY(20);
        rc.calcularPerimetro();
        rc.calcularArea();
        System.out.println(rc.getPerimetro());
        System.out.println(rc.getArea());

        cuadrado cu = new cuadrado();
        cu.setX(4);
        cu.setY(4);
        cu.calcularPerimetro();
        cu.calcularArea();
        System.out.println(cu.getPerimetro());
        System.out.println(cu.getArea());
        colorTriangulo ctr = new colorTriangulo("Azul","Estilo x",8.0,12.0);
        colorTriangulo ctr2 = new colorTriangulo("Rojo","Estilo y",4.0,3.0);
        System.out.println("Datos del triangulo 1");
        ctr.mostrarEstilo();
        ctr.mostrarDime();
        ctr.mosstrarColor();
        System.out.println("Su area es: "+ctr.area());
        System.out.println("Datos del triangulo 2");
        ctr2.mostrarEstilo();
        ctr2.mostrarDime();
        ctr2.mosstrarColor();
        System.out.println("Su area es: "+ctr2.area());
        */
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese lado del cuadrado: ");
        double longitudLado = sc.nextDouble();
        cuadrado cuadr = new cuadrado(longitudLado);
        System.out.println(cuadr.getArea());
        System.out.println(cuadr.getPerimetro());

        System.out.print("Ingrese la base del rectangulo: ");
        double longBase = sc.nextDouble();
        System.out.print("Ingrese la altura del rectangulo: ");
        double longaltura = sc.nextDouble();
        rectangulo rc = new rectangulo(longBase,longaltura);
        System.out.println(rc.getArea());
        System.out.println(rc.getPerimetro());

        System.out.print("Ingrese la base del triangulo: ");
        double ladT = sc.nextDouble();
        System.out.print("Ingrese la altura del triangulo: ");
        double altTr = sc.nextDouble();

        System.out.print("Ingrese la base del triangulo: ");
        double lad1 = sc.nextDouble();

    }
}