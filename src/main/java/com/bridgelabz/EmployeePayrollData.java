package com.bridgelabz;

public class EmployeePayrollData {
    private int id ;
    private String name;
    private Double salary;

    public EmployeePayrollData(Integer id, Double salary, String name) {
        this.id = id;
        this.salary = salary;
        this.name = name;
    }

    @Override
    public String toString() {
        return "id=" + id +
                ", salary=" + salary +
                ", name='" + name  ;
    }
}
