package ie.gmit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class EmployeeTest {

    Employee employee = new Employee("Mr", "Fatmir", "78AG84TU",
            845168457, "Full-time", 30 );

    @Test
    void titleTest()
    {
        assertEquals("Mr", employee.getTitle());
    }

    @Test
    void noTitleTest()
    {
        assertThrows(IllegalArgumentException.class,  () -> new Employee("Mr", "", "78AG84TU",
                845168457, "Full-time", 30 ));
    }

    @Test
    void nameTest()
    {
        assertEquals("Fatmir", employee.getName());
    }

    @Test
    void noNameTest()
    {
        assertThrows(IllegalArgumentException.class, () -> new Employee("Mr", "", "78AG84TU",
                845168457, "Full-time", 30 ));
    }

    @Test
    void ppsTest()
    {
        assertEquals("78AG84TU", employee.getPps());
    }

    @Test
    void noPpsTest()
    {
        assertThrows(IllegalArgumentException.class, () -> new Employee("Mr", "Fatmir", "",
                845168457, "Full-time", 30 ));
    }

    @Test
    void phoneTest()
    {
        assertEquals(845168457, employee.getPhone());
    }

    @Test
    void noPhoneTest()
    {
        assertThrows(IllegalArgumentException.class, () -> new Employee("Mr", "Fatmir", "78AG84TU",
                0, "Full-time", 30 ));
    }

    @Test
    void employeeTypeTest()
    {
        assertEquals("Full-time", employee.getEmploymentType());
    }

    @Test
    void noEmployeeTypeTest()
    {
        assertThrows(IllegalArgumentException.class, () -> new Employee("Mr", "Fatmir", "78AG84TU",
                845168457, "", 30 ));
    }

    @Test
    void employeeAgeTest()
    {
        assertEquals(30, employee.getEmployeeAge());
    }

    @Test
    void noEmployeeAgeTest()
    {
        assertThrows(IllegalArgumentException.class, () -> new Employee("Mr", "Fatmir", "78AG84TU",
                845168457, "Full-time", 0 ));
    }


}

