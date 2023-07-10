/*
This is the question number 3 regarding the salary and the bonus of the employee
The Object Code Can be Found as Employeeobj (Main Method)
 */
public class Employee
{
    private String EmpName;
    private int Salary,Bonus,Bonus_Amount;

    //getter and setter methods
    public String getEmpName()
    {
        return EmpName;
    }

    public void setEmpName(String EmpName)
    {
        this.EmpName = EmpName;
    }

    public int getSalary()
    {
        return Salary;
    }

    public void setSalary(int Salary)
    {
        this.Salary=Salary;
    }

    // constructer to pass the bonus value

    public Employee(int Bonus)
    {
        this.Bonus=Bonus;
    }

    public void display()
    {
        System.out.println("The Bonus is: " +Bonus);
        System.out.println("The Bonus Amount is: "+Bonus_Amount);
    }


    // method to calculate the Bonus Amount

    public void Bonus_Amount()
    {
        Bonus_Amount=Bonus+Salary;

    }




}
