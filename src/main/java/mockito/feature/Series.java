package mockito.feature;

/**
 * Created by dcrespo on 27/02/14.
 */
public class Series {
    private String name = "Dexter";

    public String getName() {
        return name.concat("David");
    }

    public void setName(String name) {
        this.name = name;
    }
}
