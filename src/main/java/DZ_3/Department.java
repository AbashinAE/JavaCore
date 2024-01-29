package DZ_3;

public class Department {

    public static Accounting accounting;

    static {
        accounting = new Accounting();
    }

    private String nameDep;

    public Department(String nameDep) {
        this.nameDep = nameDep;
    }

    @Override
    public String toString() {
        return "Department{" +
                "nameDep='" + nameDep + '\'' +
                '}';
    }
}
