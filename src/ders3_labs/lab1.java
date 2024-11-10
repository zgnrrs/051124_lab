package ders3_labs;

import java.util.Scanner;



public class lab1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] sorular = {
            "1. Doğayı koruma konusunda ne kadar duyarlısınız?",
            "2. Geri dönüşüm alışkanlıklarınız ne düzeyde?",
            "3. Çevre kirliliği hakkında ne kadar bilginiz var?",
            "4. Enerji tasarrufu yapma konusunda ne kadar bilinçlisiniz?",
            "5. Doğa yürüyüşlerine ne sıklıkla çıkarsınız?"
        };
        int[][] cevaplar = new int[5][10];
        
        while (true) {
            System.out.println("Anketi doldurmak ister misiniz? (Evet/Hayır)");
            String devam = scanner.nextLine();
            if (devam.equalsIgnoreCase("Evet")) {
                System.out.println("Lütfen aşağıdaki soruları 1'den 10'a kadar puanlandırın:");
                
                for (int i = 0; i < sorular.length; i++) {
                    int puan;
                    while (true) {
                        System.out.println(sorular[i]);
                        puan = scanner.nextInt();
                        scanner.nextLine(); 
                        if (puan >= 1 && puan <= 10) {
                            break;
                        } else {
                            System.out.println("Geçersiz değerlendirme. Lütfen 1 ile 10 arasında bir sayı giriniz.");
                        }
                    }
                    cevaplar[i][puan - 1]++;
                }
            } else if (devam.equalsIgnoreCase("Hayır")) {
                break;
            } else {
                System.out.println("Geçersiz işlem. Lütfen 'Evet' veya 'Hayır' giriniz.");
            }
        }

        
        System.out.println("\nAnket Sonuçları:");
        System.out.println("Soru                                    Ortalama");
        double[] ortalamalar = new double[5];
        for (int i = 0; i < sorular.length; i++) {
            int toplamPuan = 0;
            int toplamCevap = 0;
            for (int j = 0; j < 10; j++) {
                toplamPuan += cevaplar[i][j] * (j + 1);
                toplamCevap += cevaplar[i][j];
            }
            ortalamalar[i] = (double) toplamPuan / toplamCevap;
            System.out.printf("%-40s %.2f\n", sorular[i], ortalamalar[i]);
        }

        
        double enYuksekOrtalama = ortalamalar[0];
        double enDusukOrtalama = ortalamalar[0];
        String enYuksekSoru = sorular[0];
        String enDusukSoru = sorular[0];
        for (int i = 1; i < ortalamalar.length; i++) {
            if (ortalamalar[i] > enYuksekOrtalama) {
                enYuksekOrtalama = ortalamalar[i];
                enYuksekSoru = sorular[i];
            }
            if (ortalamalar[i] < enDusukOrtalama) {
                enDusukOrtalama = ortalamalar[i];
                enDusukSoru = sorular[i];
            }
        }

        System.out.println("\nEn yüksek ortalamaya sahip soru: " + enYuksekSoru + " (" + enYuksekOrtalama + ")");
        System.out.println("En düşük ortalamaya sahip soru: " + enDusukSoru + " (" + enDusukOrtalama + ")");
        
        
    }
}


	    
	





