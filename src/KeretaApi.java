public class KeretaApi {
    
    private String nama, kelas;
    private Pegawai masinis;
    private Pegawai asisten;

    KeretaApi(String nama, String kelas, Pegawai masinis) {
        this.nama = nama;
        this.kelas = kelas;
        this.masinis = masinis;
    }

    KeretaApi(String nama, String kelas, Pegawai masinis, Pegawai asisten) {
        this.nama = nama;
        this.kelas = kelas;
        this.masinis = masinis;
        this.asisten = asisten;
    }

    public void setNama(String newNama) {
        nama = newNama;
    }

    public String getNama() {
        return nama;
    }

    public void setKelas(String newKelas) {
        kelas = newKelas;
    }

    public String getKelas() {
        return kelas;
    }

    public void setMasinis(Pegawai newMasinis) {
        masinis = newMasinis;
    }

    public Pegawai getMasinis() {
        return masinis;
    }

    public void setAsisten(Pegawai newAsisten) {
        asisten = newAsisten;
    }

    public Pegawai getAsisten() {
        return asisten;
    }

    public String info() {
        String info = "";
        info += "Nama : " + this.nama + "\n";
        info += "Kelas : " + this.kelas + "\n";
        info += "Masinis : " + this.masinis.info() + "\n";
        return info;
    }
}
