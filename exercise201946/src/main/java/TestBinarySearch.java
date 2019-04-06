/**
 * Author:lorrie
 * Create:2019/4/6
 */

/*
二分查找
 */
public class TestBinarySearch {
    public static int binarySearch(int[] arr,int num){
        if (arr==null){
            return -1;
        }
        int left=0;
        int right=arr.length-1;
        while (left<=right){
        int mid=left+(right-left)/2;
            if (num<arr[mid]){
                right=mid-1;
            }
            if (num>arr[mid]){
                left=mid+1;
            }
            if (arr[mid]==num){
                return mid;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] array={1,2,5,2,3,6,4};
        System.out.println(binarySearch(array,3));
    }
}
