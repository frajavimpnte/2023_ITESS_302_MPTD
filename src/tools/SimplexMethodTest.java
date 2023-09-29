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
        System.out.println(sm.optimality());
        
        SimplexMethod sm2 = new SimplexMethod(2,2); 
        float r02[] = {0, 1, 2, 3, 4, 0, 0};
        sm2.add(0, r02);
        System.out.println(sm2.optimality());
    }
}
