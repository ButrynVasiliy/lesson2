public class Task6Lesson3 {
    //6. Given a user's email address: john_smith@example.com. Create two strings "login" and "domain" which will be substrings of full email address.
    //   The First Name and Last Name of the user should be in the following format: "Name Surname".
    //   Result should be:
    //   login = "John Smith"
    //   domain = "example.com"
    public static void main(String[] args){
        String email = "john_smith@example.com";
        int index1 = email.indexOf("_");
        int index = email.indexOf("@");
        String loginName = email.substring(0, index1);
        String loginSername = email.substring(index1+1, index);
        String domain = email.substring(index+1, email.length());
        System.out.println("\'login\' - " +loginName.replace("j", "J") + " " +loginSername.replace("s", "S"));
        System.out.println("\'domain\' - " +domain);


    }
}
