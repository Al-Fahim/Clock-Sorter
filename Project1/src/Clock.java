
public class Clock { //take time and format it
	 private int hour;
	 private int minute;
	 private int second;
	
	 public Clock(int h, int m, int s) {
		 setTime(h,m,s);
	 }

	 private void setTime(int h, int m, int s) {
		setHour(h);
		setMinute(m);
		setSecond(s);
	 }
	 
	 public void setHour(int h) { //set hour
		 
		 if(!(h>=0) || !(h<24)) hour = 0;
		 else hour = h;
	 }
	 
	 private void setMinute(int m) { //set minute
		 
		 if(!(m>=0) || !(m<60)) minute = 0;
		 else minute = m;
	 }
	 
	 private void setSecond(int s) { //set second
		 
		 if(!(s>=0) || !(s<60)) second = 0;
		 else second = s;
	 }

	 public int getHour() { //take hour
		 
		 return hour;
		 
	 }
	 
	 public int getMinute() { //take minute
		 
		 return minute;
		 
	 }
	 
	 public int getSecond() { //take second
		 
		 return second;
		 
	 }
	 
	 public String toString() { //format into 00:00:00
		 
		 return getHour() + ":" + getMinute() + ":" + getSecond();
		 
	 }
}