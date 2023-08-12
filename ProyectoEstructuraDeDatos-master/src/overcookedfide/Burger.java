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
public class Burger {
    String ham_carne;
    String ham_queso;
    String ham_clasica;

    public Burger(String ham_carne, String ham_queso, String ham_clasica) {
        this.ham_carne = ham_carne;
        this.ham_queso = ham_queso;
        this.ham_clasica = ham_clasica;
    }

    public String getHam_carne() {
        return ham_carne;
    }

    public void setHam_carne(String ham_carne) {
        this.ham_carne = ham_carne;
    }

    public String getHam_queso() {
        return ham_queso;
    }

    public void setHam_queso(String ham_queso) {
        this.ham_queso = ham_queso;
    }

    public String getHam_clasica() {
        return ham_clasica;
    }

    public void setHam_clasica(String ham_clasica) {
        this.ham_clasica = ham_clasica;
    }
}
