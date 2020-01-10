import interfaces.Repair;

public class RepairImpl implements Repair {
    private String part;
    private int hoursWorked;

    public RepairImpl(String part,int hoursWorked){
        this.part=part;
        this.hoursWorked=hoursWorked;
    }
}
