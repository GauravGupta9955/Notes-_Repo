class Z {
    public Z get() {
        System.out.println("In A class");
        return this;
    }
}

class C extends Z {
    @Override
    public C get() { // Covariant return type
        System.out.println("In B class");
        return this;
    }
}

public class InCovariantReturnType {
    public static void main(String[] args) {
        C ac = new C();
        ac.get();

        Z db = new Z();
        db.get();
    }
}