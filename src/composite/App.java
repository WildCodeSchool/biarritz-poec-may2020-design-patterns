package composite;

public class App {

    public static void main(String[] args) {

        Department financialDepartement = new FinancialDepartment();
        Department salesDepartement = new SalesDepartment();
        HeadDepartment headDepartement = new HeadDepartment();

        headDepartement.addDepartment(financialDepartement);
        headDepartement.addDepartment(salesDepartement);

        System.out.println("___");
        financialDepartement.printDepartmentName();
        System.out.println("___");
        salesDepartement.printDepartmentName();
        System.out.println("___");
        headDepartement.printDepartmentName();

    }

}
