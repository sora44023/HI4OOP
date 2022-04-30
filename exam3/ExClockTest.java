class ExClockTest{
	public static void main(String[] args){
		ExClock clk = new ExClock(true);	//12時間表示にする場合は引数にtrue
		clk.show();
		clk.MultiDispClock();
		clk.show();
		System.out.println();
		
		ExClock clk2 = new ExClock(false);	//24時間表示にする場合は引数にflase
		clk2.show();
		clk2.MultiDispClock();
		clk2.show();
	}
}
