package DZ_3;

import SM3.Task1.employees.Employee;

import java.util.ArrayList;
import java.util.List;

public class Organization {
    private String nameOrg;
    private int empCount;
    private String address;
    private List<Department> deplist;
    private Employee manager;

    public Organization(String nameOrg, int empCount, String address, Employee manager) {
        this.nameOrg = nameOrg;
        this.empCount = empCount;
        this.address = address;
        this.manager = manager;
        deplist = new ArrayList<Department>();
    }

    public Organization(String name){

    }

    public Organization() {
        deplist = new ArrayList<Department>();

    }

    public void addDepartment(Department dep) {
        deplist.add(dep);
    }

    public String getNameOrg() {
        return nameOrg;
    }

    public void setNameOrg(String nameOrg) {
        this.nameOrg = nameOrg;
    }

    public int getEmpCount() {
        return empCount;
    }

    public void setEmpCount(int empCount) {
        this.empCount = empCount;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Department> getDeplist() {
        return deplist;
    }

    public void setDeplist(List<Department> deplist) {
        this.deplist = deplist;
    }

    public Employee getManager() {
        return manager;
    }

    public void setManager(Employee manager) {
        this.manager = manager;
    }

    @Override
    public String toString() {
        return "Organization{" +
                "nameOrg='" + nameOrg + '\'' +
                ", empCount=" + empCount +
                ", address='" + address + '\'' +
                ", deplist=" + deplist +
                ", manager=" + manager +
                '}';
    }
}
