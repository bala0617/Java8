package lambda;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
//import java.time.temporal.ChronoUnit;
import java.util.function.Predicate;

public class details {

	public static void main(String[] args) 
	{
		User use = () -> System.out.println("hii");
		use.user();
		
		User uses = () -> System.out.println("bye");
		uses.user();
		
		Predicate<String> I = no -> no==no.toUpperCase();
		System.out.println(I.test("hi"));
		
		LocalDate todays = LocalDate.now();
		LocalDate birthDate = LocalDate.of(2001, Month.JUNE, 12);
		Period age = Period.between(birthDate, todays);
//
		System.out.println("Age: " + age.getYears()+ " years"); 
//
		LocalDate date = LocalDate.of(2001, 6, 12);
		int year = date.lengthOfYear();
		int month = date.lengthOfMonth();
		int day = date.getDayOfYear();

		System.out.println("Year: " + year);   
		System.out.println("Month: " + month); 
		System.out.println("Day: " + day);     

//		 LocalDate birthday = LocalDate.of(2001, 10, 19); // Replace with actual birth date
//	        LocalDate today = LocalDate.now(); // Current date
//	        
//	        // Calculate period from birthday to today
//	        Period age1 = Period.between(birthday, today);
//	        
//	        System.out.println("Years: " + age1.getYears());
//	        System.out.println("Months: " + age1.getMonths());
//	        System.out.println("Days: " + age1.getDays());
//	        
//	        // Or calculate total days or total months between the dates using ChronoUnit
//	        long totalDays = ChronoUnit.DAYS.between(birthday, today);
//	        long totalMonths = ChronoUnit.MONTHS.between(birthday, today);
//	        
//	        System.out.println("Total Days: " + totalDays);
//	        System.out.println("Total Months: " + totalMonths);
}
}
