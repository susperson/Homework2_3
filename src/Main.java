public class Main {
    public static void main(String[] args) {
        //Задача 3_6
        var firstFighterWeight = 78.2;
        var secondFighterWeight = 82.7;

        var fightersWeight = firstFighterWeight + secondFighterWeight;
        System.out.println("Общий вес двух бойцов " + fightersWeight + " кг.");

        var weightDifference = secondFighterWeight - firstFighterWeight;
        System.out.println("1. Разница в весе бойцов: " + weightDifference + " кг.");

        //Задача 3_7 (вычитание выше)
        weightDifference = secondFighterWeight % firstFighterWeight;
        System.out.println("2. Разница в весе бойцов: " + weightDifference + " кг.");

        //Задача 3_8
        var hoursSummary = 640;
        var oneEmployeeHours = 8;
        var headcount = hoursSummary / oneEmployeeHours;
        System.out.println("Всего работников в компании - " + headcount + " человек.");

        headcount = headcount + 94;
        hoursSummary = headcount * oneEmployeeHours;
        System.out.println("Если в компании работает " + headcount + " человека, то всего " + hoursSummary + " часов работы может быть поделено между сотрудниками.");
    }
}