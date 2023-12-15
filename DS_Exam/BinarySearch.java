public class BinarySearch {
    public int BinarySearch(int start,int end,int[] arr,int find){
        while(start<=end){
            int mid=(start+end)/2;
            if(find>arr[mid]){
                start=mid+1;
                BinarySearch(start, end, arr, find);
            }
            else if(find<arr[mid]){
                end=mid-1;
                BinarySearch(start, end, arr, find);
            }
            else if(find==arr[mid]){
                return(mid);
            }
        }
    }    
}
