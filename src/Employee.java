import java.util.Objects;

public class Employee {
    private final String lastName;
    private final String firstName;

    public Employee(String firstName, String lastName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getFirstName() {
        return firstName;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }
    @Override
    public String toString() {
        return "Employee{" +
                ", lastName='`'" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                '}';
    }
    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return Objects.equals(lastName, employee.lastName) && Objects.equals(firstName, employee.firstName);
    }
    @Override
    public int hashCode() {
        return Objects.hash( lastName, firstName);

    }
}
