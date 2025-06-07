class Parent {
    static void display() {
        System.out.println("Parent's static method");
    }
}

class Child extends Parent {
    static void display() {
        System.out.println("Child's static method");
    }
}

public class MethodHIding {
    public static void main(String[] args) {
        Parent.display(); // Calls Parent's static method
        Child.display(); // Calls Child's static method
        Parent cha =new Child();
        cha.display();
        
        
        Child ch =new Child();
        ch.display();
    }
}



