package ec.ecu.ups.practicadatosjz;

class ListaEnlazada<T> {
    NodoGenerico<T> cabeza;

    public ListaEnlazada() {
        cabeza = null;
    }

    public void agregar(T dato) {
        NodoGenerico<T> nuevoNodo = new NodoGenerico<>(dato);
        if (cabeza == null) {
            cabeza = nuevoNodo;
        } else {
            NodoGenerico<T> actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevoNodo;
        }
    }

    public T buscar(T dato) {
        NodoGenerico<T> actual = cabeza;
        while (actual != null) {
            if (actual.elemento.equals(dato)) {
                return actual.elemento;
            }
            actual = actual.siguiente;
        }
        return null;
    }

    public void eliminar(T dato) {
        if (cabeza == null) {
            return;
        }

        if (cabeza.elemento.equals(dato)) {
            cabeza = cabeza.siguiente;
            return;
        }

        NodoGenerico<T> actual = cabeza;
        while (actual.siguiente != null) {
            if (actual.siguiente.elemento.equals(dato)) {
                actual.siguiente = actual.siguiente.siguiente;
                return;
            }
            actual = actual.siguiente;
        }
    }
}

