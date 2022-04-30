class FullUserInfo extends UserInfo{
	private String lastname;

	FullUserInfo(String n,String l){
		super(n);
		lastname = l;
	}
	String getInitials(){
		return "" + super.getInitials() + "." + lastname.charAt(0);
	}
	@Override
	public String toString(){
		return "" + super.toString() + " " + lastname;
    }
}
