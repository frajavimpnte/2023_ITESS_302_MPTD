/*
 * ITESS-TICS-TI-501-MPTD
 * Periodo Agosto-Diciembre 2023
 * U1. Programacion lineal 
 * Descripsión: TEST implementación del metodo simplex ( z maz, r <= b )
 * by FJMP
 * email: frajavimopu@gmail.com
 * 29/sept/2023
*/
package tools;

/**
 *
 * @author TICS03
 */
public class SimplexMethodTest {
    public static void main(String ... args) {
        SimplexMethod sm = new SimplexMethod(3,4);
        
        float r0[] = {0, 1, -3, -6, 9, 0, 1, -2, 0, 0};
        
        sm.add(0, r0);
        System.out.println("index: " + sm.optimality());
    }
}
