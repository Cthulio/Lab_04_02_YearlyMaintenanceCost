//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double costOfSpring = 3452.23;
        double costOfSummer = 2105.11;
        double costOfAutumn = 2245.01;
        double costOfWinter = 2859.91;
        double yearlyMaintenanceCost= costOfSpring+costOfSummer+costOfAutumn+costOfWinter;
        System.out.println("The total cost of maintenance for all seasons, (Spring):"+costOfSpring+" (Summer):"
                +costOfSummer+" (Autumn):"+costOfAutumn+" and (Winter):"+costOfWinter+", is: "+yearlyMaintenanceCost);
    }
}