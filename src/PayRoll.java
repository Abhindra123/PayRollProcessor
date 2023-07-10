   class  SalariedEmployee{

       String name;
       double salary;
       double hourlyRate;
       double hoursWorked;

    public void calculatePay( String name,double salary){
        System.out.println("The Worker Mr."+name+" Salary is"+" "+(salary*30));
    }
    public void calculatePay( String name,double hourlyRate, double hoursWorked){
        System.out.println("The Worker Mr."+name+" Salary is"+" "+(hourlyRate*hoursWorked));
    }

}



public class PayRoll {
    public static void main(String[] args) {


SalariedEmployee salariedEmployee=new SalariedEmployee();
salariedEmployee.name="e1";
salariedEmployee.salary=20000.0;
salariedEmployee.hourlyRate=1.2;
salariedEmployee.hoursWorked=23.1;
salariedEmployee.calculatePay(salariedEmployee.name,salariedEmployee.salary);
        salariedEmployee.calculatePay(salariedEmployee.name,salariedEmployee.hourlyRate,salariedEmployee.hoursWorked);
    }
}