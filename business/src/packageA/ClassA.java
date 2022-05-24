package packageA;

public class ClassA {
    public void publicMethod() {
        System.out.println("This public method from classA");
        privateMethod();
    }

    private void privateMethod() {
        System.out.println("This is private method classA");
    }

    protected void protectedMethod() {
        System.out.println("This is protected method classA");
    }

    void packageProtected() {
        System.out.println("This is package protected method classA");
    }
}
