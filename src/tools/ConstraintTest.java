/*
 * 2023 ITESS-TICS MPTD
 * Unidad 1. Programación Lineal
 * ConstraintTest
 * By  FJMP
 * Fecha: 22/septiembre/2023
 */
package tools;

/**
 *
 * @author TICS03
 */
public class ConstraintTest {
    public static void main(String ...args) {
        Constraint c1 = new Constraint(-1,3,30);
        
        System.out.println("P1: " + c1.getP1());
        System.out.println("P1: " + c1.getP2());
    }
}
