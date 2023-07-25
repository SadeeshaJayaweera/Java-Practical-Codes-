public class TestInheritance {
    public static void main(String [] args )
    {
        SuperB b = new SuperB();
        b.setIt(2);
        b.increase();
        b.triple();
        System.out.println( b.returnIt() );

        SubC c = new SubC();
        c.setIt(2);
        c.increase();
        c.triple();
        System.out.println( c.returnIt() );
    }


    /*
    The Output is
    9 and 6
    ---- Good to Know ---
    in the class SuperB and class SubC there is a  method with the same name but with
    different operation which is triple(). Therefore,  when  the object is  called in  the SubC=new SubC()
    c.triple() will  get called in  the  SubC Class.


     */


}
