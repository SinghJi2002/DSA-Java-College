#include <stdio.h>
#include <stdlib.h>

void sumOfPrime(int* arr,int n){
    int count=0;
    int sum=0;
    for(int i=0;i<n;i++){
        for(int j=1;j<arr[i];j++){
            if(arr[i]%j==0){
                count++;
            }
        }
        if(count>1){
            count=0;
        }
        else{
            sum+=arr[i];
            count=0;
        }
    }
    printf("Sum of element is %d\n",sum);
}

int main() {
    int n; 
    printf("Enter the number of elements: ");
    scanf("%d", &n);

    
    int *arr;

    
    arr = (int *)malloc(n * sizeof(int));
    if (arr == NULL) {
        printf("Memory allocation failed.\n");
        return 1; 
    }

    
    for (int i = 0; i < n; i++) {
        printf("Enter element %d: ", i + 1);
        scanf("%d", &arr[i]);
    }

    sumOfPrime(arr,n);
    return 0;
}
