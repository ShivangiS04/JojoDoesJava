## **Access Modifiers in JAVA**

**Private =>**
The access level of a private modifier is only within the class. It cannot be accessed from outside the class.

**Default =>**
The access level of a default modifier is only within the package. It cannot be accessed from outside the package. If you do not specify any access level, it will be the default.

**Protected =>**
The access level of a public modifier is everywhere. It can be accessed from within the class, outside the class, within the package and outside the package.


```
package newpackage;


class Account {
   public String name;
   protected String email;
   private String password;


   public void setPassword(String password) {
       this.password = password;
   }
}
public class Sample {
   public static void main(String args[]) {
       Account a1 = new Account();
       a1.name = "Apna College";
       a1.setPassword("abcd");
       a1.email = "hello@apnacollege.com";
   }
}
