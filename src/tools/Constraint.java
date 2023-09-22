/*
 * 2023 ITESS-TICS MPTD
 * Unidad 1. Programación Lineal
 * Restricción lineal 2D
 * By  FJMP
 * Fecha: 22/septiembre/2023
 */
package tools;

/**
 *
 * @author TICS03
 */
public class Constraint {
    private float a1;
    private float a2;
    private float b1;

    public Constraint() {
    }

    public Constraint(float a1, float a2, float b1) {
        this.a1 = a1;
        this.a2 = a2;
        this.b1 = b1;
    }

    public float getA1() {
        return a1;
    }

    public void setA1(float a1) {
        this.a1 = a1;
    }

    public float getA2() {
        return a2;
    }

    public void setA2(float a2) {
        this.a2 = a2;
    }

    public float getB1() {
        return b1;
    }

    public void setB1(float b1) {
        this.b1 = b1;
    }

    @Override
    public String toString() {
        return "Constraint{" + "a1=" + a1 + ", a2=" + a2 + ", b1=" + b1 + '}';
    }    
}
