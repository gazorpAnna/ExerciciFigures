public class Cercle extends Figura {
    double r;
    int    num;
    String s;

    // constructor
    public Cercle(double radi, int numero)
    {
        this.r = radi;
        this.num = numero;
        s = "Cercle" + num;
    }

    // Métodes
    public double area()
    {
        return Math.PI * r * r;
    }
    public String nom()
    {
        return s;
    }
}
