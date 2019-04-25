/**
 * Author:lorrie
 * Create:2019/4/25
 */
public class TestDown {
    /*
        向下调整递归版
     */
    public static void heapify(int[] tree, int index) {
        int left = 2 * index + 1;
        if (left >= tree.length) {
            return;
        }
        int min = left;
        int right = 2 * index + 2;
        if (right < tree.length && tree[right] <tree[min]) {
            min = right;
        }
        if (tree[index] < tree[min]) {
            return;
        }
        int t = tree[index];
        tree[index] = tree[min];
        tree[min] = t;
        heapify(tree, min);
    }

    //向下调整非递归版本
    public static void adjustDown(int[] tree, int index) {
        int min = 2 * index + 1;
        while (min < tree.length) {
            if (min+1<tree.length&&tree[min+1]<tree[min]){
                min+=1;
            }
            if (tree[index]<tree[min]){
                return;
            }
            int t = tree[index];
            tree[index] = tree[min];
            tree[min] = t;
            index=min;
            min=2*index+1;
        }
    }

    //向上调整
    public void adjustUp(int[] arr,int size,int index){
        int parent=(index-1)/2;
        if (parent<0){
            return;
        }
        if (arr[parent]>arr[index]){
            return;
        }
        int t=arr[parent];
        arr[parent]=arr[index];
        arr[index]=t;
        adjustUp(arr,size,parent);
    }


    /*
    直接选择排序
     */
    public static void selectSort(int[] array){
      for (int i=0;i<array.length;i++){
        int min=i;
          for (int j=i;j<array.length;j++){
              if (array[j]<array[min]){
                  min=j;
              }
          }
          int t=array[min];
          array[min]=array[i];
          array[i]=t;
      }
    }

    /*
    冒泡排序
     */
    public static void bubbleSort(int[] array){
        for (int i=0;i<array.length-1;i++){
            int flag=0;
            for (int j=0;j<array.length-1-i;j++){
                if (array[j]>array[j+1]){
                    int t=array[j];
                    array[j]=array[j+1];
                    array[j+1]=t;
                    flag=1;
                }
            }
            if (flag==0){
                return;
            }
        }
    }
    public static void main(String[] args) {
        int[] a={27,15,19,18,28,34,65,49,25,37};
//        selectSort(a);
        bubbleSort(a);
//        heapify(a,0);
        for (int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }

}
