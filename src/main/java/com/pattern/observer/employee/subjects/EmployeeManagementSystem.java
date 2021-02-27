package com.pattern.observer.employee.subjects;

import com.pattern.observer.employee.domain.Employee;
import com.pattern.observer.employee.domain.EmployeeDAO;
import com.pattern.observer.employee.observers.IObserver;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class EmployeeManagementSystem implements ISubject {
    private List<IObserver> observers;
    private Employee employee;
    private String message;
    private EmployeeDAO employeeDAO;
    private List<Employee> employees;

    public EmployeeManagementSystem() {
        observers = new ArrayList<>();
        employeeDAO = new EmployeeDAO();
        employees = employeeDAO.generateEmployees();
    }

    @Override
    public void registerObserver(IObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(IObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (IObserver department : observers) {
            department.callMe(employee, message);
        }
    }

    public void hireEmployee(Employee employee) {
        employees.add(employee);
    }

    public void modifyEmployeeName(int id, String employeeNewName) {
        boolean notify = false;
        for (Employee employee : employees) {
            if (id == employee.getEmployeeID()) {
                employee.setName(employeeNewName);
                this.employee = employee;
                this.message = "Employee name changed!";
                notify = true;
            }
        }

        if (notify)
            notifyObservers();
    }
}
