public class sortingUtil
{
    public static int[] randIntArr(int count)
    {
        int [] out = new int [count];
        for (int i = 0; i < count; i++)
        {
            out[i] = (int)(Math.random()*count + 1);
        }
        return out;
    }



    public static void swap (int [] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr [j] = temp;
    }

    public static void printArr(int [] arr)
    {
        String out = "";
        for (int i = 0; i < arr.length; i++ )
        {
            out = out + "[" + arr[i] + "], ";
        }
        System.out.println(out);
    }

    public static boolean isSorted (int [] in)
    {
        for (int i = 0; i < in.length -1; i++)
        {
            if (in[i] > in [i+1])
            {
                return false;
            }
        }
        return true;
    }

    public static boolean checkSum (int [] a, int [] b)
    {
        int sum1 = 0;
        int sum2 = 0;

        if (a.length != b.length)
        {
            return false;
        }
        for (int i = 0; i < a.length; i++)
        {
            sum2 = sum2 + b[i];
            sum1 = sum1 + a[i];
        }

        return sum1 == sum2;

    }


}