package composite;

public class FinancialDepartment implements Department {

    public void printDepartmentName() {
        System.out.println(getClass().getSimpleName());
    }
}