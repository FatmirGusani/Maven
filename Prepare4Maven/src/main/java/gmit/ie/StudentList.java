//Name : Fatmir
//Date : 08.03.2020
//Student Prepare Exam
//Follow Video - https://www.youtube.com/watch?v=NiGngP_97qY&feature=youtu.be&hd=1

package gmit.ie;

import java.util.ArrayList;

public class StudentList {

    private ArrayList<Student> list;

    public StudentList()
    {
        list = new ArrayList<Student>();
    }

    public void addStudent(Student myStudent)
    {
        list.add(myStudent);
    }

    public int getSize()
    {
        list.size();
        return list.size();
    }

    public Student findByName(String name)
    {
        for(Student student : list)
        {
            if(student.getName().equals(name));
            {
                return student;
            }
        }
        return null;
    }




}
