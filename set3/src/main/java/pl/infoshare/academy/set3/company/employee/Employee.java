package pl.infoshare.academy.set3.company.employee;

/**
 * Created by Karol Lotkowski
 * Organization: infoShare Academy
 */
public abstract class Employee {

    protected final String firstName;
    protected final String lastName;
    protected final String role;
    protected final String sex;

    public Employee(final String role, final String lastName, final String firstName, final String sex) {
        this.role = role;
        this.lastName = lastName;
        this.firstName = firstName;
        this.sex = getSex(sex);
    }

    public abstract void work();

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getRole() {
        return role;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", role='" + role + '\'' +
                '}';
    }

    public String getSex(String s) {

        if (s == "Man")
            return "M";
        else if (s == "Woman")
            return  "W";
        return "";
    }
}
