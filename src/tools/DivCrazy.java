
package tools;


public class DivCrazy {
    public static void main(String[] args) {
         float [][] m = {{1, 1}, {2,0}, {0, -6}, {1,8}, {-3,-4}};
         float [] pc = new float[m.length];
         
         for (int i = 0; i < m.length; i++) {
             pc[i] = m[i][1]/m[i][0];
             System.out.println(m[i][0] + " " +m[i][1] + " " + pc[i]);
         }
    }
}
