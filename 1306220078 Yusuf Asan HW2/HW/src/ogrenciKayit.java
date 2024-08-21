import java.io.*;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Scanner;
public class ogrenciKayit {
    void ogrenciEkle() throws IOException {
        Scanner scanner = new Scanner(System.in);
        int ogrenciSayi;
        System.out.println("Kaç öğrenci ekleyeceksiniz? ");
        ogrenciSayi = scanner.nextInt();
        String[][] ogrenciBilgileri = new String[ogrenciSayi][5];

        for(int i = 0; i<ogrenciSayi; i++){
            System.out.println(i+1+". Öğrencinin bilgilerini girin: ");
            System.out.println("Öğrenci Numarası: ");
            ogrenciBilgileri[i][0] = scanner.next();
            System.out.println("Adi: ");
            ogrenciBilgileri[i][1] = scanner.next();
            System.out.println("Soyadi: ");
            ogrenciBilgileri[i][2] = scanner.next();
            System.out.println("Sinifi: ");
            ogrenciBilgileri[i][3] = scanner.next();
            System.out.println("Bölümü: ");
            ogrenciBilgileri[i][4] = scanner.next();

        }



        try (BufferedWriter writer = new BufferedWriter(new FileWriter("ÖğrenciKayıtSistemi.txt"))) {
            for (String[] ogrenci : ogrenciBilgileri) {
                writer.write(ogrenci[0] + " " + ogrenci[1] + " " + ogrenci[2] + " "+ ogrenci[3] + " "+ ogrenci[4]);
                writer.newLine();
            }
            System.out.println("Öğrenci bilgileri dosyaya yazıldı.");
        } catch (IOException e) {
            System.err.println("Dosya yazma hatası: " + e.getMessage());
        }
        ArrayList<String> indeks = new ArrayList<>();
        try (BufferedWriter indeksYaz = new BufferedWriter(new FileWriter("İndeksKayıtSistemi.txt"))) {
            for (int i = 0; i < ogrenciSayi; i++) {
                indeksYaz.write(ogrenciBilgileri[i][0] + " ");
                indeks.add(ogrenciBilgileri[i][0]);
                indeksYaz.newLine();
            }
        } catch (IOException e) {
            System.err.println("Dosya yazma hatası: " + e.getMessage());
        }




    }




}
