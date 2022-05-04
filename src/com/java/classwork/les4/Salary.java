package com.java.classwork.les4;

public class Salary {
    public static void main(String[] args) {
        int employeeMonth1 = 3000;
        int employeeMonth2 = 4500;
        int employeeMonth3 = 5800;
        int year = 12;
        int employeeTenYear1 = employeeMonth1 * year * 10;
        int employeeTenYear2 = employeeMonth2 * year * 10;
        int employeeTenYear3 = employeeMonth3 * year * 10;

        System.out.println("зарплатня першого за 10 років " + employeeTenYear1);
        System.out.println("зарплатня другого за 10 років " + employeeTenYear2);
        System.out.println("зарплатня треетього за 10 років " + employeeTenYear3);

        double tax = 0.05;
        double afterTaxes1 = employeeTenYear1 - employeeTenYear1 * tax;
        double afterTaxes2 = employeeTenYear2 - employeeTenYear2 * tax;
        double afterTaxes3 = employeeTenYear3 - employeeTenYear3 * tax;

        System.out.println("зарплатня першого після налогів за 10 рокків " + afterTaxes1);
        System.out.println("зарплатня другого після налогів за 10 рокків " + afterTaxes2);
        System.out.println("зарплатня третього після налогів за 10 рокків " + afterTaxes3);

        double averageSalary = (afterTaxes1 + afterTaxes2 + afterTaxes3) / 3;

        System.out.println("середня зарплатня співробітників " + averageSalary);

    }
}
