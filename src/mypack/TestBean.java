package mypack;

public class TestBean
{
	private String userName;

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String toString(){
		return "Welcome: "+ userName;
	}
}
