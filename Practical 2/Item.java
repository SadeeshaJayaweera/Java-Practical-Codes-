public class Item {
    /*
    This is the java practical number two first question
     */


    //data
    int location;
    String description;

    //constructer

    public Item(int ItemLocation, String ItemDescription )
    {
        location=ItemLocation;
        description=ItemDescription;
    }

    //setter method for Location
    public void setLocation(int ItemLocation)
    {
        location=ItemLocation;
    }

    //getter method for Location
    public int getLocation()
    {
        return location;
    }

    //setter method for Description
    public void setDescription(String ItemDescription)
    {
        description=ItemDescription;
    }

    //getter method for Description
    public String getDescription()
    {
        return description;
    }



}
