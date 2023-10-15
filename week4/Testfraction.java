public class Testfraction {
    public static void main(String [] args){
           Fraction f1 = new Fraction();
           Fraction f2 = new Fraction();
           
           f1.setND(4,2);
           f2.setND(6, 3);
           f1.sumFrac(f1, f2);
           System.out.print(f1.n+" / "+f1.d);
    }
    
}

class Fraction{
    int n,d ;

   public void setND(int n , int d){
          this.n = n;
          this.d = d;
   }

   public Fraction sumFrac(Fraction f1, Fraction f2){
          f1.n = (f1.n * f2.d) + (f2.n * f1.d);
          f1.d = f1.d * f2.d;
          return f1;     
   } 
}