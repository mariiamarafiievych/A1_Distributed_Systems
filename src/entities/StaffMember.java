package entities;
import java.util.UUID;


public final class StaffMember {

    private final UUID id;
    private final String position;
    private final String firstName;
    private final String lastName;
    private final double salary;

    public StaffMember(String position, String firstName, String lastName, double salary) {
        this.id = UUID.randomUUID();
        this.position = position;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary =salary;
    }

    public String GetFirstName(){
        return firstName;
    }

    public String GetLastName(){
        return lastName;
    }

    public String toString(){
        return "The " + this.position +" "+ this.firstName +" "+ this.lastName + " with id " + this.id;
    }
}
