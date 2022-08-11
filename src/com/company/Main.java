package com.company;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Maths marks : ");
        int Math = sc.nextInt();
        System.out.print("Enter your Physics  marks : ");
        int Phy = sc.nextInt();
        System.out.print("Enter your Chemistry marks : ");
        int Che = sc.nextInt();

        if(Math >= 33 && Che >= 33 && Phy >=33){
            System.out.println("You have passed is all each subject !!! ");
        }
        else if (Math <33){
            System.out.println("You have fail in Mathematics  : " + Math  );
        }
        else if (Phy <33){
            System.out.println("You have fail In Physics : " + Phy  );
        }
        else if (Che <33){
            System.out.println("You have fail in Chemistry  : " + Che  );
        }

        double sum = ((Math + Phy + Che));
        System.out.println("Sum of all subjects marks " + sum);
        double percentage = (sum/300 )*100 ;
        System.out.println("Your Total percentage is : " + percentage );

        if(percentage >= 40){
            System.out.println("You have passed !!!! Congrats !! Keep doing !!! ");
        }else{
            System.out.println(" You are fail !! ");
        }

    }
}



