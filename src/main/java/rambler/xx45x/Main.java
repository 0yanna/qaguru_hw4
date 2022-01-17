package rambler.xx45x;

public class Main {
    public static void main(String[] args) {
        NewYear currentYear = new NewYear();
        currentYear.number = 2022;
        currentYear.name = "year of tiger";
        currentYear.color = "blue";
        currentYear.even = true;
        currentYear.getInfoAboutHoliday();
        currentYear.getcountDays();

        Traditions infoTraditions = new Traditions();
        infoTraditions.number = 2022;
        infoTraditions.country = "Russia";
        infoTraditions.food = "caviar";
        infoTraditions.getInfoAboutTraditions();

        Family infoFamily = new Family();
        infoFamily.firstPerson = "Mather";
        infoFamily.secondPerson = "Father";
        infoFamily.thirdPerson = "Daughter";
        infoFamily.getWhoWillComeToTheParty();
    }
}