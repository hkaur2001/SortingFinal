public class bubblesort{
    public static void main(String [] args){
        //Create a random array of int
        int [] testArr =  SortingAlgorithms.randIntArr(10);
        int [] oriTestArr = testArr;

        System.out.print("Before: ");

        //Print is out before you sort
        for (int num:testArr){
            System.out.print(num+" ");
        }

        System.out.println();

        //Sort is using bubbleSort
        SortingAlgorithms.bubbleSort(testArr);

        int [] finTestArray = testArr;
        //Print it out after you sort
        System.out.print("After: ");
        for (int num:testArr){
            System.out.print(num+" ");
        }
        System.out.println();


        if( SortingAlgorithms.checkSort(testArr) && SortingAlgorithms.checkSum(oriTestArr,finTestArray)){
            System.out.print("The algorithm works :)");
        }

        System.out.println();
        long time = System.nanoTime();
        SortingAlgorithms.bubbleSort(SortingAlgorithms.randIntArr(10));
        time = System.nanoTime() - time;

        System.out.println("sort time: " + time);
    }
}