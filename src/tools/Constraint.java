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

    public Point2D getP2() {
        Point2D p2 = new Point2D();
        if (a1 != 0.0f && a2 != 0.0f && b1 != 0.0f) {
            // caso1: P1 (x1=0, ??) & P2(x1=X1MAX, ??)
            p2.setX1(Coordinate.XMAX);
            p2.setX2((b1-a1*Coordinate.XMAX)/a2);
        }
        return p2;
    }
    
    public Point2D getP1() {
        Point2D p1 = new Point2D();
        if (a1 != 0.0f && a2 != 0.0f && b1 != 0.0f) {
            // caso1: P1 (x1=0, ??) & P2(x1=X1MAX, ??)
            p1.setX1(0);
            p1.setX2(b1/a2);
        }
        return p1;
    }
    
    @Override
    public String toString() {
        return "Constraint{" + "a1=" + a1 + ", a2=" + a2 + ", b1=" + b1 + '}';
    }    
}
