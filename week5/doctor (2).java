package Task4;


public class doctor extends Abstractfactory{
   // int salary;
   // int num;
     @Override
    public typeStaff gettype(String name)
    {
    if(name.equalsIgnoreCase("is"))
    {  return new is();
    }
    else if(name.equalsIgnoreCase("cs"))
    {return new cs();}
    else if(name.equalsIgnoreCase("it"))
    {return new it();}
    return null;
}
//   @Override  
//    public void getsalary(int salary){
//    System.out.println("the salary of doctor is: "+salary);
//    }
     @Override
    public void getyearsofwork(int numberofyears){
     System.out.println("the number of years for the doctor is: "+numberofyears);
    }

    @Override
    void getsalaary(int salary) {
        System.out.println("the salary of doctor is: "+salary); 
        //To change body of generated methods, choose Tools | Templates.
    }
}
