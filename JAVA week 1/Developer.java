public class Developer{
private String platform;
private String interviewername;
private String developername;
private int workinghour;

public Developer(String platform,String interviewername,String developername,int workinghour){
    this.platform=platform;
    this.interviewername=interviewername;
    this.developername="";
    this.workinghour=workinghour;
}
    public String getPlatform(){
        return platorm;
    }
    public String getInterviewername(){
        return interviewername;
    }
    public String getdevelopername(){
        return developername;
    }
    public int getWorkinghour(){
        return developername;
    }
    public void setDevelopername(String developername){
        this.developername=developername;
    }
        public void display(){
            System.out.println("The platform is"+platform);
            System.out.println("The interviewername is" +interviewername);
            if(developername!=""){
                System.out.println("The developername is"+developername);
            }
            System.out.println("The working hour per day is"+workinghour);
        }
    }


