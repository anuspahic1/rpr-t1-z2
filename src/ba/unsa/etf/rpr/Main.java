package ba.unsa.etf.rpr;

import java.util.Scanner;

public class Main {
public static int sumaCifara(int x){
    int suma=0;
    while(x!=0){
        int c=x%10;
        x=x/10;
        suma=suma+c;
    }
    return suma;
}
    public static void main(String[] args) {
	// write your code here
        Scanner in=new Scanner(System.in);
        System.out.println("Unesite n: ");
        int x=in.nextInt();
        for(int i=1;i<=x;i++){
            if(i%sumaCifara(i)==0)System.out.println(i);
        }
    }
}
