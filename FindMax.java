public class FindMax
{
    public static void main(String[] args)
    {
        Float[] floatArr= {10f,20f,30f};
        printArr(floatArr);
        maxFind(floatArr);
        findmaxfloat(floatArr);
    }

    public static<E>void printArr(E[] element)
    {
        for(E i : element )
            System.out.print(i+" ");
        System.out.println();
    }

    public static  <T extends  Comparable <T>> void maxFind(T[] element)
    {
        T max=element[0];
        for(T i:element)
        {
            if(i.compareTo(max)> 0)
            {
                max=i;
            }
        }System.out.println(max+" ");
    }

    public static <T extends Comparable<T>> void findmaxfloat (T[] elements) {
        T max = elements[0];
        for (T i : elements)
        {
            if (i.compareTo(max)> 0)
            {
                max = i;
            }
        }
        System.out.println("the maximum value in array is " + max);
    }
}
