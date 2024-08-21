import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner =  new Scanner(System.in);
        ogrenciKayit OK = new ogrenciKayit();
        OgrenciOkuma OK2 = new OgrenciOkuma();
        spesifikOgrenciOku SOO = new spesifikOgrenciOku();
        int secim;
        do {
            System.out.println("Sisteme hoşgeldiniz. Yapmak istediğiniz işlemi seçiniz: ");
            System.out.println("1-Öğrenci ekle");
            System.out.println("2-Numaraya göre öğrenci sorgula");
            System.out.println("3-Numaraya sahip öğrencinin tek bir bilgisini sorgulama");
            System.out.println("4-Çıkış");
            secim = scanner.nextInt();

            switch (secim){
                case 1:
                    OK.ogrenciEkle();
                    break;
                case 2:
                    OK2.ogrenciOku();
                    break;
                case 3:
                    SOO.direktOgrenciOku();
                    break;
                case 4:
                    break;
            }
        }while (secim != 4);



    }
}