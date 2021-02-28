class TC2 {
    public static void main(String [] args) {

        int[] integerArr = {3,2,1};
        int src=0;
        int dest=1;
        int temp=integerArr[src];
        integerArr[src]=integerArr[dest];
        integerArr[dest]=temp;

        for (int pos=0;pos<integerArr.length;pos++)
            System.out.println(integerArr[pos]+" ");
        System.out.println();
    }
}
