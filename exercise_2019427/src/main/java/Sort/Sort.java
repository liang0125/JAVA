package Sort;

import java.util.Arrays;

/**
 * Author:lorrie
 * Create:2019/4/27
 */
public class Sort {
    /**
     * 插入排序
     * <p>
     * <p>
     * 时间复杂度
     * 最坏：O(n^2)
     * 平均：O（n^2）
     * 最好：O(n)
     * <p>
     * 空间复杂度O（1）
     * <p>
     * 稳定
     **/
    public static void insertSort_01(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int key = array[i];//是要被插入的数据
            int j = i - 1;
            for (j = i - 1; j >= 0; j--) {//有序部分从后往前遍历
                if (key > array[j]) {
                    break;
                } else {
                    array[j + 1] = array[j];
                }
            }
            array[j + 1] = key;
        }
    }


    /**
     * 希尔排序
     * 时间复杂度
     * 最好
     *
     * @param array
     */
    public static void shellSort(int[] array) {

    }

    /**选择排序
     *
     * @param array
     */
    public static void selectSort(int[] array) {
        //有序[0,i)   无序[i,array.length)
       for (int i=0;i<array.length;i++){
           int min=i;
           for (int j=i;j<array.length;j++){
                if (array[j]<array[min]){
                    min=j;
                }
           }
           int tmp=array[min];
           array[min]=array[i];
           array[i]=tmp;
       }
    }


    public static void heapdif(int[] array,int size,int index){
        int left=2*index+1;
        if (left>=size){
            return;
        }
        int max=left;
        int right=2*index+2;
        if(right<size&&array[right]>array[max]){
            max=right;
        }
        if (array[index]>array[max]){
            return;
        }
        int tmp=array[max];
        array[max]=array[index];
        array[index]=tmp;
        heapdif(array,size,max);
    }

    /**
     * 建堆
     * @param array
     */
    public static void creatHeap(int[] array){
        for (int i=(array.length-2)/2;i>=0;i--){
            heapdif(array,array.length,i);
        }
    }
    /**
     * 堆排序
     * @param array
     */
    public static void heapSort(int[] array){
        creatHeap(array);
       for (int i=0;i<array.length;i++){
           int t=array[0];
           array[0]=array[array.length-1-i];
           array[array.length-i-1]=t;
           heapdif(array,array.length-i-1,0);
       }

    }

    /**
     * 冒泡排序
     * @param array
     */
    public static void bubbleSort(int[] array){
        for (int i=0;i<array.length-1;i++){
            int flag=0;
            for (int j=0;j<array.length-1-i;j++){
                if (array[j]>array[j+1]){
                    int tmp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=tmp;
                    flag=1;
                }
            }
            if (flag==0){
                return;
            }
        }
    }

    /**
     * 快速排序
     * @param array
     */
    public static void quickSort(int[] array){
         quickSort_(array,0,array.length-1);
    }
    public static void quickSort_(int[] array,int left,int right){
        if (left==right){
            return;
        }
        if (left>right){
            return;
        }
        int index=partation(array,left,right);
        quickSort_(array,0,index-1);
        quickSort_(array,index+1,right);
    }
    public static int partation(int[] array,int left,int right){
        int begin=left;
        int end=right;
        int pivot=array[right];
        while (begin<end){
            while (begin<end&&array[begin]<=pivot){
                begin++;
            }
            array[end]=array[begin];
            while (begin<end&&array[end]>=pivot){
                end--;
            }
            array[begin]=array[end];
        }
        array[begin]=pivot;
        return begin;

    }
    public static void main(String[] args) {
        int[] a = {3, 5, 4, 7, 8, 9, 1, 2};
        quickSort(a);
        System.out.println(Arrays.toString(a));
    }

}
