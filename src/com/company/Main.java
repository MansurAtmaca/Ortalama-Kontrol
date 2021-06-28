package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen Matematik Notunuzu Giriniz: ");
        int mat = input.nextInt();
        System.out.print("Lütfen Fizik Notunuzu Giriniz: ");
        int fizik = input.nextInt();
        System.out.print("Lütfen Türkçe Notunuzu Giriniz: ");
        int turkce = input.nextInt();
        System.out.print("Lütfen Kimya Notunuzu Giriniz: ");
        int kimya = input.nextInt();
        System.out.print("Lütfen Müzik Notunuzu Giriniz: ");
        int music = input.nextInt();

        if (0 > mat || 100 < mat) {
            mat = 0;
        } if (0 > fizik || 100 < fizik) {
            fizik = 0;
        } if (0 > turkce || 100 < turkce) {
            turkce = 0;
        } if (0 > kimya || 100 < kimya) {
            kimya = 0;
        } if (0 > music || 100 < music) {
            music = 0;
        }

        double sonuc=(mat+fizik+kimya+turkce+music)/5;
        System.out.println("Ortalamanız: "+sonuc);
    }
}
