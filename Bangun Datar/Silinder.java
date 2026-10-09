public class Silinder extends Lingkaran {
    private double tinggi;
    public Silinder(double radius, double tinggi, String warna) {
        super(radius, warna);
        this.tinggi = tinggi;
    }
    public double getTinggi() {
        return tinggi;
    }
    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
    public double HitungVolume() {
        return super.HitungLuas() * tinggi;
    }
    @Override
    public void printInfo() {
        System.out.println("Silinder berwarna " + warna
                + ", volume = " + HitungVolume());
    }
}