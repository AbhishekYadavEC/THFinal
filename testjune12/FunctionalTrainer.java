package testjune12;

public class FunctionalTrainer extends Trainer{
    String role; //primary or secondary

    public FunctionalTrainer(int id, String name, String email) {
        super(id, name, email);
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "FunctionalTrainer{" +
                "role='" + role + '\'' +
                "} " + super.toString();
    }
}
