
package main.pkg4;


public class developer extends employee {
    String projectname;
    public developer(){
        System.out.println("sub class");
    }
    public developer (String n,String e,String ph ,String d,String add,int y,String p){
        super(n,e,ph,d,add,y);
        this.projectname=p;
        
    }

    public String getProjectname() {
        return projectname;
    }

    public void setProjectname(String projectname) {
        this.projectname = projectname;
    }
    
}
