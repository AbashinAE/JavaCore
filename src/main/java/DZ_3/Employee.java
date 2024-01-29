package DZ_3;

public class Employee implements Comparable<Employee>{
    private String firstName;
    private String middleName;
    private String lastName;
    private int age;
    private String post;
    private String phoneNumber;
    private double salary;
    private Department empDep;


    public Employee(String firstName, String middleName, String lastName, int age, String post, String phoneNumber, double salary) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.age = age;
        this.post = post;
        this.phoneNumber = phoneNumber;
        this.salary = salary;

    }

    @Override
    public int compareTo(Employee o) {
        return o.firstName.compareTo(firstName);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", post='" + post + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", salary='" + salary +
                '}';
    }

    public int getAge() {
        return age;
    }

    public Department getEmpDep() {
        return empDep;
    }

    public void setEmpDep(Department empDep) {
        this.empDep = empDep;
    }

}