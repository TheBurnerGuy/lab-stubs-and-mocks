import org.junit.Test;

import org.mockito.Mock;
import salary.service.City;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class MockSalaries {

    @Mock
    public City cityMock = mock(City.class);

    @Test
    public void testMockEmployees() {
        List<String> cities = new ArrayList<>();
        cities.add("moscow");
        cities.add("edmonton");

        when(cityMock.listCities()).thenReturn(cities);

        verify(cityMock).listCities();
    }
}