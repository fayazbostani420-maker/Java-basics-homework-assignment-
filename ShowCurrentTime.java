package showcurrenttime;
public class ShowCurrentTime {
    public static void main(String[] args) {
      long totalMilliseconds = System.currentTimeMillis();
       long totalSeconds = totalMilliseconds / 1000;
       long CurrentSecond = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long CurrentMinute = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long CurrentHour = totalHours % 24;
        System.out.println("Current time is:" +CurrentHour + ":"+ CurrentMinute + ":" + CurrentSecond + " Gmt");

    }
    
}
  