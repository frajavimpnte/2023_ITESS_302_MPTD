
package transport;

public class MTransportTest {
    public static void main(String[] args){
       MTransport mt = new MTransport (2,2);
      
       float[][] costos = {{1,2}, {3,4}};
       mt.setCost(costos);
       
       float origin[] = {5,10};
       mt.setOrigin(origin);
       
       float destiny[] = {2,13};
       mt.setDestiny(destiny);
       
       mt.print();
    }
}
