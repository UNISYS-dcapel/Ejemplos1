package com.ejemplos.clases.interfaces;

public class ConsultableApp {
    public static void main(String[] args) {
        // declaramos e inicializamos un objeto de la clase
        ConsultableMemory  consultableMemory = new ConsultableMemory();
        // Declarar e inicializar un objeto de una clase pero diciendo que es del tipo del interfaz
        Consultable consultable = new ConsultableMemory();
        consultable = new ConsultableBBDD();
        consultable = new ConsultableRest();
        Integer tipoBackend = 1;
        switch (tipoBackend){
            case 1 -> {consultable = new ConsultableMemory();}
            case 2 -> {consultable = new ConsultableRest();}
            case 3 -> {consultable = new ConsultableBBDD();}
            default-> {consultable = new ConsultableMemory();}
        }
        consultable.findAll();
        consultable.findByID(1);
        Usuario usuario = new Usuario();
        consultable.save(usuario);
        consultable.update(1, usuario);
        consultable.delete(1);
    }
}
