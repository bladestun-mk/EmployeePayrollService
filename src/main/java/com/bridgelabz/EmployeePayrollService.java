package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeePayrollService {
    public List<EmployeePayrollData> employeePayrollList;

    public EmployeePayrollService(List<EmployeePayrollData> employeePayrollList) {
        this.employeePayrollList = employeePayrollList;
    }

    public static void main(String[] args) {
        ArrayList<EmployeePayrollData> employeePayrollList = new ArrayList<>();
        EmployeePayrollService employeePayrollService = new EmployeePayrollService(employeePayrollList);
        Scanner consoleInputReader = new Scanner(System.in);
        employeePayrollService.readEmployeePayrollData(consoleInputReader);
        employeePayrollService.writeEmployeePayrollData();
    }
    private  void readEmployeePayrollData(Scanner consoleInputReader) {
        System.out.println("Enter Employee id:");
        int id = consoleInputReader.nextInt();
        consoleInputReader.nextLine();
        System.out.println("Enter Employee Name:");
        String name = consoleInputReader.nextLine();
        System.out.println("Employee salary");
        double salary = consoleInputReader.nextInt();
       employeePayrollList.add(new EmployeePayrollData(id,salary,name));
    }
    private void writeEmployeePayrollData() {
        System.out.println("\n Writing employee Payroll Roaster to Console\n" + employeePayrollList);
    }

}
