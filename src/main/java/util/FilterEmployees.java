package util;

import city.service.Employee;

import java.util.List;
import java.util.stream.Collectors;

public class FilterEmployees {

    public List<Employee> filter(List<Employee> employees, String city) {
        if (city == null) {
            return employees;
        }

        return employees.
                stream().
                filter(employee -> employee.getAddress().getCity().equals(city))
                .collect(Collectors.toList());
    }
}
