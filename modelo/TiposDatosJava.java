package modelo;

public class TiposDatosJava
{
    public static void main(String[] args)
    {
        //Tipos datos primitivos 
        int x = 12;
        short w = 2;
        char c = '@';
        double y = 2.45;
        boolean esta = true;
        System.out.println("Tipos de datos primitivos: ");
        System.out.println("x = " + x);


        //Tipos de datos referenciados 
        String s = "UIS SOCORRO";
        int[] a = new int[12];
        Punto p1 = new Punto(2,3);
        Punto p2;
        p2 = new Punto(-2, -4);
        //p1 = p2;
        System.out.println("Tipos de datos referenciados: ");
        System.out.println("Punto: "+p1);
        System.out.println("Punto: "+p2);
    }
}