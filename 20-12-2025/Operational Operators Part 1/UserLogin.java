class  UserLogin
{
	public static void main(String[] args){
		
		boolean userNotLogin = true;
		boolean passwordNotEmpty = true;
		boolean acctActive = true;
		 boolean onlyLogin = userNotLogin && passwordNotEmpty && acctActive;
		 System.out.println(onlyLogin);
	}
}








