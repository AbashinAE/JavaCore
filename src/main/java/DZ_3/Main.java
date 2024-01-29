package DZ_3;

public class Main {
    public static void main(String[] args) {
        Employee firstEmployee = new Employee("John", "Whane",
                "Gayce", 30, "manager", "+79002505055", 21415 );
        Employee secondEmployee = new Employee("Bob", "Lush",
                "Marlye", 50, "iceCreamMan", "+79002505055", 5235345 );
        Employee thirdEmployee = new Employee("Victor", "Locky",
                "Race", 25, "programmer", "+79002505055", 5235235 );
        Employee fourthEmployee = new Employee("Hanna", "Tom",
                "Soyer", 47, "developer", "+79002505055", 5235235 );
        Employee fifthEmployee = new Employee("Lizzy", "Whizzy",
                "Fill", 70, "tester", "+79002505055", 123214 );
        Employee [] employees = new Employee[]{fifthEmployee,secondEmployee,
                thirdEmployee,fourthEmployee,fifthEmployee};
        Department.accounting.addEmployee(new Employee("Lizzy", "Whizzy",
                "Fill", 70, "tester", "+79002505055", 123214));
//        System.out.println(Arrays.toString(employees));
//        EmployeeUtils.upSalary(employees);
//        System.out.println(Arrays.toString(employees));


        Organization organization = new Organization();
        Branch b1 = new Branch("Branch1",20, organization);
        Branch b2 = new Branch("Branch2",25, organization);
        organization.setNameOrg("Org1");
        Department dep1 = new Department("Department 1");
        Employee e1 = new Employee("Andrew", "Evgenevich",
                "Abashin", 39, "IT", "+79002505055", 45000 );
        e1.setEmpDep(dep1);
        b1.addDepartment(dep1);


        b1.getEmployees().add(e1);
        int countEmp = 0;
        for(Employee e: b1.getEmployees()){
            if(e.getEmpDep().equals(dep1)){
                countEmp++;
            }
        }

        System.out.println(countEmp);
//        System.out.println(organization);
//        System.out.println(b1);
//        System.out.println(b2);
//        System.out.println(dep1);

        Department.accounting.addEmployee(new Manager("Andrew", "Evgenevich",
                "Abashin", 39, "IT", "+79002505055", 45000));

        Department.accounting.bonusPay();
        Department.accounting.printEmployees();



    }
}