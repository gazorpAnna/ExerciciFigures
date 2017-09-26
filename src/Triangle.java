public class Triangle extends Figura {
    double b;
    double h;
    int    num;
    String s;

    // Constructor
    public Triangle(double base, double altura, int numero)
    {
        this.b = base;
        this.h = altura;
        this.num = numero;
        s = "Triangle" + num;
    }

    // Metodes
    public double area()
    {
        return (b * h)/2;
    }
    public String nom()
    {
        return s;
    }
}
