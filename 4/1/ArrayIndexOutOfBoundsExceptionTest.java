class ArrayIndexOutOfBoundsExceptionTest {
    public static void main(String[] args){
        int[] myarray = new int[3];
        System.out.println("ArrayIndexOutOfBoundsExceptionを発生させます．");
        myarray[100] = 0;
        System.out.println("Hello");
    }
}