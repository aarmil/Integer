public class Seconds {
    public static void main(String[] args) {
        // Number of Second is given
        int seconds = 10000000;

        //Seconds in minutes, hours and days
        int secondsInMinutes = 60;
        int secondsInHours = secondsInMinutes * 60;
        int secondsInDay = secondsInHours * 24;

        //Number of days
        int days = seconds / secondsInDay;

        //Number of hours
        int hours = (seconds - secondsInDay * days) / secondsInHours;

        //Number of minutes
        int minutes = (seconds - secondsInDay * days - secondsInHours * hours) / secondsInMinutes;

        //Number of seconds
        int secondsLeft = seconds - secondsInDay * days - secondsInHours * hours - secondsInMinutes * minutes;

        //Result!
        System.out.println("Дано количество секунд: " + seconds);
        System.out.println("Это равно");
        System.out.println("Дней: " + days);
        System.out.println("Часов: " + hours);
        System.out.println("Минут: " + minutes);
        System.out.println("Секунд: " + secondsLeft);
    }
}
