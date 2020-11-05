package beans;

import java.util.List;

public class Project {
    private String name;
    private List<Engineer> engineers;

    public Project() {
    }

    public Project(String name, List<Engineer> engineers) {
        this.name = name;
        this.engineers = engineers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Engineer> getEngineers() {
        return engineers;
    }

    public void setEngineers(List<Engineer> engineers) {
        this.engineers = engineers;
    }

    @Override
    public String toString() {
        return "Project{" +
                "name='" + name + '\'' +
                ", engineers=" + engineers +
                '}';
    }

    public void initProject(){
        System.out.println("Check budget for " + engineers.size() + " engineers");
        System.out.println("Check staging");
    }
}
