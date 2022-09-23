public class MainPercobaan4 {
    public static void main(String[] args) {
        Penumpang p = new Penumpang("731234984", "Bagus Raharjo");
        Gerbong gerbong = new Gerbong("C", 20);//jumalah kursi
        gerbong.setPenumpang(p, 5);
        System.out.println(gerbong.info());
    }
}
