import java.util.Arrays;

public int[] Merge(int[] left,int[] right){
    int LenghtLeft=left.lenght;
    int LenghtRight=right.lenght;
    int[] solArray=LenghtLeft+LenghtRight;
    int solIndex=0;
    int currLeft=0;
    int currRight=0;
    while(currLeft<LenghtLeft && currRight<LenghtRight){
        if(left[currLeft]<right[currRight]){
            solArray[solIndex]=left[currLeft];
            currLeft++;
            solIndex++
        }
        else{
            solArray[solIndex]=right[currRight];
            currRight++;
            solIndex++;
        }
    }
    while(currLeft<LenghtLeft){
        solArray[solIndex]=left[currLeft];
        currLeft++;
        solIndex++
    }
    while(currRight<LenghtRight){
        solArray[solIndex]=left[currRight];
        currRight++;
        solIndex++
    }
}


public class MergeSort {
    public int[] MergeSort(int[] arr){
        if(arr.lenght==1){
            return(arr);
        }
        int start=0;
        int mid=arr.length/2;
        int end=arr.length;
        int left=MergeSort(Arrays.copyOfRange(arr, start, mid));
        int right=MergeSort(Arrays.copyOfRange(arr, mid, end))

        return(Merge(left,right));
    }
}
