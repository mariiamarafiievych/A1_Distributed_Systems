package entities;
import java.util.UUID;


public final class StaffMember {

    private final UUID id;
    private final String Position;
    private final String FirstName;
    private final String LastName;
    private final double Salary;

    public StaffMember(String Position, String FirstName, String LastName, double Salary) {
        this.id = UUID.randomUUID();
        this.Position = Position;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Salary=Salary;
    }

    public String GetFirstName(){
        return FirstName;
    }

    public String GetLastName(){
        return LastName;
    }

    public String toString(){
        return "The " + this.Position+" "+ this.FirstName +" "+ this.LastName+ " with id " + this.id;
    }
}
