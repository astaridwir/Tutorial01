public class Dosen {
    private String nama;
    private int kodeMatkul;

    public Dosen(String nama, int kodeMatkul) {
        this.nama = nama;
        this.kodeMatkul = kodeMatkul;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getKodeMatkul() {
        return kodeMatkul;
    }

    public void setKodeMatkul(int kodeMatkul) {
        this.kodeMatkul = kodeMatkul;
    }
}
