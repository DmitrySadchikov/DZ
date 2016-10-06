public class Main {

    public static void main(String[] args) {
        X x = new X(2);
        Y y = new Y(3);
        Z z = new Z(4);
        Q <X, Y, Z> q = new Q<>(x, y, z);

        System.out.println("Result: " + q.calcAll());
    }
}
