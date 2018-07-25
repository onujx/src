import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Time {

    public static void main(String[] args) {

        SimpleDateFormat df = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");

        Date date = new Date();
        String today = df.format(date);
        System.out.println(today);

        Calendar c = Calendar.getInstance();
        String today2 = df.format(c.getTime());
        System.out.println(today2);

    }

}

