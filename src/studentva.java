public class studentva extends sharing {
    int installment;
    int GPA;

    public studentva(String name, int age, int ID, String nat, int installment, int GPA) {
        super(name, age, ID, nat);
        this.installment = installment;
        this.GPA = GPA;
    }

    public int getInstallment() {
        return installment;
    }

    public void setInstallment(int installment) {
        this.installment = installment;
    }

    public int getGPA() {
        return GPA;
    }

    public void setGPA(int GPA) {
        this.GPA = GPA;
    }

@Override
    public void print_al_details() {
         //   super.print_al_details();
            System.out.printf("name :" + name, "age :" + age, "ID :" + ID, "nat :" + nat, "installment :" + installment, "GPA :" + GPA);
        }
    }

