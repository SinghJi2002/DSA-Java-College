package Lab2_23_08_26;

import java.util.Scanner;

public class Q5 {

    public static void main(String[] args) {
        System.out.println("Enter Maximum Polynomial");
        Scanner sc=new Scanner(System.in);
        int order=sc.nextInt();
        int polynomial1[]=new int[order+1];
        int polynomial2[]=new int[order+1];
        
        System.out.println("Enter the coefficients of the first polynomial");
        for(int i=0;i<=order;i++){
            System.out.println("Enter the "+i+"th"+" coefficient");
            int element=sc.nextInt();
            polynomial1[i]=element;
        }
        
        
        System.out.println("Enter the coefficients of the second polynomial");
        for(int j=0;j<=order;j++){
            System.out.println("Enter the "+j+"th"+" coefficient");
            int element=sc.nextInt();
            polynomial2[j]=element;
        }

        int resultant[]=new int[order+1];
        for(int k=0;k<=order;k++){
            resultant[k]=polynomial1[k]+polynomial2[k];
        }

        System.out.println("The resultant polynomial");
        for(int a=order;a>=0;a--){
            System.out.print(resultant[a]+"x^"+a+"+");
        }
    }
    
}
