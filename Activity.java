import java.util.Date;
import java.text.SimpleDateFormat;
// here is a try to commit

public class Activity {
	
	String name;
	int a;
	
	SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
	
	Date d1 = null;
	Date d2 = null;
	
	public void StartATimer () {
		
	}
	
	public void EndATimer () {
		
	}
	
	public int ShowMyTime () {
		return a;
	}
	
	public Activity (String name) {
		this.name = name;
	}
	
	

}
