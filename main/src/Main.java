public class Main {
    public static void main(String[] args) {
        System.out.println("First change in Branch1");
        System.out.println("Change from Branch2");
        MethodTwo(5, 8);
    }


    public static int MethodTwo(int a, int b) {
        return a + b;
    }
}
