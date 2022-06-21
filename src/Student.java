public class Student {
    int ID;
    static int count = 20220;
    String name;
    static String collage = "collage: LTUC";
    String password;
    boolean login;
    int amount;

    public Student(String name1, String passwordd, int amount1) {
        amount = amount1;
        password = passwordd;
        ID = count;
        name = name1;
        count++;
    }

    public boolean login(String entername, String enterpassword) {
        if (entername == name && enterpassword.equals(password)) {
            System.out.println("login successful");
            System.out.println("your name: " + name);
            System.out.println("your ID: " + ID);
            System.out.println("your amount: " + amount);
            System.out.println(collage);
            return true;
        }else
        System.out.println("login filed");
        return false;
    }
}

