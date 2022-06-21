public class revOOP {
    int ID;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    String name;
    float amount;


    public static void main(String[] args) {
        revOOP anas = new revOOP();
        anas.setName("anas");
        anas.setID(123456);
        anas.setAmount(600);
        System.out.println(anas.getName());
        System.out.println(anas.getID());
        System.out.println(anas.getAmount());
    }
}