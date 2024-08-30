package recursion;

import java.util.Arrays;

public class BinarySearch {

    int binary(int[] arr, int s, int e ,int targer){
        if(s>e)
            return -1;

        int mid = s +(e-s) /2;

        if(arr[mid] == targer)
            return arr[mid];

        if(targer < arr[mid]){
            return binary(arr,targer ,s,mid-1);
        }

        return binary(arr,targer,mid+1,e);
    }


    static int rops(int[] arr,int num){

        if( arr.length == 2){
            return arr[0] + arr[1] + num;
        }

        Arrays.sort(arr);

        num = arr[0]+arr[1];

        int temp[] = new int[arr.length-1];

        int count=0;

        for(int i = 2 ; i < arr.length;i++){
            temp[count] = arr[i];
            count++;
        }

        temp[count] += num;

        int ans = rops(temp,num);
        return ans;
    }

   static void fun(int num){
        if(num == 0)
            return;
        System.out.print(num + " ");
        fun( num-1);
        System.out.print(num + " ");
    }

   static int factorial(int num){
        if(num ==1)
            return num;

        return num * factorial(--num);

    }
    public static void main(String[] args) {

//        int arr[] = {4,3,2,6};
//        System.out.println(rops(arr,0));
        System.out.println(factorial(5));
    }
}
