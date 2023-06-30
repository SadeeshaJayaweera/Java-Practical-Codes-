public class FruitData {
    public static void main(String [] args)
    {
        Fruit Strawberry = new Fruit();
        Strawberry.Fruit("Strawberry","Red",10);
        Strawberry.display();

        Fruit Lemon = new Fruit();
        Lemon.Fruit("Lemon", "Yellow", 12);
        Lemon.display();

        /*
        Calling the mutater method to change the color of lemon
        once called the new color will be stored inside the variable color
        then we can used access method to print the new color using the below syntax.
        */
        Lemon.ChangeColor("Red");
        System.out.println(Lemon.getColor());
    }




}
