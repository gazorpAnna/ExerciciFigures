import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;
import java.util.List;


public class main {
    public static void main(String[] args)
    {
        List<Figura> llistaOrdenada = new ArrayList<>();
        List<Figura> llista = new ArrayList<>();
        double  suma = 0, max = 0;
        int     i = 0;
        Figura  f;
        //Figura[] llistaFiggins = new Figura[8];
        //double[] llistaArea = new double[8];
        String s, s1, s2, s3;

        Cercle      c    = new Cercle(1, 1);
        Cercle      c2    = new Cercle(2,2);
        //llistaFiggins[0] = c; llistaFiggins[1] = c2;
        llista.add(c); llista.add(c2);

        Rectangle   r    = new Rectangle(1,2,1);
        Rectangle   r2   = new Rectangle(3,4,2);
        //llistaFiggins[2] = r; llistaFiggins[3] = r2;
        llista.add(r); llista.add(r2);

        Quadrat     q    = new Quadrat(3,11);
        Quadrat     q2    = new Quadrat(4,22);
        //llistaFiggins[4] = q; llistaFiggins[5] = q2;
        llista.add(q); llista.add(q2);

        Triangle    t    = new Triangle(2,3,1);
        Triangle    t2    = new Triangle(4,5,2);
        //llistaFiggins[6] = t; llistaFiggins[7] = t2;
        llista.add(t); llista.add(t2);

        /*for(Figura a : llistaFiggins)
        {
            llistaArea[i] = (Math.round(a.area() * 100.0))/100.0; i++;
            suma += (Math.round(a.area() * 100.0))/100.0;
        }
        Arrays.sort(llistaArea); // ordre creixent
        */
        for(int p = 0; p < 8; p++)
        {
            max = 0;
            f = null;
            for (Figura a : llista)
            {
                if(max < a.area())
                {
                    f = a; // queda el maxim de la llista
                    max = a.area();
                }
            }
            llistaOrdenada.add(f);// poso el maxim a la llista
            llista.remove(f);// esborro el maxim de la llista vella
        }

        for ( Figura  a: llistaOrdenada)
        {
            s = a.nom() + ": " + (Math.round(a.area() * 100.0))/100.0;
            System.out.println(s);
            suma += a.area();
        }
        s1 = "La suma total és: " + (Math.round(suma * 100.0))/100.0;
        System.out.println(s1);
        /*s = c.s + c.area();
        s1 = "Rectangle: " + r.area();
        s2 = "Quadrat: " + q.area();
        s3 = "Triangle: " + t.area();
        System.out.println(s);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(suma);
        for(double d : llistaArea)
        {
            System.out.println(d);
        }*/
    }
}
