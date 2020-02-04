package city.service;

/**
 * Stores employee data such as name, unique id, salary, and address.
 */
public class Employee {
    String name;
    int id;
    int salary;
    Address address;

    public Employee(String name, int id, int salary, Address address) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }
}