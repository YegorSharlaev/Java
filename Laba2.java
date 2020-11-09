package com.company;
import java.util.Scanner;
public class Laba2 {
    int h;
    int w;
    int a=25;
    int b=12;
    int[][] Matrix=new int[w][h];
    public void S_klavi(){
        Scanner in = new Scanner(System.in);
        /*Matrix=new int[w][h];*/
        for (int i=0;i<w;i++){
            for(int j=0;j<h;j++){
                Matrix[i][j]=in.nextInt();
                System.out.print(Matrix[i][j]+"\t");
            }
            System.out.println();
        }
        in.close();
    }
    public void Proizvolno(){
        for (int i=0;i<w;i++){
            for(int j=0;j<h;j++){
                Matrix[i][j]=((int)(Math.random()*a)-b);
                System.out.print(Matrix[i][j]+"\t");
            }
            System.out.println();
        }
    }
    public void Max_Min(){
        int m=Matrix[0][0];
        int n=Matrix[0][0];
        for(int i =0;i< Matrix.length;i++){
            for(int j=0;j<Matrix.length;j++){
                if (Matrix[i][j]>m){
                    m=Matrix[i][j];
                }
                if(Matrix[i][j]<n){
                    n=Matrix[i][j];
                }
            }
        }
        System.out.printf("maximum: %s \tminimum: %d\n", m, n);
    }
}
