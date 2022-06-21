public abstract class sharing {
    String name;
    int age;
    int ID;
    String nat;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNat() {
        return nat;
    }

    public void setNat(String nat) {
        this.nat = nat;
    }

    public sharing(String name, int age, int ID, String nat) {
        this.name = name;
        this.age = age;
        this.ID = ID;
        this.nat = nat;

    }
    public abstract void print_al_details();




}

