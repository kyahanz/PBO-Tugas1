public class DemoNilai {
    public static void main(String[] args) {
        Nilai mhs1 = new Nilai();

        mhs1.NIM = "2210631170023";
        mhs1.nama = "Johan";
        mhs1.n_absen = 70;
        mhs1.n_tugas = 85;
        mhs1.n_uts = 68;
        mhs1.n_uas = 88;

        mhs1.nilai();
        mhs1.cetakNilai();
    }
}
