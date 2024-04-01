
import javax.imageio.ImageReader;

public class Animal{
    public ImageReader picture;
    private String food;
    private int hunger;
    private int boundaries;
    private String location;
    
    public void makeNoise(){
        System.out.println("Aahhhhh");
    }
    public void eat(){
        System.out.println("Num Num Num");
    }
    public void sleep(){

    }
    public void roam(){
        System.out.println("I am moving");
    }
}