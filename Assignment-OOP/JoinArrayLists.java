import java.util.ArrayList;
import java.util.List;

public class JoinArrayLists
{
    public static void main(String[] args)
    {
        List<String> weekdays = new ArrayList<>();
        weekdays.add("Monday");
        weekdays.add("Tuesday");
        weekdays.add("Wednesday");
        weekdays.add("Thursday");
        weekdays.add("Friday");

        List<String> weekend = new ArrayList<>();
        weekend.add("Saturday");
        weekend.add("Sunday");

        weekdays.addAll(weekend);

        System.out.println("Array list: " + weekdays);
    }
}
