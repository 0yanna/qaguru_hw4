package rambler.xx45x;

public class Main {
    public static void main(String[] args) {
        NewYear currentYear = new NewYear();
        currentYear.number = 2022;
        currentYear.name = "year of tiger";
        currentYear.color = "blue";
        currentYear.even = true;
        currentYear.GetInfoAboutHoliday();
        currentYear.CountDays();
    }
}
