import exeptions.ArgumentExeption;
import models.Boat;
import models.RowBoat;
import models.SailBoat;
import models.Yacht;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws ArgumentExeption {

        Boat r=new RowBoat("miiiii",10,18);

        Boat m=new SailBoat("miiiii",3,5);
        Set boils=new HashSet();
        boils.add(r);
        boils.add(m);
        System.out.println();

    }
}
