public class bubblesort
{

    public static int [] bubble (int [] in)
    {
        int [] out = in;
        boolean unsorted = true;
        boolean hasChanged;
        while (unsorted)
        {
            hasChanged = false;
            for (int i = 0; i < out.length -1;i++)
            {
                if (out[i] > out[i+1])
                {
                    sortingUtil.swap(out,i,i+1);
                    hasChanged = true;
                }
            }
            if (!hasChanged)
            {
                unsorted = false;
            }
        }

        return out;
    }


}