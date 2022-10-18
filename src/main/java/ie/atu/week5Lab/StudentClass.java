package ie.atu.week5Lab;


public class StudentClass {
    //private String email;
    private String name;
    //private String course;



    public StudentClass()
    {
        name="";
    }

    public StudentClass(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
