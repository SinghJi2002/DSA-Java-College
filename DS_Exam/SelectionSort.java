public class SelectionSort {
    public void Sort(int[] arr){
        int max=arr[0];
        int maxIndex=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i;j++){
                if(arr[j]>max){
                    max=arr[j];
                    maxIndex=j;
                }
            }
            int temp=arr[arr.length-i-1];
            arr[arr.length-1-i]=max;
            arr[maxIndex]=temp;
        }
    }
}
