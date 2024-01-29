package DZ_3;

import java.util.ArrayList;
import java.util.List;

public class Branch extends Organization {
    private Organization org;
    private List<Employee> employees;
    public Branch(String branchName, int empCount, Organization org){
        super();
        employees = new ArrayList<Employee>();
        this.org = org;
        setNameOrg(branchName);
        setEmpCount(empCount);
    }

    public List<Employee> getEmployees() {
        return employees;
    }
}
