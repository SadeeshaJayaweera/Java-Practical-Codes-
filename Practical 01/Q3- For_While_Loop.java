public class For_While_Loop {
    public static void main(String[] args)
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("Executing Loop:  " +i);
        }

        System.out.println("");

        // Same program in the While Loop
        /*
        in the below program i is defined again as
        int i as it was initially denoted under the for loop 
         */

        int i=0;
        while(i<5)
        {
            System.out.println("Executing Loop:  " +i);
            i++;
        }

    }
}


