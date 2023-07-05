package testjune12;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Assignment {
    private static int counter = 0;
    private int id;
    private String name;
    private String description;
    private List<String> quesList;
    private LocalDate startDate = LocalDate.now();
    private LocalDate endDate;

    public Assignment(String name,List<String> quesList,LocalDate endDate) {
        id = ++counter;
        this.name = name;
        this.quesList = quesList;
        this.endDate = endDate;
        quesList = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getQuesList() {
        return quesList;
    }

    public void setQuesList(List<String> quesList) {
        this.quesList = quesList;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Assignment that = (Assignment) o;
        return id == that.id && Objects.equals(name, that.name) && Objects.equals(description, that.description) && Objects.equals(quesList, that.quesList) && Objects.equals(startDate, that.startDate) && Objects.equals(endDate, that.endDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, description, quesList, startDate, endDate);
    }

    @Override
    public String toString() {
        return "Assignment{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", quesList=" + quesList +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }
}
