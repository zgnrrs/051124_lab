package ders3_labs;

import java.util.ArrayList;
import java.util.Scanner;

public class lab {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.println("           ***ANKETE HOSGELDINIZ***        ");
	    System.out.println(" ------------------SORULAR-------------------------");
	    ArrayList<String> soru = new ArrayList<String>();
	    soru.add("1)GERI DONUSUM SIZIN ICIN NE KADAR ONEMLIDIR:");
	    soru.add("2)SU ISRAFINI ONLEMEK SIZIN ICIN NE KADAR ONEMLIDIR:");
	    soru.add("3)HAVA KIRLILIGINI ONLEMEK SIZIN ICIN NE KADAR ONEMLIDIR");
	    soru.add("4)CEVREYI TEMIZ TUTMAK SIZIN ICIN NE KADAR ONEMLIDIR:");
	    soru.add("5)CEVRE DUYARLILIGINIZI PUANLIYIN:");
	    for (String i : soru) {
	    	System.out.println(i);
	    }

	}

}
