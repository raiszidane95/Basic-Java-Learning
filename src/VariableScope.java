public class VariableScope {

    public static void main(String[] args) {
        var number = 1;
        sayHello("Ariston");
        System.out.println(number);
    }

    static void sayHello(String name) {
        String hello = "Hello" + name;
        if (!name.isBlank()) {
            String hi = "Hi " + name;
            System.out.println(hi);
        }
    }
}
