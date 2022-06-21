public class employee extends sharing {
    int slary;
    int working_hours;


    public employee(String name, int age, int ID, String nat, int slary, int working_hours) {
        super(name, age, ID, nat);
        this.slary = slary;
        this.working_hours = working_hours;
    }

    public int getSlary() {
        return slary;
    }

    public void setSlary(int slary) {
        this.slary = slary;
    }

    public int getWorking_hours() {
        return working_hours;
    }

    public void setWorking_hours(int working_hours) {
        this.working_hours = working_hours;
    }

    @Override
    public void print_al_details() {
      //  super.print_al_details();
        System.out.printf("name :" + name,"age :"+age,"ID :"+ID,"nat :"+nat,"salary"+slary,"working_hours"+working_hours);

    }

}
