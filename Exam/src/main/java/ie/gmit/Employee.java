package ie.gmit;

public class Employee {

    private String title;
    private String name;
    private String pps;
    private int phone;
    private String employmentType;
    private int employeeAge;

    public Employee(String title, String name, String pps, int phone, String employmentType, int employeeAge) {
        if(title == "")
        {
            throw new IllegalArgumentException("Invlid title");
        }
        if(name == "")
        {
            throw new IllegalArgumentException("Invlid Name");
        }
        if(pps == "")
        {
            throw new IllegalArgumentException("Invlid PPS");
        }
        if(phone == 0)
        {
            throw new IllegalArgumentException("Invlid Phone");
        }
        if(employmentType == "")
        {
            throw new IllegalArgumentException("Invlid Employment Type");
        }
        if(employeeAge == 0)
        {
            throw new IllegalArgumentException("Invlid Employee Age");
        }
        else {
            this.title = title;
            this.name = name;
            this.pps = pps;
            this.phone = phone;
            this.employmentType = employmentType;
            this.employeeAge = employeeAge;
        }
    }
    public String getTitle() {
        return title;
    }

    public String getName() {
        return name;
    }

    public String getPps() {
        return pps;
    }

    public int getPhone() {
        return phone;
    }

    public String getEmploymentType() {
        return employmentType;
    }

    public int getEmployeeAge() {
        return employeeAge;
    }
}
