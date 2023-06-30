public class DogData
{
    public static void main(String []args)
    {
        /*
        syntax to declare an object is as follows
        <class name> <object name> = new <class name> ();
        the object name can be anything which the user may enter as "Puppy" i have used for this
         */
        Dog puppy = new Dog();
        puppy.Dog("Sparkles","Siberian Husky","white",1);
        puppy.display();

        Dog Tooby = new Dog();
        Tooby.Dog("Tooby", "Sri Lankan Dog", "Brown", 3);
        Tooby.display();

        Dog Jennifer = new Dog();
        Jennifer.Dog("Jeniffer", "German Shepherd", "Black and Tan", 2);
        Jennifer.display();

        /*
        This code below shows that we can call the variable assigned to puppy
        using the accessor method. once it  is called we can use it to print the value.
        these are accessor methods which are called inside the main method
         */
        String puppyName = puppy.getName();
        System.out.printf(""+puppyName);

        String puppyBreed = puppy.getBreed();
        System.out.printf("\n"+puppyBreed);

        String puppyColor = puppy.getColor();
        System.out.printf("\n"+puppyColor);

        int puppyAge = puppy.getAge();
        System.out.println("\n"+puppyAge);



        /*
        The below code shows how i called the mutater method and change the age of the puppy age.
        once the mutater method is called and parameter are given the variable age of the puppy
        will get updated and we easily print the get meethod to display the output.
         */

        puppy.ChangeAge(3);
        System.out.println(puppy.getAge());




    }
}
