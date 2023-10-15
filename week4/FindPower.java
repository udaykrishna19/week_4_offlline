
public class FindPower{
    public static void main(String [] args){
         System.out.println(Power.powerInt(2,4));
         System.out.println(Power.powerDouble(3.3,3));
    }
}

class Power{
    public static int powerInt(int p1, int p2){
        int mux = 1;
          for(int i = 0; i<p2; i++){
            mux *= p1;
          }
          return mux;
    }

    public static double powerDouble(double p1, double p2){
        return Math.pow(p1,p2);
    }
}
