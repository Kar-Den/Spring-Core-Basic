package beans;

import java.util.Set;

public class Manager {
    private String name;
    private int emailPerHour;
    private Set<Object> engineers;

    public Manager() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmailPerHour() {
        return emailPerHour;
    }

    public void setEmailPerHour(int emailPerHour) {
        this.emailPerHour = emailPerHour;
    }

    public Set<Object> getEngineers() {
        return engineers;
    }

    public void setEngineers(Set<Object> engineers) {
        this.engineers = engineers;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "name='" + name + '\'' +
                ", emailPerHour=" + emailPerHour +
                ", engineers=" + engineers +
                '}';
    }
}
