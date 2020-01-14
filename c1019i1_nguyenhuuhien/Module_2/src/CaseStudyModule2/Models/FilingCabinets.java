package CaseStudyModule2.Models;

import java.util.Stack;

public class FilingCabinets {
    Stack<Employee> stack = new Stack<>();
    Employee employee1 = new Employee("tuan", 28,"Quang tri" );
    Employee employee2 = new Employee("Son", 28,"Quang Ninh" );
    Employee employee3 = new Employee("Thanh", 28,"Quang tri" );
    Employee employee4 = new Employee("AJA", 33,"Quang Ngai" );
    Employee employee5 = new Employee("AJA", 33,"KJKJKJKJKJ" );

    public void showEmployeeProfile() {
        stack.push(employee1);
        stack.push(employee2);
        stack.push(employee3);
        stack.push(employee4);
        stack.push(employee5);
        while (!stack.isEmpty()) {
            Employee employee = new Employee();
            employee = stack.pop();
            System.out.println("-----------------");
            System.out.println(employee.showInfo());
        }
    }
}
                     