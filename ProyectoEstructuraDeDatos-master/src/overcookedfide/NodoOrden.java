/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overcookedfide;

/**
 *
 * @author admin
 */
public class NodoOrden {
    private Order orden;
    private NodoOrden siguiente;

    public NodoOrden(Order orden) {
        this.orden = orden;
        this.siguiente = null;
    }

    public Order getOrden() {
        return orden;
    }

    public NodoOrden getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoOrden siguiente) {
        this.siguiente = siguiente;
    }
}
