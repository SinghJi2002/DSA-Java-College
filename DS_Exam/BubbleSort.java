public class BubbleSort {
    public void Sort(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i;j++){
                boolean swapped=false;
                if(arr[j]>arr[j+1]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                    swapped=true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }
}
