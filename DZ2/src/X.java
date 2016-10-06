
public class X implements B{
    public int x;

    public X(int x) {
        this.x = x;
    }

    @Override
    public int calc2() {
        this.x = x * x;
        return x;
    }
}
