
class Karyawan {
    protected String nama;
    protected double gajiPokok;

    public Karyawan(String nama, double gajiPokok) {
        this.nama = nama;
        this.gajiPokok = gajiPokok;
    }

    public double hitungGaji() {
        return gajiPokok;
    }

    public double hitungGaji(boolean denganBonus) {
        if (denganBonus) {
            return gajiPokok + 2300000; 
        }
        return gajiPokok;
    }

    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Gaji: Rp" + hitungGaji());
    }
}

class SoftwareEngineer extends Karyawan {
    public SoftwareEngineer(String nama, double gajiPokok) {
        super(nama, gajiPokok);
    }

    @Override
    public double hitungGaji() {
        return gajiPokok + 2300000;
    }

    @Override
    public double hitungGaji(boolean denganBonus) {
        double bonus = denganBonus ? 1000000 : 0;
        return gajiPokok + 2300000 + bonus;
    }
}

class DataScientist extends Karyawan {
    public DataScientist(String nama, double gajiPokok) {
        super(nama, gajiPokok);
    }

    @Override
    public double hitungGaji() {
        return gajiPokok + 2500000;
    }

    @Override
    public double hitungGaji(boolean denganBonus) {
        double bonus = denganBonus ? 2300000 : 0;
        return gajiPokok + 2500000 + bonus;
    }
}

class Magang extends Karyawan {
    public Magang(String nama, double gajiPokok) {
        super(nama, gajiPokok);
    }

    @Override
    public double hitungGaji() {
        return gajiPokok;
    }

    @Override
    public double hitungGaji(boolean denganBonus) {
        double bonus = denganBonus ? 800000 : 0;
        return gajiPokok + bonus;
    }
}

public class Main {
    public static void main(String[] args) {
        Karyawan[] daftarKaryawan = {
            new SoftwareEngineer("Nina", 800000),
            new DataScientist("Tisam", 900000),
            new Magang("Tiara", 3000000)
        };

        System.out.println("=== Gaji Tanpa Bonus ===");
        for (Karyawan k : daftarKaryawan) {
            System.out.println("Nama: " + k.nama);
            System.out.println("Gaji: Rp" + k.hitungGaji());
            System.out.println("------------------------");
        }

        System.out.println("=== Gaji Dengan Bonus ===");
        for (Karyawan k : daftarKaryawan) {
            double gajiBonus = k.hitungGaji(true); 
            System.out.println("Nama: " + k.nama);
            System.out.println("Gaji + Bonus: Rp" + gajiBonus);
            System.out.println("------------------------");
        }
    }
}
