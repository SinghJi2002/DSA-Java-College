package Lab2_23_08_26;

import java.util.Arrays;
import java.util.Scanner;

public class Q1 {

    public static int LinearSearch(int[] arr,int element){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==element){
                return(i);
            }
        }
        return(-1);
    }

    public static void Transversal(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    public static void insert(int[] arr,int[] dumArr,int value,int index){
        for(int i=0;i<dumArr.length;i++){
            if(i<index){
                dumArr[i]=arr[i];
            }
            else if(i==index){
                dumArr[i]=value;
            }
            else if(i>index){
                dumArr[i]=arr[i-1];
            }
        }
    }

    public static void delete(int[] arr,int[] dummyArray,int index){
        for(int i=0;i<dummyArray.length;i++){
            if(i<index){
                dummyArray[i]=arr[i];
            }
            if(i==index){
                continue;
            }
            if(i>index){
                dummyArray[i-1]=arr[i];
            }
            }
    }

    public static void main(String[] args) {
        System.out.println("Enter the number of elements you want");
        Scanner sc=new Scanner(System.in);
        int len=sc.nextInt();
        int array[]=new int[len];
        for(int i=0;i<len;i++){
            System.out.println("Enter element");
            int element=sc.nextInt();
            array[i]=element;
        }
        System.out.println("Current array is "+Arrays.toString(array));
        System.out.println("Enter:\n1:For Linear Searh\n2:Transverse the array\n3:To insert a element\n4:Delete a element\n5:Exit");
        int option=sc.nextInt();
        if(option==1){
            //Linear Search
            int findele=7;
            int index=LinearSearch(array,findele);
        }
        if(option==2){
            //Transversal of Array
            Transversal(array);
        }
        if(option==3){
            //Insert element
            int insertElement=8;
            int insertIndex=3;
            int dummyArray[]=new int[len+1];
            insert(array,dummyArray,insertElement,insertIndex);
            System.out.println(Arrays.toString(dummyArray));
        }
        if(option==4){
            //Delete element
            int deleteIndex=3;
            int dummyArray[]=new int[len-1];
            delete(array,dummyArray,deleteIndex);
            System.out.println(Arrays.toString(dummyArray));
        }
        if(option==5){
            System.out.println("Thank You");
        }

    }
}
