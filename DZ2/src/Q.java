
public class Q <X extends B, Y extends B, Z extends  D>{
    public X x;
    public Y y;
    public Z z;

    public Q(X x, Y y, Z z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int calcAll() {
        return x.calc2() + y.calc2() + z.calc();
    }

}
