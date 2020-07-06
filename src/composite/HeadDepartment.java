package composite;

import java.util.ArrayList;
import java.util.List;

public class HeadDepartment implements Department {

    private List<Department> childDepartments = new ArrayList<>();
 

    public void printDepartmentName() {
        System.out.println(getClass().getSimpleName() + " - head of:");
        childDepartments.forEach(Department::printDepartmentName);
//        childDepartments.forEach(child -> child.printDepartmentName());
//        for (Department child : childDepartments) {
//            child.printDepartmentName();
//        }
    }
 
    public void addDepartment(Department department) {
        childDepartments.add(department);
    }
 
    public void removeDepartment(Department department) {
        childDepartments.remove(department);
    }
}