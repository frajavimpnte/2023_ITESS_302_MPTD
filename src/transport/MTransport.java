/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transport;

/**
 *
 * @author TICS03
 */
public class MTransport {

    private int originPoint;
    private int destinyPoint;
    private float cost[][];
    private float[][] tableu;
    private float[] origin;
    private float[] destiny;
    private int newVBRow;
    private int newVBCol;

    public MTransport(int originPoint, int destinyPoint) {
        this.originPoint = originPoint;
        this.destinyPoint = destinyPoint;

        //Asignar espacio a cost y var
        tableu = new float[originPoint][destinyPoint];
    }

    public void setCost(float cost[][]) {
        this.cost = cost;
    }

    public void setOrigin(float origin[]) {
        this.origin = origin; 
    }

    public void setDestiny(float destiny[]) {
        this.destiny = destiny;
    }

    public void print() {
        //Imprimir la tabla de variables
        System.out.println("Tableu");
        for (int i = 0; i < originPoint; i++) {
            for (int j = 0; j <= destinyPoint; j++) {
                System.out.print(tableu[i][j] + "  ");
            }
            System.out.println("");
        }
        System.out.println("Costs");
        for (int i = 0; i < originPoint; i++) {
            for (int j = 0; j < destinyPoint; j++) {
                System.out.print(cost[i][j] + " ");
            }
            System.out.println("");
        }
        
        System.out.println("Origin");
        for (int i = 0; i < originPoint; i++)
             System.out.print(origin + "  ");
        System.out.println("");
          
        System.out.println("Destiny");
        for (int i = 0; i < destinyPoint; i++)
             System.out.print(destiny + "  ");
        System.out.println("");
            
    }

}
