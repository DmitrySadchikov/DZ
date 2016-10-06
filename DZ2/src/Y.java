
public class Y implements B{
    public int y;

    public Y(int y) {
        this.y = y;
    }

    @Override
    public int calc2() {
        this.y = y + y;
        return y;
    }
}
