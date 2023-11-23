#include<stdio.h>

void compare(int* p1, int* p2){
    if(*p1>*p2){
        printf("%d is greater than %d",*p1,*p2);
    }
    else{
        printf("%d is greater than %d",*p2,*p1);
    }
}

int main(){
    printf("Enter two numbers of your choice\n");
    int a,b;
    scanf("%d",&a);
    scanf("%d",&b);
    int* ptr1=&a;
    int* ptr2=&b;
    compare(ptr1,ptr2);
    return 0;
}