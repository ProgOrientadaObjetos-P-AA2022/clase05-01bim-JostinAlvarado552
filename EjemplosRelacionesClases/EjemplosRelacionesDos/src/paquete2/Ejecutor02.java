/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

/**
 *
 * @author DET PC
 */
public class Ejecutor02 {
    public static void main(String[] args) {
        //1.Crear una persona del barrio el valle de la ciudad de zamora

        Ciudad ciudad1 = new Ciudad("Loja");
        Ciudad ciudad2 = new Ciudad("Cuenca");
        Ciudad ciudad3 = new Ciudad("Guayaquil");

        Barrio barrio1 = new Barrio("San Sebastián", ciudad1);
        Barrio barrio2 = new Barrio("Sucre", ciudad2);
        Barrio barrio3 = new Barrio("Sucre", ciudad3);

        Persona persona1 = new Persona("Goku Gonzalez", "1100909909", barrio1);
        Persona persona2 = new Persona("Chato Castillo", "1187873909", barrio2);
        Persona persona3 = new Persona("Angelito diMaria", "1100923232", barrio3);

        System.out.println("------------------------------------------");
        System.out.printf("El barrio de la persona %s es %s Y pertenece a la "
                + "ciudad: %s\n",
                persona1.obtenerCedula(),
                persona1.obtenerNombre(),
                persona1.obtenerBarrio().obtenerNombre(),
                persona1.obtenerBarrio().obtenerCiudad().obtenerNombre());
        System.out.println("------------------------------------------");

        System.out.printf("El barrio de la persona %s es %s Y pertenece a la "
                + "ciudad: %s\n",
                persona2.obtenerCedula(),
                persona2.obtenerNombre(),
                persona2.obtenerBarrio().obtenerNombre(),
                persona2.obtenerBarrio().obtenerCiudad().obtenerNombre());
        System.out.println("------------------------------------------");

        System.out.printf("El barrio de la persona %s es %s Y pertenece a la "
                + "ciudad: %s\n",
                persona3.obtenerCedula(),
                persona3.obtenerNombre(),
                persona3.obtenerBarrio().obtenerNombre(),
                persona3.obtenerBarrio().obtenerCiudad().obtenerNombre());

    }
}
   
    

