package ec.ecu.ups.practicadatosjz;

public class NodoGenerico<T> {

    T elemento;
    NodoGenerico<T> siguiente;

    public NodoGenerico(T elemento) {
        this.elemento = elemento;

    }

    public T getElemento() {
        return elemento;
    }

    public void setElemento(T elemento) {
        this.elemento = elemento;
    }

    public NodoGenerico<T> getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoGenerico<T> siguiente) {
        this.siguiente = siguiente;
    }

    
}