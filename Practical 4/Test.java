public class Test extends Employee
{
    public static void main( String [] args)
    {
        Employee Mr_Bogdan = new Employee();
        Mr_Bogdan.setEmpName("Mr Bogdan");
        Mr_Bogdan.getEmpName();
        Mr_Bogdan.setEmpID(29008);
        Mr_Bogdan.getEmpID();
        Mr_Bogdan.setEmpDesignation("Group Cheif Executive Officer");
        Mr_Bogdan.getEmpDesignation();



        Employee Mr_Bird =  new Employee();
        Mr_Bird.setEmpName("Mr Bird");
        Mr_Bird.getEmpName();
        Mr_Bird.setEmpID(2855);
        Mr_Bird.getEmpID();
        Mr_Bird.setEmpDesignation("Director");
        Mr_Bird.getEmpDesignation();

        System.out.println("Mr Bogdan Details:  ");
        System.out.println("Employee Name is:  "+Mr_Bogdan.getEmpName());
        System.out.println("Employee ID: "+Mr_Bogdan.getEmpID());
        System.out.println("Employee Designation: "+Mr_Bogdan.getEmpDesignation());
        System.out.println("");


        System.out.println("Mr Bird Details: ");
        System.out.println("Employee Name is: "+Mr_Bird.getEmpName());
        System.out.println("Employee  ID: "+Mr_Bird.getEmpID());
        System.out.println("Employee Designation: "+ Mr_Bird.getEmpDesignation());


}

}