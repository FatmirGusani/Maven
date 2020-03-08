//Name : Fatmir
//Date : 08.03.2020
//Student Prepare Exam
//Follow Video - https://www.youtube.com/watch?v=NiGngP_97qY&feature=youtu.be&hd=1

package gmit.ie;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestStudentList {

    Student myStudent;
    StudentList myList;

    @BeforeEach
    void setup()
    {
        myStudent = new Student("Fatmir", "Fatmir@gmail.com");
        myList = new StudentList();
    }

    @Test
    void testAddStudent()
    {
        myList.addStudent(myStudent);
        assertEquals(1 ,myList.getSize());
    }

    @Test
    void testFindByNameStudent()
    {
        myList.addStudent(myStudent);
        assertEquals(myStudent, myList.findByName("Fatmir"));
    }
}
