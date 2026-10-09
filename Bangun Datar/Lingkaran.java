public class Lingkaran extends Bentuk {
    private double rad;
    public Lingkaran(double radius, String warna) {
        super(warna);
        this.rad = radius;
    }
    public double getRadius() {
        return rad;
    }
    public void setRadius(double r) {
        this.rad = r;
    }
    public double HitungLuas() {
        return Math.PI * rad * rad;
    }
    @Override
    public void printInfo() {
        System.out.println("Lingkaran berwarna " + warna
                + ", luas = " + HitungLuas());
    }
}