public class Item {
    protected int location;
    protected String description;

    public Item(int location, String description) {
        this.location = location;
        this.description = description;
    }

    //Getter Method for location
    public int getLocation() {
        return location;
    }

    //Setter Method for Location
    public void setLocation(int location) {
        this.location = location;
    }

    //Getter Method for Description
    public String getDescription() {
        return description;
    }

    //Setter Method for Description
    public void setDescription(String description) {
        this.description = description;
    }
}

