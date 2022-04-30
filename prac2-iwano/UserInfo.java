class UserInfo{
	private String name;

	UserInfo(String name){
		this.name = name;
	}

	String getInitials(){
		return "" + name.charAt(0);
	}

	@Override
	public String toString(){
		return name;
	}
}
