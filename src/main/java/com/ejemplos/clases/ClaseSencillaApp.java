package com.ejemplos.clases;

// Es este caso no es necesario importar porque ambas clases comparten paquete
import com.ejemplos.clases.ClaseSencilla;

public class ClaseSencillaApp {
    public static void main(String[] args) {
        // Inicialización de objetos de una clase
        ClaseSencilla objetoSencillo = null;
        System.out.println(objetoSencillo);
        objetoSencillo = new ClaseSencilla();
        System.out.println(objetoSencillo);
        ClaseSencilla objetoSencillo2 = new ClaseSencilla();
        System.out.println(objetoSencillo2);
        // Acceso a atributos o propiedades de la clase desde el objeto
        // modificar el valor de la propiedad
        objetoSencillo.nombre="Valor";
        System.out.println(objetoSencillo.nombre);
        objetoSencillo2.nombre = "Natalia";
        System.out.println(objetoSencillo2.nombre);
        System.out.println(objetoSencillo.nombre);
    }
}
