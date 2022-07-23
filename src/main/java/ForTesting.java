import java.util.ArrayList;

public class ForTesting {
//
//    ForTesting = new ForTesting();
//    ForTesting.getDay(-1);

    public static String getDay(Integer dayNumber) {

        ArrayList<String> daysList = new ArrayList<>();
        daysList.add("Sunday");
        daysList.add("Monday");
        daysList.add("Tuesday");
        daysList.add("Wednesday");
        daysList.add("Thursday");
        daysList.add("Friday");
        daysList.add("Saturday");


        if (dayNumber == null) {
            throw new NullPointerException();
        } else if (dayNumber < 1) {
            System.out.println("The number cannot be less than 1");
        } else if (dayNumber > 7) {
            System.out.println("The number cannot be more than 7");
        }
        return daysList.get(dayNumber - 1);
    }
    
    
    //for GIT


}




