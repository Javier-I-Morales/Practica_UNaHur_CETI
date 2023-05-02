// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

/*
* PRACTICA 1
*  Ejercicio 1
*  a) number
*  e) empName
*  f) 2ndNumber
*  g) dept_name
*  j) str
*/

import java.sql.SQLOutput;

// Ejercicio 2
public class Main{
    public static void main(String[] args){

        System.out.println("Hello Word");

        System.out.println(divisibleBy(4,0));

        printAsciiOf('a');

        System.out.println(maxBetween(5.2, 4.2));

        System.out.println(toThePowerOf(5, 2));

        System.out.println(factorialRecursiva(8));

        System.out.println(factorialIterativa(8));

        printFibonacciUpTo(8);

        printRectangleInfo(2,3);

        printCircleInfo(5);

        PatternPrinter.printPattern("otro");
    }

//Ejercicio 3
    public static String divisibleBy(int a, int b){
        return b == 0 ? "No se puede dividir por 0" : a % b == 0 ?
                "El primer número es divisible por el segundo" :
                "El primer número no es divisible por el segundo"
        ;
    }

//Ejercicio 4
    public static void printAsciiOf(char a){
        System.out.println((int)a);
    }

//Ejercicio 5
    public static String maxBetween(double a, double b){
        return a == b ? "Son iguales " + a : a > b  ?
                "El primer es más grande: " + a :
                "El segundo es más grande:" + b
                ;
    }

//Ejercicio 6
    public static int toThePowerOf(int a, int b){
        return (int)Math.pow(a,b);
    }

//Ejercicio 7 (recursiva)
    public static int factorialRecursiva(int a){
        int resultado = a;
        if(a == 1) resultado = 1;
        else{resultado = a * factorialRecursiva(a-1);}
        return resultado;
    }

//Ejercicio 7 (iterativa)
    public static int factorialIterativa(int a){
        int resultado = a;
        for(int i = (a - 1); i > 1; i--){
            resultado = resultado * i;
        }
        return resultado;
    }

//Ejercicio 8
    public static void printFibonacciUpTo(int a){
        int ant = 0;
        int numFibo= 1;
        int sig = 0;

        for(int i = 1; i <= a; i++){
            sig = numFibo + ant;
            ant= numFibo;
            numFibo = sig;
            System.out.println(sig);
        }
    }

//Ejercicio 9
    public static void printRectangleInfo(double height, double width){
        System.out.println("The height is: "+ height);
        System.out.println("The width is: "+ width);
        System.out.println("The perimeter is: "+ (height + width) * 2);
        System.out.println("The height is: "+ height * width);
    }

//Ejercicio 10
    public static void printCircleInfo(double radius){
        double diameter = radius * 2;
        System.out.println("The radius is: "+ radius);
        System.out.println("The diameter is: "+ diameter);
        System.out.println("The perimeter is: "+ Math.round(diameter * Math.PI));
    }


    public static class PatternPrinter{

        public static void printPattern(String patternName){
            if(patternName.equals("ladder") ){
                leader();
            }
            else if(patternName == "pyramid"){
                pyramid();
            }
            else if(patternName == "vshape"){
                vshape();
            }
            else{
                System.out.println("El patrón indicado no corresponde..!");
            }
        }

        private static void leader(){
            for(int i = 1; i<=5; i++){
                System.out.println(linea(0,i,0));
            }
        }

        private static void pyramid(){
            int cant = 0;
            for(int i = 1; i <= 5; i++){
                System.out.println(linea(5-i, i+ cant,5-i));
                cant = cant + 1;
            }
        }

        private static void vshape(){
            int cant = 0;
            for(int i = 1; i<=5; i++){
                System.out.println(linea(0,i,0)+ (i != 5?linea(7 - cant, i,0):linea(7 - cant, i-1,0)));
                cant = cant + 2;
            }
        }

        private static String linea(int margenA, int cantChar, int margenB){
            StringBuilder row = new StringBuilder();
            for(int i = 0; i <margenA; i++){
                row.append(" ");
            }for(int i = 0; i < cantChar; i++){
                row.append("X");
            }for(int i = 0; i <margenB; i++){
                row.append(" ");
            }
            return row.toString();
        }


    }

}



//public class Main {
//    public static void main(String[] args) {
//        // Press Alt+Intro with your caret at the highlighted text to see how
//        // IntelliJ IDEA suggests fixing it.
//        System.out.printf("Hello and welcome!");
//
//        int number = 0;
//
//
//
//        // Press Mayús+F10 or click the green arrow button in the gutter to run the code.
//        for (int i = 1; i <= 5; i++) {
//
//            // Press Mayús+F9 to start debugging your code. We have set one breakpoint
//            // for you, but you can always add more by pressing Ctrl+F8.
//            System.out.println("i = " + i);
//        }
//    }
//}

