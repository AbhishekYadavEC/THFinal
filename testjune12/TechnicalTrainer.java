package testjune12;

import java.util.List;

public class TechnicalTrainer extends Trainer{
    private List<String> langsKnown;
    private int experience;

    public TechnicalTrainer(int id, String name, String email) {
        super(id, name, email);
    }

    public List<String> getLangsKnown() {
        return langsKnown;
    }

    public void setLangsKnown(List<String> langsKnown) {
        this.langsKnown = langsKnown;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "TechnicalTrainer{" +
                "langsKnown=" + langsKnown +
                ", experience=" + experience +
                "} " + super.toString();
    }
}
