package assignment3d4;

class User {
    String name;
    int age;
    String address;

    public User(){
       this.name = "unknown";
       this.age = 0;
       this.address = "not available";
   }

   public void setInfo(String n, int a){
        name = n;
        age = a;
   }
   public void setInfo(String n, int a, String ad){
        name = n;
        age = a;
        address = ad;
   }
}
public class Usermain{
    public static void main(String[] args) {
        User[] users = new User[10];
        for (int i = 0; i < 10; i++) {
            users[i] = new User();
            users[i].setInfo("User" + (i + 1), (i + 1) * 10, "Address" + (i + 1));
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("Name: " + users[i].name + ", Age: " + users[i].age + ", Address : " + users[i].address);
        }
    }
}
