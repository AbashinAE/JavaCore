package DZ_3;

import SM3.Task1.employees.Employee;

public class EmployeeUtils {
    public static void upSalary(SM3.Task1.employees.Employee[] employees) {
        for (Employee employee : employees){
            if(employee.getAge() > 45) employee.setSalary(employee.getSalary() + 5000);
        }
    }
}
