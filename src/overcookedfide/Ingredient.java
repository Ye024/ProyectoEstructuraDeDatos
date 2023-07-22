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
public class Ingredient {
    String tomate;
    String lechuga;
    String carne;
    String pan;

    public Persona1(String tomate, String lechuga, String carne, String pan) {
        this.tomate = tomate;
        this.lechuga = lechuga;
        this.carne = carne;
        this.pan = pan;
    }

    public String getTomate() {
        return tomate;
    }

    public void setTomate(String tomate) {
        this.tomate = tomate;
    }

    public String getLechuga() {
        return lechuga;
    }

    public void setLechuga(String lechuga) {
        this.lechuga = lechuga;
    }

    public String getCarne() {
        return carne;
    }

    public void setCarne(String carne) {
        this.carne = carne;
    }

    public String getPan() {
        return pan;
    }

    public void setPan(String pan) {
        this.pan = pan;
    }

}
