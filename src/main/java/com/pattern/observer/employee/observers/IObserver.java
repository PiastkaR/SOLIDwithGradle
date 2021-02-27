package com.pattern.observer.employee.observers;


import com.pattern.observer.employee.domain.Employee;

public interface IObserver {
    void callMe(Employee emp, String msg);
}
