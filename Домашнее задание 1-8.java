public class F1rstApp {
    public static int main(String[] args){
//        System.out.println("Hello, World!"); //Первое Задание

//        byte a = -123; // Второе задание
//        short b = 25000;
//        int c = 3000000;
//        long d = 400000000L;
//        float e = 5.14f;
//        double f = -124.124;
//        char g = '\u20AA';
//        boolean h = true;
//
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);
//        System.out.println(d);
//        System.out.println(e);
//        System.out.println(f);
//        System.out.println(g);
//        System.out.println(h);

// Третье задание 
System.out.println(Summ(1,2,3,4));
}



 public static double Summ(double a, double b, double c, double d) {
        return (a*(b+(c/d)));
    }


}
//////////////////////////////////////////////////////
Четвертое задание

public class Zadanie_4 {
    public static void main(String[] args){



        printDiap(12,2);
    }


    public static void  printDiap(int a, int b){
        int sum = a + b;
        if ((sum>=10)&&(sum<=20)) {
            System.out.println("True") ;
        } else {
            System.out.println("False");
        }

    }



}
///////////////////////////////////////////////
пятое задание 

public class F1rstApp {
    public static void main(String[] args){



        printChislo(-515151515);
    }


    public static void  printChislo(int x){
        if ((x>=0)) {
            System.out.println("Число положительное") ;
        } else {
            System.out.println("Число отрицательное");
        }

    }



}
////////////////////////////////////////////////
Шестое задание 

public class F1rstApp {
    public static void main(String[] args){



        printChislo(-52);
    }


    public static void  printChislo(int x){
        if ((x>=0)) {
            System.out.println("False") ;
        } else {
            System.out.println("True");
        }

    }



}
////////////////////////////////////
Седьмое задание
public class F1rstApp {
    public static void main(String[] args){



        printImya("Василий");
    }


    public static void  printImya(String name){
        System.out.println("Привет " + name  + "!") ;


    }
    
}
///////////////////////////////////////////
Восьмое задание


public class F1rstApp {
    public static void main(String[] args){



        printYear(2008);
    }


    public static void  printYear(int x){
        if (!(x%4==0) || ((x % 100 == 0) && ! (x % 400 == 0))){
            System.out.println(x + " Год не високосный") ;
        } else {
            System.out.println(x + "год високосный");
        }

    }



}
