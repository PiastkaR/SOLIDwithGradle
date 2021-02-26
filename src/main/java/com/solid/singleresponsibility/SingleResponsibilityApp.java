package com.solid.singleresponsibility;

import com.solid.singleresponsibility.model.Employee;
import com.solid.singleresponsibility.reporting.EmployeeReportFormatter;
import com.solid.singleresponsibility.reporting.FormatType;
import com.solid.singleresponsibility.repository.EmployeeDao;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SingleResponsibilityApp {
    public static void main(String[] args) {
        Employee peggy = new Employee(1, "peggy","accounting", true);
        SingleResponsibilityApp.hireNewEmployee(peggy);
        printEmployeeReport(peggy, FormatType.CSV);
    }
    public static void hireNewEmployee(Employee employee){
        EmployeeDao EmployeeDao = new EmployeeDao();
        EmployeeDao.saveEmployee(employee);
    }

    public static void terminateEmployee(Employee employee){
        EmployeeDao EmployeeDao = new EmployeeDao();
        EmployeeDao.deleteEmployee(employee);
    }

    public static void printEmployeeReport(Employee employee, FormatType formatType){
        EmployeeReportFormatter formatter = new EmployeeReportFormatter(employee, formatType);
        log.info(formatter.getFormattedEmployee());
    }
}
