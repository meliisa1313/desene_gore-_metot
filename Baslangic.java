package Giris;

import java.util.Scanner;
public class Baslangic {
    static int m(int x, int degisen, int state) {

        System.out.print(+degisen+" ");

        if(degisen<=0 || state==1) {
            while(x!=degisen){
                return m(x, degisen + 5,1);
            }
            System.exit(0);
        }
        return m(x,degisen-5,0);

        public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int number = scanner.nextInt();
        System.out.print(m(number,number,0));




    }






}
