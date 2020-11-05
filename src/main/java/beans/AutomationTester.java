package beans;

public class AutomationTester extends Engineer {
    private String favoriteFramework;
    private boolean isBro;

    public AutomationTester() {
    }

    public String getFavoriteFramework() {
        return favoriteFramework;
    }

    public void setFavoriteFramework(String favoriteFramework) {
        this.favoriteFramework = favoriteFramework;
    }

    public boolean isBro() {
        return isBro;
    }

    public void setBro(boolean bro) {
        isBro = bro;
    }

    @Override
    public String toString() {
        return "AutomationTester{" +
                "favoriteFramework='" + favoriteFramework + '\'' +
                ", isBro=" + isBro +
                "} " + super.toString();
    }
}
