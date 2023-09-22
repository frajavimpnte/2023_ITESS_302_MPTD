/*
 * 2023 ITESS-TICS MPTD
 * Unidad 1. Programación Lineal
 * Point2D
 * By  FJMP
 * Fecha: 22/septiembre/2023
 */
package tools;

/**
 *
 * @author TICS03
 */
public class Point2D {
    private float x1;
    private float x2;

    public Point2D() {
    }

    public Point2D(float x1, float x2) {
        this.x1 = x1;
        this.x2 = x2;
    }

    public float getX1() {
        return x1;
    }

    public void setX1(float x1) {
        this.x1 = x1;
    }

    public float getX2() {
        return x2;
    }

    public void setX2(float x2) {
        this.x2 = x2;
    }

    @Override
    public String toString() {
        return "Point2D{" + "x1=" + x1 + ", x2=" + x2 + '}';
    }
    
    
}
