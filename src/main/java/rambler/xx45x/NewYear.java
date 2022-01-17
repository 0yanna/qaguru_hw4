package rambler.xx45x;

public class NewYear {
    int number;
    String name;
    String color;
    boolean even;

    public void getcountDays() {
        if (even) System.out.println("it's leap year");
        else System.out.println("it's low year");
    }

    public void getInfoAboutHoliday() {
        System.out.println("This year is"+ " " + number + " " + name+ " " + color);
    }
}