public class ShowCurrentTime {
    public static void main(String[] args) {
        long totalMilliseconds = System.currentTimeMillis();
          
        long totalSeconds = totalMilliseconds/1000;
        long CurrentSeconds = totalSeconds% 60;
        long totalMinutes = totalSeconds/ 60;
        long CurrentMinutes = totalMinutes% 60;
        long totalHour = totalMinutes/ 60;
        long CurrentHour = totalHour% 24;

        
         
        System.out.println("Current Time is "+ CurrentHour + " : "+ CurrentMinutes + " : "+ CurrentSeconds + " GMT");
    }
}
