package ru.ntk.pft.sandbox;

public class MyFirstProgram {
    public static void main(String[] args) {
      //  System.out.println("Hello world");

        hello("wold");
        hello("Vold");
        hello("Gringo");
        hello("Servito");

        int len = 10;

        System.out.println("Площадь квадрата " + len + " = " + area(len));


        int rog = 4;

        int gog = 5;

        System.out.println("Значение 1 = " + rog + " Значение 2 = " + gog + " Результат = " + area(rog, gog) );
    }

    public static void hello(String sombody){

        System.out.println("Hello " + sombody + "!");

    }

    public static int area(int l ){
        return l * l;
    }

    public static int area(int a, int b ){
        return a * b;
    }
}
