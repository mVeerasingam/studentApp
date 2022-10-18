package ie.atu.week5Lab;


public class StudentClass {
    private String email;
    private String name;
    private String course;


    public StudentClass()
    {
        email="";
        name="";
        course="";
    }

    public StudentClass(String email, String name, String course) {
        this.email = email;
        this.name = name;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}
