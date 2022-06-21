public class animal {
    String name;

    public void eat(){
        System.out.println("I can eat");
    }
}
class dog extends animal {
    public void display() {
        System.out.println("My name is " + name);
    }

static class cat extends animal{
        public void displaycat(){
            System.out.println("my name is "+name);
        }
    }

    public static void main(String[] args) {
        dog mydog = new dog();
        mydog.name = "dog";
        mydog.display();
        mydog.eat();
        cat mtcat = new cat();
        mtcat.name="cat";
        mtcat.displaycat();
        mtcat.eat();

    }
}