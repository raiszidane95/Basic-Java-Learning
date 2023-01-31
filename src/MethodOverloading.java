public class MethodOverloading {
    public static void main(String[] args) {
        sayHello();
        sayHello("Ariston");
        sayHello("Ariston", "Rais");
    }

    static void sayHello() {
        System.out.println("HelloWorld!");
    }

    static void sayHello(String firstName) {
        System.out.println("Hello " + firstName);
    }

    static void sayHello(String firstname, String lastName) {
        System.out.println("Hello " + firstname + " " + lastName);
    }
}
