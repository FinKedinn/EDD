package ec.ecu.ups.practicadatosjz;

public class Contacto<T> {
    
    T nombre;
    T telefono;

    public Contacto(T nombre, T telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public T getNombre() {
        return nombre;
    }

    public void setNombre(T nombre) {
        this.nombre = nombre;
    }

    public T getTelefono() {
        return telefono;
    }

    public void setTelefono(T telefono) {
        this.telefono = telefono;
    }
    
        

}
