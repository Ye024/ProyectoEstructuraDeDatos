/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overcookedfide;

import java.util.Random;

/**
 *
 * @author admin
 */
public class ListaCircularIngredientes {

    private NodoIngredientes inicio;
    private NodoIngredientes ultimo;
    public int size;
    private int maxIngredientes = 5;

    public ListaCircularIngredientes() {
        inicio = null;
        size = 0;
    }

    public void inserta(Ingredient p) {
        if (inicio == null) {
            inicio = new NodoIngredientes(p);
            ultimo = inicio;
        } else if (p.getId() < inicio.getDato().getId()) {
            NodoIngredientes aux = new NodoIngredientes(p);
            aux.setNext(inicio);
            inicio = aux;
        } else if (ultimo.getDato().getId() <= p.getId()) {
            ultimo.setNext(new NodoIngredientes(p));
            ultimo = ultimo.getNext();
        } else {
            NodoIngredientes aux = inicio;
            while (aux.getNext().getDato().getId()
                    < p.getId()) {
                aux = aux.getNext();
            }
            NodoIngredientes temp = new NodoIngredientes(p);
            temp.setNext(aux.getNext());
            aux.setNext(temp);
        }
        ultimo.setNext(inicio);
    }

    public boolean estaVacia() {
        return size == 0;
    }

    public Ingredient eliminarIngrediente() {
        if (inicio == null) {
            return null;
        }

        Ingredient ingredienteEliminado = inicio.getDato();
        if (inicio == inicio.getNext()) {
            inicio = null;
        } else {
            NodoIngredientes temp = inicio;
            while (temp.getNext() != inicio) {
                temp = temp.getNext();
            }
            temp.setNext(inicio.getNext());
            inicio = inicio.getNext();
        }
        size--;
        return ingredienteEliminado;
    }
    
    public Ingredient extrae(String id) {
        Ingredient p = null;
        //si una persona tiene el id, lo extrae (eliminando y retornando)
        if (inicio != null) { //Si hay algo en la lista buscaré
            if (inicio.getDato().getIngredients().equalsIgnoreCase(id)) {
                inicio = inicio.getNext();
            } else {
                NodoIngredientes aux = inicio; //utilizo aux como indice
                //Mientras no se acabe la lista y el elemento
                //de la lista sea menor que el buscado
                while (aux.getNext() != null && aux.getNext().getDato().getId()
                        < 5) {
                    aux = aux.getNext();
                    //avanzo en la lista
                }
                // Si es el de adelante... quardo la persona y lo borro
                if (aux.getNext() != null && aux.getNext().getDato().getIngredients().equalsIgnoreCase(id)) {
                    p = aux.getNext().getDato();
                    aux.setNext(aux.getNext().getNext());//cambio las referencias
                }
            }
        }
        return p;
    }

    public void moverCinta() {
        
    }
}
