public class StringChar {
  public static void main(String[] args) {
    int len = args.length;
    if(len!=2) {
      System.out.println("Too few arguments.");
      System.exit(1);
    }
    int n = Integer.parseInt(args[1]);
    if(args[0].length()>=n && 0<=n){
        System.out.println(args[0].charAt(n));
    }else{
        System.out.println("Invalid input.");
    }  
  }
}