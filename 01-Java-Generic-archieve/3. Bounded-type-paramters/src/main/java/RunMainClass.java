import com.raj.nexusrunner.Disel;
import com.raj.nexusrunner.Glass;
import com.raj.nexusrunner.Juice;
import com.raj.nexusrunner.Water;

public class RunMainClass {
    public static void main(String [] args)
    {
        Glass<Water> waterGlass=new Glass<Water>(new Water());
        waterGlass.getQuantity();

        Glass<Juice> juiceGlass=new Glass<Juice>(new Juice());
        juiceGlass.getQuantity();

        //This will give error
       // Glass<Disel> diselGlass=new Glass<Disel>(new Disel());
    }
}
