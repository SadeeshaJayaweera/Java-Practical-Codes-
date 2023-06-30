public class Dog {
    String name,breed,color;
    int age;

    //below shows a constructer
    //it is not must to declare same names declated above in the parameter
    public void Dog(String Dogname,String Dogbreed, String Dogcolor, int Dogage)
    {
        String a,b,c,d;

        name=Dogname;
        breed=Dogbreed;
        color=Dogcolor;
        age=Dogage;
    }

    /*
    These are accessor methods use to access data of the above variables and return it when
    it is called inside the main method.
     */
    public String getName()
    {
        return name;
    }

    public String getBreed()
    {
        return breed;
    }

    public String getColor()
    {
        return color;
    }



    /*
    This is a Mutater method - which is used to change or update the variable value
    oftenly these methods are void as they do not return any value but only change the
    variable values

    in order to change the age we need to use the access method of get age.

     */

    public int getAge()
    {
        return age;
    }

    public void ChangeAge(int YearsPassed)
    {
        age=age+YearsPassed;
    }

    /*
    this is a no return type method which will directly print the values once it is called inside the main method
    we can clearly identify no return type method by the key word "void"
    */

    public void display()
    {
        System.out.println("The Dog Name is: "+name);
        System.out.printf("The Dog Breed is: "+breed);
        System.out.printf("\n");
        System.out.println("The Dog Color is: "+color);
        System.out.println("The Dog Age is: "+age);
        System.out.printf("\n");
    }


    /*
    --Good To Remember--
    We can call the main method in the same class rather than declaring the same class
    -- The code --
    public static void main(String [] args)
    {
       Dog Puppy = new Dog("Sparkles", "Siberian Husky" , "White", 1);
    }

     */


}
