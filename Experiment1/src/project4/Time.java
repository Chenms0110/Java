package project4;
public class Time {

	private long hour;
	private long minute;
	private long second;
	
	Time(){
        long totalSeconds = System.currentTimeMillis() / 1000 ;  
       // ����F�ڵ���
       second = totalSeconds % 60 ;    
       // ����F�ڵķ�
       long totalMinutes = totalSeconds / 60 ;
       minute = totalMinutes % 60 ;     
       // ����F�ڵ�С�r
       long totalHour = totalMinutes / 60 ;
       hour = totalHour % 24 ;
	}
	
	public long getHour() {
		return hour;
	}

	public long getMinute() {
		return minute;
	}

	public long getSecond() {
		return second;
	}

	Time(long totalMilliSeconds){
        long totalSeconds = totalMilliSeconds / 1000 ;
        
       // ����F�ڵ���
       second = totalSeconds % 60 ;
        
       // ����F�ڵķ�
       long totalMinutes = totalSeconds / 60 ;
       minute = totalMinutes % 60 ;
        
       // ����F�ڵ�С�r
       long totalHour = totalMinutes / 60 ;
       hour = totalHour % 24 ;
	}

	@Override
	public String toString() {
		return hour + " : " + minute + " : " + second + " GMT " ;
	}
	

}
