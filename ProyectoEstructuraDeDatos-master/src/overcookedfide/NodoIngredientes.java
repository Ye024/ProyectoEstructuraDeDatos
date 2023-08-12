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
public class NodoIngredientes {
    private Ingredient dato;
    private NodoIngredientes next;
    

    public NodoIngredientes(Ingredient dato) {
        this.dato = dato;
    }

    public Ingredient getDato() {
        return dato;
    }

    public void setDato(Ingredient dato) {
        this.dato = dato;
    }

    public NodoIngredientes getNext() {
        return next;
    }

    public void setNext(NodoIngredientes next) {
        this.next = next;
    }
}
