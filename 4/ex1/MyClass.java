class MyClass{
    int n1, n2;
    MyClass(int n1, int n2){
        this.n1 = n1;
        this.n2 = n2;
    }

    int sum(){
        return n1 + n2;
    }

    int divide(){
        return n1/n2;
    }
    
    public static void main(String[] args){
        MyClass mc = new MyClass(5,0);
        try{
            System.out.println("sum: " + mc.sum());
            System.out.println("divide: " + mc.divide());
        }catch(Exception e){
            StackTraceElement[] ste = e.getStackTrace();
            System.out.println(e.getClass().getSimpleName() + "が生じました．"); 
            System.out.println("理由: " + e.getLocalizedMessage());
            System.out.print("例外が生じた過程:\n    ");
            for (int i = ste.length-1; i > -1; i--) {
                System.out.print(ste[i].getClassName()+"."+ste[i].getMethodName()+"   ");
                System.out.println("(" + ste[i].getFileName()+": "+ste[i].getLineNumber()+"行目を実行)");
                System.out.print("--> ");
            }
            System.out.println("例外発生");
        }
    }
}