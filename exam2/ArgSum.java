public class ArgSum{
	public static void main(String[] args){
		int len = args.length;
		int sum = 0;
		for (int i=0; i<len; i++){
			sum+=Integer.parseInt(args[i]);
		}
		System.out.println(sum);
	}
}
