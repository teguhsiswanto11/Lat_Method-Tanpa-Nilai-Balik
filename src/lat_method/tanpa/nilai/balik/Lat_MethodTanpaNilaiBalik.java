package lat_method.tanpa.nilai.balik;
/*
    method tanpa nlai balik = prosedure di pascal
*/

public class Lat_MethodTanpaNilaiBalik {

    public static void main(String[] args) {
        tampilDataOrang("Rizki", "Semar");
        tampilDataOrang("Andi", "Lembang");
    }
    
    // nama method haruslah kata kerja
    // parameter adalah gayungnya(gajung) yg menyimpan dari kolam renang ke ember
    public static void tampilDataOrang(String nama, String alamat ){
        System.out.println("Nama\t : "+nama); 
        System.out.println("Alamat\t : "+alamat); 
        System.out.println("");
        
    }
    
}
