public class TestEnhanceForLoop
{
    public static void main(String[] args)
    {
        int [] numbers = {10, 20, 30, 40, 50};
        for(int x : numbers )
        {
            System.out.print( x );
            System.out.print(",");
        }
        System.out.print("\n");

        String [] names = {"James", "Larry", "Tom", "Lacy"};
        for(String name : names )
        {
            System.out.print( name );
            System.out.print(",");
        }
    }

    /*
    Following are  the Amendments that i made
    1. (String[] args)
    2. semicolon missing on the line "print("")

    The output will be as Follows
    10,20,30,40,50
    James,Larry,Tom,Lacy


     */
}
