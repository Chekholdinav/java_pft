package ru.ntk.pft.sandbox;

public class MyFirstProgram {
    public static void main(String[] args) {
        //  System.out.println("Hello world");

        hello("wold");
        hello("Vold");
        hello("Gringo");
        hello("Servito");

        Square s = new Square(5);

        System.out.println("Площадь квадрата " + s.l + " = " + s.area());


        Rectangle r = new Rectangle(4, 5);


        System.out.println("Значение 1 = " + r.a + " Значение 2 = " + r.b + " Результат = " + r.area());
    }

    public static void hello(String sombody) {

        System.out.println("Hello " + sombody + "!");

    }




}
