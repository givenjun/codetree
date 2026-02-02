import java.util.*;

class DateInfo {
    String date;
    String day;
    String weather;
    public DateInfo(){}
    public DateInfo(String date, String day, String weather) {
        this.date = date;
        this.day = day;
        this.weather = weather;
    }
    public void print() {
        System.out.println(this.date + " " + this.day + " " + this.weather);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String rainDate = "";
        DateInfo[] info = new DateInfo[n];
        for (int i = 0; i < n; i++) {
            String date = sc.next();
            String day = sc.next();
            String weather = sc.next();
            // Please write your code here.
            info[i] = new DateInfo(date, day, weather);
            if (weather.equals("Rain")) rainDate += (date + "\n");
        }
        String[] rainDates = rainDate.split("\n");
        Arrays.sort(rainDates);
        for (int i = 0; i < n; i++) {
            String date = info[i].date;
            if (rainDates[0].equals(date)) {
                info[i].print();
                break;
            }
        }
    }
}