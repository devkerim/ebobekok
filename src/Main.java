import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner intscanner = new Scanner(System.in);
	int i,max=0;
	int sayi1,sayi2,ebob=1,ekok;
	System.out.println("1. Sayıyı giriniz: ");
	sayi1 = intscanner.nextInt();
	System.out.println("2. Sayıyı giriniz: ");
	sayi2 = intscanner.nextInt();

	if(sayi1>sayi2){max=sayi1;}
    else if(sayi2>sayi1){max = sayi2;}
    else{max = sayi1;}


    for(i=1;i<=max;i++){
        if(sayi1%i==0&&sayi2%i==0){ebob = i;}
    }
    ekok = (sayi1*sayi2)/ebob;
    System.out.println(sayi1+" ve "+sayi2+"'nin\nEBOB'u: "+ebob+"\nEKOK'u: "+ekok);


    }
}
