package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Laba2 mm=new Laba2();
        mm.h= in.nextInt();
        mm.w=in.nextInt();
        mm.Matrix=new int[mm.w][mm.h];
        mm.S_klavi();
        mm.Max_Min();
        in.close();



    }
}


