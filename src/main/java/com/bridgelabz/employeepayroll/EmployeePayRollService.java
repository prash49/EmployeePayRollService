package com.bridgelabz.employeepayroll;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeePayRollService {
    Scanner scanner = new Scanner(System.in);
    ArrayList<EmployeePayroll> employeePayrolls = new ArrayList<EmployeePayroll>();

    public static void main(String[] args) {
        EmployeePayRollService service = new EmployeePayRollService();
        service.readData();
        service.writeData();
    }

    private void readData() {
        EmployeePayroll employeePayroll = new EmployeePayroll();
        System.out.println("Enter Id");
        employeePayroll.setId(scanner.nextInt());
        System.out.println("Enter Name");
        employeePayroll.setName(scanner.next());
        System.out.println("Enter Salary");
        employeePayroll.setSalary(scanner.nextInt());
        employeePayrolls.add(employeePayroll);
    }

    private void writeData() {
        System.out.println(employeePayrolls);
    }
}
