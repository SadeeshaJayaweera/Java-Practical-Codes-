// Monster class, subclass of Item
public class Monster extends Item {
    public Monster(int location, String description) {
        super(location, description);
    }

    public static void main(String[] args)
    {
        // creating an item object
        Item Item1 = new Item(1,"Foot Ball");
        System.out.println("Item Location: " +Item1.getLocation());
        System.out.println("Item Description: " +Item1.getDescription());

        Item Item2 = new Item(2,"Rugby Ball");
        System.out.println("\nItem Location: " +Item2.getLocation());
        System.out.println("Item Description: " +Item2.getDescription());


        // Creating an Mosnter Object
        Monster Mitem = new Monster(3,"Cricket Bat");
        System.out.println("\nItem Location: " +Mitem.getLocation());
        System.out.println("Item Description: " +Mitem.getDescription());

        Monster Mitem2 = new Monster(4, "Rugby Boot");
        System.out.println("\nItem Location: " +Mitem2.getLocation());
        System.out.println("Item Description: "+Mitem2.getDescription());



        /*
        ---- The Logic Behind the Getter and Setter Methods in the Code ----
        ---- Getter and Setter Methods ----

        In the provided code, the logic behind using getter and setter methods is to encapsulate and control
        access to the private variables `location` and `description` in the `Item` class.

        The getter methods `getLocation()` and `getDescription()` allow other parts of the program to retrieve
        the values of `location` and `description`, respectively. This provides read-only access to these variables,
        ensuring that external code can obtain their values without directly accessing the variables themselves.

        The setter methods `setLocation()` and `setDescription()` enable the modification of the `location` and
        `description` variables. By accepting parameters, these methods allow controlled updates to the variable values.
        This promotes data integrity and allows for validation or business logic to be applied before setting the values.

        By making the getter and setter methods public, they become accessible to other classes, while the underlying
        variables remain private. This encapsulation ensures that the internal representation of the `Item` class is
        hidden and can be modified without affecting the external code that uses the class.
        The getter and setter methods act as an abstraction layer, providing a well-defined
        interface for interacting with the class's data.

        Overall, the use of getter and setter methods in the provided code promotes encapsulation,
        maintains data integrity, and provides controlled access to the private variables of the `Item` class.


         */


    }
}