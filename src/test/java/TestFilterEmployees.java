import city.service.Employee;
import org.junit.Test;
import util.FilterEmployees;
import util.StringProcessor;

import java.util.List;

import static junit.framework.TestCase.assertEquals;

public class TestFilterEmployees {

    @Test
    public void testFilterEmployees() {
        // Setup
        StubCityService stubApi = new StubCityService();
        FilterEmployees filterUtil = new FilterEmployees();
        Employee expectedEmployee = stubApi.getEmployees().get(0);

        // Run
        List<Employee> filtered = filterUtil.filter(stubApi.getEmployees(), "Edmonton");

        // Verify
        assertEquals(1, filtered.size());
        assertEquals(filtered.get(0), expectedEmployee);
    }
}