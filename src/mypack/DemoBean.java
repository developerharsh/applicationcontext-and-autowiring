package mypack;

public class DemoBean implements Demo
{
	private TestBean tb;
	
	


	public void setTb(TestBean tb) {
		this.tb = tb;
	}




	public void showData()
	{
		System.out.println(tb);
	}
}
