import city.service.Address;
import city.service.Employee;

import java.util.ArrayList;
import java.util.List;

class StubCityService {

    public List<Employee> getEmployees() {
        List<Employee> data = new ArrayList<>();
        data.add(new Employee("John Doe", 1, 150000, new Address("Garneau", "Edmonton")));
        data.add(new Employee("James Doe", 2, 50000, new Address("South central", "Calgary")));

        return data;
    }
}
