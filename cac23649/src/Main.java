import Vehiculos.Auto;
import Vehiculos.Avion;
import Vehiculos.Moto;
import Vehiculos.Vehiculo;

public class Main {
    public static void main(String[] args) {
        // String nombre = "Candela";
        //final Integer EDAD = 23;
        //System.out.println("Mi nombre es " + nombre + " y tengo " + EDAD + " Anos");

       /* String dias[] = new String[7];

        dias[0] = "Domingo";
        dias[1] = "Lunes";
        dias[2] = "Martes";
        dias[3] = "Miercoles";
        dias[4] = "Jueves";
        dias[5] = "Viernes";
        dias[6] = "Sabado";

        for (int i = 0; i < dias.length; i++) {
            //validamos que solo muestre los numeros impares con el != .. con == es par
            if (i % 2 != 0) {

                System.out.println(dias[i]);
            }


       }
       */






 /*  Gato gatito = new Gato(  " Cleo ",3, 20 );


   Perro perrito = new Perro( "Keizer", 2 );

        System.out.println(gatito);
        System.out.println(perrito);


       System.out.println(gatito.moverse());


  */

        //EJERCICIO: CREAR DIFERENTES TIPOS DE VEHICULOS

        //Clase padre (Aplicamos herencia)
        Vehiculo v1 = new Vehiculo();
        v1.setPatente("ABC12GH");

        // 3 clases hijas, Auto,Moto,Avion

        Auto a1 = new Auto();
        a1.setPatente("CDA456YH");
        Moto m1= new Moto();
        m1.setPatente("JKL98IJ");
        Avion av1 = new Avion();
        av1.setPatente("DFG45JK");


        System.out.println("La patente del auto es:" + a1.getPatente());
        System.out.println("La patente del avion es:" + av1.getPatente());
        System.out.println("La patente de la moto es:"+ m1.getPatente());
    }



}