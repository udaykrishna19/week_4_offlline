
public class Testbox{
public static void main(String [] args){
    Box obj = new Box(5,5,5);
    System.out.print("the volume of box "+obj.volume());
    
   }
}

class Box{
    double height,width,length;
    Box(double height,double width,double length){
        this.height = height;
        this.width = width;
        this.length = length;
    }

    public double volume(){
        return width*height*length;
    }
}