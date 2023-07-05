package test5june.model;

public class Faculty extends Person{
    private String qualification;
    private double experience;

    //constructor
    public Faculty(String name, char gender, String state,String qualification, double experience){
        super(name, gender, state);
        this.qualification = qualification;
        this.experience = experience;
    }

    //getters and setters
    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public double getExperience() {
        return experience;
    }

    public void setExperience(double experience) {
        this.experience = experience;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Faculty faculty = (Faculty) o;
        return (qualification.equalsIgnoreCase(faculty.qualification) && experience == experience && getName().equalsIgnoreCase(faculty.getName()));
    }
}
