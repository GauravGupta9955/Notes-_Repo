import java.time.LocalDate;
import java.time.* ;

public class localDate {
public static void main(String[] args) {
	LocalDate date = LocalDate.now();
	System.out.println(date);
	
	LocalTime time = LocalTime.now();
	System.out.println(time);
}
}
