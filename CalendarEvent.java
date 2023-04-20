import java.util.Calendar;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.UUID;

class CalendarEvent{
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the event name: ");
        String eventName = scanner.nextLine();
        
        System.out.print("Enter the event description: ");
        String eventDescription = scanner.nextLine();

        System.out.print("Enter a date (YYYY-MM-DD): ");
        String dateString = scanner.nextLine();

        System.out.print("Enter a time (HH:MM): ");
        String timeString = scanner.nextLine();
        
        String[] dateParts = dateString.split("-");
        String[] timeParts = timeString.split(":");
        int year = Integer.parseInt(dateParts[0]);
        int month = Integer.parseInt(dateParts[1]) - 1; // Month is zero-based in Calendar
        int day = Integer.parseInt(dateParts[2]);
        int hour = Integer.parseInt(timeParts[0]);
        int minute = Integer.parseInt(timeParts[1]);

        Calendar cal = Calendar.getInstance();
        cal.set(year, month, day, hour, minute, 0);

        // Set the reminder
        System.out.println("Event Name: "+eventName);
        System.out.println("Event Description: "+eventDescription);
        System.out.println("Reminder set for: " + cal.getTime());
        
        scanner.close();
    }
}