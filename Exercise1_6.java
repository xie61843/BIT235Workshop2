public class Exercise1_6 {
    public static void main(String[] args) {
        double tank = 40;              // total fuel tank capacity: 40 L
        double fuelPer100Normal = 8;   // fuel consumed per 100 km on a normal road
        double fuelPer100Rough = fuelPer100Normal * 1.15;  // rough road: +15% fuel

        double distNormal = tank / fuelPer100Normal * 100;
        double distRough = tank / fuelPer100Rough * 100;

        System.out.println("Distance on a normal road with a full tank: " + distNormal + " km");
        System.out.println("Distance on a rough road with a full tank: " + distRough + " km");
    }
}
