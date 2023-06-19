package ec.ecu.ups.practicadatosjz;

import java.util.LinkedList;

class Agenda {
    LinkedList<Contacto<String>> contactos;

    public Agenda() {
        contactos = new LinkedList<>();
    }

    public void agregarContacto(String nombre, String telefono) {
        Contacto<String> nuevoContacto = new Contacto<>(nombre, telefono);
        contactos.add(nuevoContacto);
        System.out.println("Contacto agregado correctamente.");
    }

    public Contacto<String> buscarContacto(String nombre) {
        for (Contacto<String> contacto : contactos) {
            if (contacto.nombre.equalsIgnoreCase(nombre)) {
                return contacto;
            }
        }
        return null;
    }

    public void eliminarContacto(String nombre) {
        Contacto<String> contactoAEliminar = null;
        for (Contacto<String> contacto : contactos) {
            if (contacto.nombre.equalsIgnoreCase(nombre)) {
                contactoAEliminar = contacto;
                break;
            }
        }
        if (contactoAEliminar != null) {
            contactos.remove(contactoAEliminar);
            System.out.println("Contacto eliminado correctamente.");
        } else {
            System.out.println("No se encontró ningún contacto con ese nombre.");
        }
    }
}