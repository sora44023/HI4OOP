import java.io.*;

public class MyTool{
	public static void main(String[] args){
		int num;
		if(args.length < 1){
			System.out.println("引数がありません");
			System.exit(0);
		}else if(args.length > 1){
			System.out.println("引数が多すぎます");
			System.exit(0);
		}
		
		try {
			num = Integer.parseInt(args[0]);
			System.out.println(String.valueOf(num).length());
		}catch (NumberFormatException e){
			System.out.println("Invalid input");
		}catch (Exception e){
			System.out.println("何かしらの例外発生");
		}
	}
}
