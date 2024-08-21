import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Scanner;

public class OgrenciOkuma {
    void ogrenciOku() throws IOException {
        Scanner scanner = new Scanner(System.in);
        BufferedReader reader = new BufferedReader(new FileReader("İndeksKayıtSistemi.txt"));
        String satir;
        System.out.println("Öğrenci numarasını girin: ");
        String arananNumara = null;
        try {
            arananNumara = scanner.next();
        } catch (
                NoSuchElementException nsee) {
            System.out.println("Girdi bulunamadı.");
        }

        String line;
        BufferedReader reader1 = new BufferedReader(new FileReader("ÖğrenciKayıtSistemi.txt"));

        while ((line = reader1.readLine()) != null) {
            String[][] ogrenciBilgileri = new String[][]{line.split(" ")};

            for (int i = 0; i < ogrenciBilgileri.length; i++) {
                if (Objects.equals(arananNumara, ogrenciBilgileri[i][0])) {
                    System.out.println("Öğrenci Bilgileri:");
                    System.out.println("Öğrenci numarası: " + ogrenciBilgileri[i][0]);
                    System.out.println("Adı: " + ogrenciBilgileri[i][1]);
                    System.out.println("Soyadı: " + ogrenciBilgileri[i][2]);
                    System.out.println("Sınıfı: " + ogrenciBilgileri[i][3]);
                    System.out.println("Bölümü: " + ogrenciBilgileri[i][4]);
                    break;

                }


                else if (!Objects.equals(arananNumara, ogrenciBilgileri[i][0])) {
                    System.out.println("Öğrenci bulunamadı.");
                }
            }

        }
    }}
