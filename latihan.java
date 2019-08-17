
class latihan {

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    String merek;
    String tipe;
    int numberPlat;
    String pemilik;
    String warna;

    latihan(String mrk, String tp, int num) {
        merek = mrk;
        tipe = tp;
        numberPlat = num;
        pemilik = "mpk munah";
    }

    latihan(String mrk, String tp, int num, String pmlk) {

        merek = mrk;
        tipe = tp;
        numberPlat = num;
        pemilik = pmlk;

    }

    public String getInitials() {

        String initials = "";
        for (int i = 0; i < pemilik.length(); i++) {
            char pMobil = pemilik.charAt(i);
            if (pMobil >= 'A' && pMobil <= 'Z') {
                initials = initials + pMobil + '.';
            }
        }
        return initials;
    }

}

class latihanMobil {

    public static void main(String[] args) {

        latihan m0, m1, m2, m3;

        m0 = new latihan("grobak", "S", 2312);
        m0.setWarna("kuning");
        System.out.println("\n"+"nama : " + m0.merek
                + "\n"
                + "tipe :"
                + m0.tipe
                + "\n"
                + "number :"
                + m0.numberPlat
                + "\n"
                + "pemilik :"
                + m0.pemilik
                + "\n"
                + "warna :"
                + m0.getWarna());

        m2 = new latihan("Innova", "v", 2712, "jali");
        m2.setWarna("merah");
        System.out.println("\n"+"nama : " + m2.merek
                + "\n"
                + "tipe :"
                + m2.tipe
                + "\n"
                + "number :"
                + m2.numberPlat
                + "\n"
                + "pemilik :"
                + m2.pemilik
                + "\n"
                + "warna :"
                + m2.getWarna());

        m3 = new latihan("truck", "d", 2912, "Maimun Munah");
        m3.setWarna("hijau");
        System.out.println("\n"+"nama : " + m3.merek
                + "\n"
                + "tipe :"
                + m3.tipe
                + "\n"
                + "number :"
                + m3.numberPlat
                + "\n"
                + "pemilik :"
                + m3.getInitials()
                + "\n"
                + "warna :"
                + m3.getWarna());

        latihan[] l = new latihan[2];
        l[0] = new latihan("furtune", "c", 3030, "Syahrul Ramadan");
        l[1] = new latihan("furtune", "c", 3030, "Ujang Jali");

        for (latihan l1 : l) {
            System.out.println("\n"+"Singkatan Nama Yang Punya Mobil :" + l1.getInitials());
        }

    }

}
