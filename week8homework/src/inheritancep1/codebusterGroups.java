package inheritancep1;

//p1 sub class
public class codebusterGroups extends codebuster {
    public static void main(String[] args) {
        codebusterGroups dc=new codebusterGroups();
        dc.groupName();
    }
    public void groupName(){
        System.out.println("This is child class ");
    }
}
