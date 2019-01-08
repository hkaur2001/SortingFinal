public class SortingAlgorithms {
    public static void swap(int[]arr,int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public static int[] randIntArr(int count){
        int[] num = new int[count];
        for(int i = 0; i < count; i++){
            num[i] = (int)(Math.random()*10001);
        }
        return num;
    }
    public static void bubbleSort(int[] arr){
        int swapCount = 1;
        while (swapCount != 0){
            swapCount = 0;
            for(int i = 0; i < arr.length-1; i++){
                if (arr[i] > arr[i+1]){
                    swap(arr, i, i+1);
                    swapCount ++;
                }
            }
        }
    }
    public static boolean checkSort(int [] arr){
        for (int i = 0; i < arr.length-1; i++){
            if (i > i+1){
                return false;
            }
        }
        return true;
    }
    public static boolean checkSum(int [] before, int [] after){
        if (before.length != after.length){
            return false;
        }
        int sumbefore = 0;
        int sumafter = 0;
        for (int i =0; i < before.length-1; i++){
            sumbefore = sumbefore + before[i];
            sumafter = sumafter + after[i];
        }
        if (sumafter != sumbefore){
            return false;
        } else {
            return true;
        }
    }
}
