public class Numbers
{
    public static void main(String[] args)
    {
        int[] numbers = {10, 20, 30, 40, 50};
        /*
        ----loop is used to iterate over an array of numbers.----
        int x is a variable declaration where x represents each element of the numbers
        array in each iteration of the loop.

        : numbers specifies the array to be iterated, which is numbers in this case.

        The code block within the curly braces {} is executed for each element of the array.*/

        for (int x : numbers)
        {
            if (x == 30)
            {
                break;
            }
            System.out.println(x);
        }
        System.out.println("I'm out of the loop now");
    }
}

            /*
                The Code output for the above is as follows

                10
                20
                I'm out of the loop now

                When we remove  the break - The output will be as follows
                10
                20
                30
                40
                50
                I'm out of the loop now

 */
