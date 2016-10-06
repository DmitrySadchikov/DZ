
public class Z implements D {
    public int z;

    public Z(int z) {
        this.z = z;
    }

    @Override
    public int calc() {
        this.z = z * 10;
        return z;
    }
}
