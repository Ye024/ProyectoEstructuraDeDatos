/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overcookedfide;

import java.util.Random;
import overcookedfide.Order.TipoHamburguesa;

/**
 *
 * @author admin
 */
public class ColaOrden {

    private NodoOrden frente;
    private NodoOrden ultima;
    private int size;
    private GUIOverCooked mainFrame; // Agregar referencia al JFrame

    public ColaOrden(GUIOverCooked mainFrame) {
        this.mainFrame = mainFrame;
        frente = null;
        ultima = null;
        size = 0;
    }

    public boolean estaVacia() {
        return frente == null;
    }

    public int getSize() {
        return size;
    }

    public void encolar(Order orden) {
        NodoOrden nuevoNodo = new NodoOrden(orden);
        if (getSize() < 3) {
            if (estaVacia()) {
                frente = nuevoNodo;
                ultima = nuevoNodo;
            } else {
                ultima.setSiguiente(nuevoNodo);
                ultima = nuevoNodo;
            }
            size++;
        }
    }

    public Order desencolar() {
        if (estaVacia()) {
            return null;
        }
        Order orden = frente.getOrden();
        frente = frente.getSiguiente();
        size--;
        return orden;
    }

    public Order frente() {
        if (estaVacia()) {
            return null;
        }
        return frente.getOrden();
    }

    public void llenarConOrdenesAleatorias() {
        Random random = new Random();
        TipoHamburguesa[] tiposHamburguesas = TipoHamburguesa.values();

        while (true) {
            if (getSize() < 3) {
                TipoHamburguesa tipoAleatorio = tiposHamburguesas[random.nextInt(tiposHamburguesas.length)];
                Order ordenAleatoria = new Order(tipoAleatorio);
                encolar(ordenAleatoria);

                actualizarOrdenesEnJFrame(); // Actualizar los JLabels en el JFrame

                try {
                    Thread.sleep(20000); // Esperar 20 segundos
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private void actualizarOrdenesEnJFrame() {
        NodoOrden current = frente;
        int numeroOrden = 1;
        String lblingredient = "";
        if (current.getOrden().getTipo() == TipoHamburguesa.CARNE) {
            lblingredient = "Ingredientes: -Pan -Carne";
            
        }else if (current.getOrden().getTipo() == TipoHamburguesa.QUESO) {
            lblingredient = "Ingredientes: -Pan -Carne -Queso";
            
        }else if (current.getOrden().getTipo() == TipoHamburguesa.CLASICA) {
            lblingredient = "Ingredientes: -Pan -Carne -Lechuga -Queso";
            
        }
        mainFrame.actualizarlblingredient(lblingredient);
        while (current != null) {
            String labelText = current.getOrden().getTipo() + " - Puntos: " + current.getOrden().getPuntos();

            mainFrame.actualizarLabel(numeroOrden, labelText);

            current = current.getSiguiente();
            numeroOrden++;
        }
    }
}
