package composite;

public class SalesDepartment implements Department {

    public void printDepartmentName() {
        System.out.println(getClass().getSimpleName());
    }

}