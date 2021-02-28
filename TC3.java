class TC3 {
    public static void main(String[] args) {
        int[] integerArr = new int[]{2, 3, 1};
        int temp;
        for (int i = 0; i < integerArr.length; i++) {
            for (int j = i; j < integerArr.length; j++) {
                if (integerArr[i] > integerArr[j]) {
                    temp = integerArr[i];
                    integerArr[i] = integerArr[j];
                    integerArr[j] = temp;
                }
            }
        }
        for(int a : integerArr) {
            System.out.println(a);
        }
    }
}
