import java.util.Scanner;
public class LifeClockConsole {

    public static void main ( String [] args)
    
    {
        int age, hourMark, hourMarkPM, minuteMark, time;
        Scanner scan = new Scanner (System.in);
        boolean answerGood = false ;
        String answer = "" ;
        
        System.out.println("Comparing your life to a 24-hour clock");
        System.out.println("************************************");
        
        while (!answer.equals("y") )
        {
            System.out.println("Please input your age (1-80)");
            age = scan.nextInt();       
                    while (answerGood = false)
                {
                if (age < 1 || age > 80)
                    System.out.println("You are outside of valid age range. Please input again");
                else
                    System.out.println("You are " + age + " years old.");
                    answerGood = true;
                }
        
        time = age * 18;
        minuteMark = (age * 18) % 60;
        hourMark = (time - minuteMark)/60;
        hourMarkPM = hourMark - 12;
        System.out.println("************************************");
        
        // Answer Mode - reply changes according to user input
        System.out.print("Your life clock is pointing at ");
         if (hourMark == 0)
           {
            System.out.println("12:" + minuteMark + " AM");
            System.out.println("Are you a newborn baby?");
        	}
            // Early Morning
             if (hourMark > 0 && hourMark < 6)
           { 
            System.out.println(hourMark + ":" + minuteMark + " AM");
            System.out.println("************************************");
            System.out.println("Everyone's sleeping during this early morning. No need to be in a hurry!");
        	}
            // Morning
            if (hourMark >= 6 && hourMark < 9)
            {
            System.out.println(hourMark + ":" + minuteMark + " AM");
            System.out.println("************************************");
            System.out.println("The morning has just started. It's a good time to plan out the rest of the day. You have your whole day ahead of you.");
        	}
            // Later morning 
            if (hourMark >= 9 && hourMark < 12)
            {
            System.out.println(hourMark + ":" + minuteMark + " AM");
            System.out.println("************************************");
            System.out.println("It's still morning. You have ample time to plan out your afternoon and night. You have a plenty of time left.");
        	}
            // Noon
            if (hourMark == 12)
            {
            System.out.println("12:" + minuteMark + " PM");
            System.out.println("************************************");
            System.out.println("It's lunch time! When you look back at the morning, what did you learn? How can you make your afternoon and night better?");
        	}
            // Afternoon
        if (hourMark > 12 && hourMark <= 18) 
            {
            System.out.println(hourMarkPM + ":" + minuteMark + " PM");
            System.out.println("************************************");
            System.out.println("How will you capitalize this afternoon? How will you plan out your night? ");
        	}
        if (hourMark > 18)
            {
            System.out.println(hourMarkPM + ":" + minuteMark + " PM");
            System.out.println("************************************");
            System.out.println("How do you want to spend the rest of the night? Aren't there still many things you'd like to do?");
        	}       
            System.out.println("************************************");
            System.out.println("Finish program? (press y to finish or n to play again");
            answer = scan.next();
             
    }

		System.out.println("************************************");
		System.out.println("Done. Have a nice day!");
	}
    
}
