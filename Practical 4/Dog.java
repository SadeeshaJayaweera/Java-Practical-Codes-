public class Dog extends Mammal{
    public static void main(String args[])
    {
        Animal a = new Animal();
        Mammal m = new Mammal();
        Dog d = new Dog();
        System.out.println(m instanceof Animal);
        System.out.println(d instanceof Mammal);
        System.out.println(d instanceof Animal);
    }

    /*
    The output of the code is as follows
    true
    true
    true


    The given code snippet defines several classes in separate files: Animal, Mammal, Reptile, and Dog.
    The Dog class is a subclass of Mammal which, in turn, is a subclass of Animal.
    The code includes a main method in the Dog class, which tests the usage of the instanceof operator.
    Let's discuss the output of the code:

    System.out.println(m instanceof Animal); - This statement checks if the object m of type Mammal is an instance of Animal.
    Since Mammal extends Animal, the output will be true.

    System.out.println(d instanceof Mammal); - This statement checks if the object d of type Dog is an instance of Mammal.
    Since Dog is a subclass of Mammal, the output will be true

    System.out.println(d instanceof Animal); - This statement checks if the object d of type Dog is an instance of Animal.
    Since Dog is a subclass of Mammal, which is a subclass of Animal, the output will be true

     */

}
