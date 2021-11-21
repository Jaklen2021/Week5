package Task4;


public class Task4 {

    
    public static void main(String[] args) {
        
        Abstractfactory t1=producer.gettype(false);
        System.out.println("the CS techingAssistant");
        typeStaff s=t1.gettype("CS");
        s.printdepart();
        t1.getsalaary(1000);
        t1.getyearsofwork(3);
        
        System.out.println("the is techingAssistant");
          typeStaff s2=t1.gettype("is");
          s2.printdepart();
          t1.getsalaary(1100);
          t1.getyearsofwork(5);
          System.out.println("the it teching assistant");
          typeStaff s3=t1.gettype("it");
          s3.printdepart();
          t1.getsalaary(1400);
          t1.getyearsofwork(6);
           System.out.println("********************************/n");
              Abstractfactory t2=producer.gettype(true);
               System.out.println("the cs doctor");
                typeStaff d=t2.gettype("cs");
                d.printdepart();
        t2.getsalaary(10000);
        t2.getyearsofwork(5);
        System.out.println("the is Doctor");
          typeStaff d2=t2.gettype("is");
          d2.printdepart();
          t2.getsalaary(11000);
          t2.getyearsofwork(6);
          System.out.println("the it doctor");
          typeStaff d3=t2.gettype("it");
          d3.printdepart();
          
          t2.getsalaary(14000);
          t2.getyearsofwork(10);
          
    }
    
}
