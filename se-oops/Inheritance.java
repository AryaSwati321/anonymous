class Employee{
    String name,add,mail;
    float id,mobile,basic;
    void salary()
    {
        float da,hra,pf,cf,gross;
        da = basic*97/100;
        hra = basic * 10/100;
        pf = basic *12/100;
        cf = basic*0.1f/100;
        gross = basic+da+hra-pf-cf;
        System.out.println("Name:"+name);
        System.out.println("Basic salary:"+basic);
        System.out.println("Gross Salary:"+gross);
        System.out.println("mailid :"+mail);
         System.out.println("\n");
    }
}
class Programmer extends Employee{
    Programmer(String name,int sal,String mail)
    {
    System.out.println("Programmer Salary Details:");
    this.name = name;
    this.mail = mail;
    basic = sal;
    System.out.println("\n");
    }
    
}
class TeamLead extends Employee{
    TeamLead(String name,int sal,String mail)
    {
          System.out.println("Team Leader Salary Details:");
    this.name = name;
    this.mail = mail;
    basic = sal;
    System.out.println("\n");
    }
    
}
class APM extends Employee{
    APM(String name,int sal,String mail)
    {
        System.out.println("Assistant Project Manager Salary Details:");
    this.name = name;
    this.mail = mail;
    basic = sal;
    System.out.println("\n");
    }
}
class ProjectManager extends Employee{
    ProjectManager(String name,int sal,String mail)
    {
          System.out.println("Project Manager Salary Details:");
    this.name = name;
    this.mail = mail;
    basic = sal;
     System.out.println("\n");
    }
    
}
public class Inheritance{
    public static void main(String[] args){
        Programmer P = new Programmer("XYZ",50000,"XYZ@gmail.com");
        P.salary();
        
        TeamLead t = new TeamLead("PQR",60000,"PQR@gmail.com");
        t.salary();
        
         APM A = new APM("LMN",70000,"lmn@gmail.com");
        A.salary();
        
        ProjectManager PM = new ProjectManager("ABC",50000,"abc@hgmail.com");
        PM.salary();
        
    }
}

