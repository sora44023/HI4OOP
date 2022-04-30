class ExClock extends Clock{
	private boolean ampm;
	private String disp;

	ExClock(boolean ampm){
		//super();
		this.ampm = ampm;
	}

	void MultiDispClock(){
		ampm = !ampm;
	}

	@Override
	void show(){
		if(ampm){
			if(hour < 13){
				disp = "AM";
			}else{
				disp = "PM";
				hour -= 12;
			}
			String time = String.format("%02d:%02d:%02d ",hour,min,sec);
			System.out.println("["+time+disp+"]");
		}else{
			super.show();
		}
	}


}
