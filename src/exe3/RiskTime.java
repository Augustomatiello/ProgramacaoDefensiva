package exe3;

public class RiskTime {
	private int hour;
	private int minute;
	private int second;

	public RiskTime(){
		this.hour = 0;
		this.minute = 0;
		this.second = 0;
	}
	
	void setTime(int newHour, int newMinute, int newSecond) {
		/* mutator implementation */ }

	int[] getTime() {
		int result[] = { hour, minute, second };
		return result;
	}

	void incrementTime() {
		/* mutator implementation */ }

}
