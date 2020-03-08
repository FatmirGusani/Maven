//Name : Fatmir
//Date : 08.03.2020
//Student Prepare Exam
//Follow Video - https://www.youtube.com/watch?v=NiGngP_97qY&feature=youtu.be&hd=1

package gmit.ie;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class TestStudent {

    @Test
    void testConstructor()
    {
        Student myStudent = new Student("Fatmir","fatmir@gmail.com");
        assertEquals("Fatmir", myStudent.getName());
    }

    @Test
    void testConstructorNoName()
    {
        assertThrows(IllegalArgumentException.class, () -> new Student("", "fatmir@gmail.com"));
    }

    @Test
    void testConstructorNoEmail()
    {
        assertThrows(IllegalArgumentException.class, () -> new Student("Fatmir", ""));
    }












}
