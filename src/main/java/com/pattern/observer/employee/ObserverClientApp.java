package com.pattern.observer.employee;

import com.pattern.observer.employee.domain.Employee;
import com.pattern.observer.employee.observers.HRDepartment;
import com.pattern.observer.employee.observers.IObserver;
import com.pattern.observer.employee.observers.PayrollDepartment;
import com.pattern.observer.employee.subjects.EmployeeManagementSystem;

import java.util.Date;

public class ObserverClientApp {
    public static void main(String[] args) {
        IObserver payroll = new PayrollDepartment();
        IObserver hrSystem = new HRDepartment();

        EmployeeManagementSystem ems = new EmployeeManagementSystem();
        ems.registerObserver(payroll);
        ems.registerObserver(hrSystem);

        Employee bob = new Employee("Bob", new Date(), 35000, 1, true);
        ems.hireEmployee(bob);

        ems.modifyEmployeeName(5, "Rafal");
    }
}
