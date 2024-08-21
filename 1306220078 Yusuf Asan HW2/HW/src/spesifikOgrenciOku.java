import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Scanner;

public class spesifikOgrenciOku {
    void direktOgrenciOku() throws IOException {
        Scanner scanner = new Scanner(System.in);
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
                    int secim;
                    System.out.println("Öğrenmek istediğiniz bilgi nedir?");
                    System.out.println("1-Adı");
                    System.out.println("2-Soyadı ");
                    System.out.println("3- Bölümü ");
                    System.out.println("4- Sınıfı");
                    secim = scanner.nextInt();

                    switch (secim){
                        case 1:
                            System.out.println("Adı: " + ogrenciBilgileri[i][1]);
                            break;
                        case 2:
                            System.out.println("Soyadı: " + ogrenciBilgileri[i][2]);
                            break;
                        case 3:
                            System.out.println("Bölümü: " + ogrenciBilgileri[i][4]);
                            break;
                        case 4:
                            System.out.println("Sınıfı: " + ogrenciBilgileri[i][3]);
                            break;
                    }
                    break;

                }


                else if (!Objects.equals(arananNumara, ogrenciBilgileri[i][0])) {
                    System.out.println("Öğrenci bulunamadı.");
                }
            }

        }
    }
}
