import javax.lang.model.util.ElementScanner6;

public class Seniordeveloper extends Developer {
    private double salary;
    private String joiningDate;
    private String staffRoomnumber;
    private int contractPeriod;
    private double advanceSalary;
    private boolean appointed;
    private boolean terminates;

    public Seniordeveloper(String platform,String interviewername,int workinghour,double salary,int contractPeriod){
        super(platform,interviewername,workinghour);
        this.salary=salary;
        this.contractPeriod=contractPeriod;
        this.joiningDate="";
        this.staffRoomnumber="";
        this.advanceSalary=0.0;
        this.appointed=false;
        this.terminates=false;
    }
    public double getSalary(){
        return salary;
    } 
    public String getjoidate(){
        return joiningDate;
    } 
    public String getStaffRoomnumber(){
        return staffRoomnumber;
    }
    public int getContractperiod(){
        return contractPeriod;
    }
    public double getAdvancesalary(){
        return advanceSalary;
    }
    public boolean getAppointed(){
        return appointed;
    }
    public boolean getTerminated(){
        return terminates;
    }
    public void setSalary(double salary){
        this.salary=salary;
    }
    public void setContractPeriod(int contractPeriod){
        this.contractPeriod=contractPeriod;
    }
    
    public void hiredeveloper(String developername,String joiningdate,double advancsalary,String staffRoomnumber){
        if(appointed == true){
        System.out.println("The developer name is"+developername +" and the staff room number is"+staffRoomnumber);
        }
        else{
            super.setDevelopername(developername);
            this.joiningDate=joiningdate;
            this.staffRoomnumber=staffRoomnumber;
            this.advanceSalary=advancsalary;
            this.appointed=true;
            this.terminates=false;
        }
        

        public void display(){
            If()
        }

       
    }


}
