public class Seconds {
    public static void main(String[] args) {
        // Дано количество секунд
        int seconds = 10000000;

        //Сохраним сколько секунд в минутах, часах и сутках
        int secondsInMinutes = 60;
        int secondsInHours = secondsInMinutes * 60;
        int secondsInDay = secondsInHours * 24;

        //Считаем количество дней
        int days = seconds / secondsInDay;

        //Считаем количество часов
        int hours = (seconds - secondsInDay * days) / secondsInHours;

        //Считаем количество минут
        int minutes = (seconds - secondsInDay * days - secondsInHours * hours) / secondsInMinutes;

        //Считаем количество секунд
        int secondsLeft = seconds - secondsInDay * days - secondsInHours * hours - secondsInMinutes * minutes;

        //Вывод информации
        System.out.println("Дано количество секунд: " + seconds);
        System.out.println("Это равно");
        System.out.println("Дней: " + days);
        System.out.println("Часов: " + hours);
        System.out.println("Минут: " + minutes);
        System.out.println("Секунд: " + secondsLeft);
    }
}
