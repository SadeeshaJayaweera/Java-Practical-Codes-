public class Fruit
{
    /*
    This is a first exercise of the course to make a simple class and object for fruit
     */
    //data
    String name,color;
    int weight;

    //constrcuter
    public void Fruit (String Fruitname, String FruitColor, int Fruitweight)
    {
        name=Fruitname;
        color=FruitColor;
        weight=Fruitweight;
    }

    /*
    below shows access methods and at last there is a mutater method to change the variable value
     */
    public String getName()
    {
        return name;
    }

    public String getColor()
    {
        return color;
    }

    public void ChangeColor(String NewColour)
    {
      color=NewColour;
    }

    public void display()
    {
        System.out.printf("The Fruit Name is: " +name);
        System.out.printf("\nThe Fruit Color is: " +color);
        System.out.printf("\nThe Fruit weight is: " +weight);
        System.out.printf("\n");
    }
}
