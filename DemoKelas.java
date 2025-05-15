public class DemoKelas {
   public static void main(String[] args) {
       Siswa endy = new Siswa("Endy");

       Kelas k = new Kelas(endy);

       Siswa fikri = new Siswa("Fikri");
       k.tambahDibelakang(fikri);
       k.tambahDibelakang(new Siswa("Naufal"));
       k.tambahDibelakang(new Siswa("Azmi"));
       k.tambahDibelakang(new Siswa("Rahma"));
       k.tampilkanSemua();
   }
}
