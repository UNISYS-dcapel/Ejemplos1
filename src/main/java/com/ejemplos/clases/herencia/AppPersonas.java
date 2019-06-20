package com.ejemplos.clases.herencia;

public class AppPersonas {
    public static void main(String[] args) {
        Persona p = new Persona();
        System.out.println(p);
        Empleado e = new Empleado();
        System.out.println(e);
        Jefecillo j= new Jefecillo();
        System.out.println(j);
        System.out.println(j.getSubordinados()[0]);
        e = (Empleado) j;
        System.out.println(e);
        System.out.println(e.getSueldo());
        p = (Persona) e;
        System.out.println(p);
        System.out.println(p.getEdad());


        if (j instanceof Jefecillo)
            System.out.println("Es un fejecillo");
        if (j instanceof Empleado)
            System.out.println("ES un empleado");
        if (j instanceof Persona)
            System.out.println("ES una persona");
    }
}
