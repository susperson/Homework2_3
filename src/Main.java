public class Main {
    public static void main(String[] args) {
        //Задача 3_6
        var firstFighterWeight = 78.2;
        var secondFighterWeight = 82.7;

        var fightersWeight = firstFighterWeight + secondFighterWeight;
        System.out.println("Общий вес двух бойцов " + fightersWeight + " кг.");

        var weightDifference = secondFighterWeight - firstFighterWeight;
        System.out.println("Разница в весе бойцов: " + weightDifference + " кг.");
    }
}