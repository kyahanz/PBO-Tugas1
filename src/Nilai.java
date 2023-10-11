public class Nilai {
    String NIM, nama;
    float n_absen, n_tugas, n_uts, n_uas, n_akhir;

    void nilai(){
        n_absen = n_absen * 10 / 100;
        n_tugas = n_tugas * 20 / 100;
        n_uts = n_uts * 30 / 100;
        n_uas = n_uas * 40 / 100;
        n_akhir = n_absen + n_tugas + n_uts + n_uas;
    }

    void cetakNilai(){
        System.out.println("NIM\t\t\t\t\t: " + NIM);
        System.out.println("Nama\t\t\t\t: " + nama);
        System.out.println("Nilai Absen[10%]\t: " + n_absen);
        System.out.println("Nilai Tugas[20%]\t: " + n_tugas);
        System.out.println("Nilai UTS[30%]\t\t: " + n_uts);
        System.out.println("Nilai UAS[40%]\t\t: " + n_uas);
        System.out.println("Nilai Akhir\t\t\t: " + n_akhir);
    }
}
