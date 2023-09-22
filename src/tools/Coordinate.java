/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tools;

/**
 *
 * @author TICS03
 */
public class Coordinate {
    public static final float XMIN = -10.0f;
    public static final float XMAX =  30.0f;
    public static final float YMIN = -10.0f;
    public static final float YMAX =  30.0f;
    public static final int WIDTH = 300;
    public static final int HEIGHT = 300;
    
    public static final int toScreenX(float x) {
        return (int) ( (XMIN - x )/(XMIN-XMAX) * WIDTH);
    }
    
    public static final int toScreenY(float y) {
        return (int) ( (YMAX- y)/(YMAX - YMIN) * HEIGHT );
    }
}
