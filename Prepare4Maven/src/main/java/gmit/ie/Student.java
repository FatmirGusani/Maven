//Name : Fatmir
//Date : 08.03.2020
//Student Prepare Exam
//Follow Video - https://www.youtube.com/watch?v=NiGngP_97qY&feature=youtu.be&hd=1

package gmit.ie;

public class Student {

    private String name;
    private String email;

    public Student(String name, String email) {
        if(name == "" || email == "")
        {
            throw new IllegalArgumentException("Missing Data");
        }
        else {
            this.name = name;
            this.email = email;
        }
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

}
