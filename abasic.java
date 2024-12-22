public class abasic{
    public static void main(String args[]){
     Bankaccount bk=new Bankaccount();
     bk.setpassword("456");
     System.out.print(bk.getpassword());
    }
}
class Bankaccount{
    String name;
    String rollno;
    private String password="123456";
    String getpassword(){
        return this.password;
    }
    void setpassword(String changepassword){
        this.password=changepassword;
    }
}