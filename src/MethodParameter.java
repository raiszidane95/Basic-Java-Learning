public class MethodParameter {
    public static void main(String[] args) {
        sayHello("Ariston", "Rais");
        sayHello("Rei", "Arsa");
        sayHello("Zark", "Rui");
    }

    static void sayHello(String firstName, String lastName) {
        System.out.println("Hello " + firstName + " " + lastName);
    }
}
