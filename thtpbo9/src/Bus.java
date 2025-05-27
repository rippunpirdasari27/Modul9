class Bus extends Transportasi {
    public Bus(String nama, int jumlahKursi, String tujuan) {
        super(nama, jumlahKursi, tujuan);
    }

    @Override
    public double hitungHargaTiket() {
        return super.hitungHargaTiket() * 1.10;
    }

    @Override
    public double hitungHargaTiket(String kelasLayanan) {
        double harga = hitungHargaTiket();
        switch (kelasLayanan) {
            case "Bisnis":
                harga *= 1.25;
                break;
            case "VIP":
                harga *= 1.50;
                break;
            default:
                break;
        }
        return harga;
    }
}

class Kereta extends Transportasi {
    public Kereta(String nama, int jumlahKursi, String tujuan) {
        super(nama, jumlahKursi, tujuan);
    }

    @Override
    public double hitungHargaTiket() {
        return super.hitungHargaTiket() * 1.20;
    }

    @Override
    public double hitungHargaTiket(String kelasLayanan) {
        double harga = hitungHargaTiket();
        switch (kelasLayanan) {
            case "Bisnis":
                harga *= 1.25;
                break;
            case "VIP":
                harga *= 1.50;
                break;
            default:
                break;
        }
        return harga;
    }
}

class Pesawat extends Transportasi {
    public Pesawat(String nama, int jumlahKursi, String tujuan) {
        super(nama, jumlahKursi, tujuan);
    }

    @Override
    public double hitungHargaTiket() {
        return super.hitungHargaTiket() * 1.50;
    }

    @Override
    public double hitungHargaTiket(String kelasLayanan) {
        double harga = hitungHargaTiket();
        switch (kelasLayanan) {
            case "Bisnis":
                harga *= 1.25;
                break;
            case "VIP":
                harga *= 1.50;
                break;
            default:
                break;
        }
        return harga;
    }
}
