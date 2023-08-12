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
public class Order {

    public enum TipoHamburguesa {
        CARNE(5),
        QUESO(10),
        CLASICA(15);

        private final int puntos;

        TipoHamburguesa(int puntos) {
            this.puntos = puntos;
        }

        public int getPuntos() {
            return puntos;
        }
    }

    private TipoHamburguesa tipo;

    public Order(TipoHamburguesa tipo) {
        this.tipo = tipo;
    }

    public TipoHamburguesa getTipo() {
        return tipo;
    }

    public int getPuntos() {
        return tipo.getPuntos();
    }
}
