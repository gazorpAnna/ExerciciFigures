public class Rectangle extends Figura {
    double b;
    double h;
    int    num;
    String s;

    // Constructor
    public Rectangle(double base, double altura, int numero)
    {
        this.b = base;
        this.h = altura;
        this.num = numero;
        s = "Rectangle" + num;
    }

    // Métodes
    public double area()
    {
        return b * h;
    }
    public String nom()
    {
        return s;
    }
}
