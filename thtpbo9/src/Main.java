public class Main {
    public static void main(String[] args) {
        Transportasi[] daftarTransportasi = new Transportasi[3];

        daftarTransportasi[0] = new Bus("Bus", 40, "Bandung");
        daftarTransportasi[1] = new Kereta("Kereta", 100, "Surabaya");
        daftarTransportasi[2] = new Pesawat("Pesawat", 180, "Medan");

        for (Transportasi t : daftarTransportasi) {
            System.out.println(t.getNama() + " ke " + t.getTujuan() + " - Harga tiket (default): " + t.hitungHargaTiket());

            if (t instanceof Bus) {
                System.out.println(t.getNama() + " ke " + t.getTujuan() + " - Harga tiket (Bisnis): " + t.hitungHargaTiket("Bisnis"));
            } else if (t instanceof Kereta) {
                System.out.println(t.getNama() + " ke " + t.getTujuan() + " - Harga tiket (VIP): " + t.hitungHargaTiket("VIP"));
            } else if (t instanceof Pesawat) {
                System.out.println(t.getNama() + " ke " + t.getTujuan() + " - Harga tiket (Ekonomi): " + t.hitungHargaTiket("Ekonomi"));
            }
            System.out.println();
        }
    }
}
