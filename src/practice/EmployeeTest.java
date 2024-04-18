package practice;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeTest {

    public static void main(String[] args) {
        Employee employee1 = new Employee(1, "Karthik", 3000, "IT");
        Employee employee2 = new Employee(1, "Karthik", 5000, "Physics");
        Employee employee3 = new Employee(1, "Karthik", 3000, "IT");
        Employee employee4 = new Employee(1, "Karthik", 3000, "Physics");

        List<Employee> list = Arrays.asList(employee1, employee2, employee3, employee4);

        Map<String, Optional<Employee>> collect = list.stream().collect(Collectors.groupingBy(Employee::getDepName, Collectors.minBy(Comparator.comparingDouble(Employee::getSalary))));

        for(Map.Entry<String, Optional<Employee>> entry : collect.entrySet()){
            System.out.println(entry.getKey()+" " + entry.getValue().get());
        }

        System.out.println();

        Map<String, Optional<Employee>> collect1 = list.stream()
                .collect(Collectors.groupingBy(Employee::getDepName, Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))));


        for(Map.Entry<String,Optional<Employee>> set : collect1.entrySet()){
            System.out.println(set.getKey()+" "+set.getValue().get());
        }


    }
}

class Employee{
    int empId;
    String empName;
    double salary;
    String depName;

    public Employee(int empId, String empName, double salary, String depName) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
        this.depName = depName;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", salary=" + salary +
                ", depName='" + depName + '\'' +
                '}';
    }
}
