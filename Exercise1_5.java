public class Exercise1_5 {
    public static void main(String[] args) {
        final double PI = 3.14;
        double sunDiameter = 865000;
        double earthDiameter = 7600;

        double sunR = sunDiameter / 2;
        double earthR = earthDiameter / 2;

        // a. volume of the Earth (cubic miles)
        double volEarth = 4.0 / 3 * PI * Math.pow(earthR, 3);

        // b. volume of the Sun (cubic miles)
        double volSun = 4.0 / 3 * PI * Math.pow(sunR, 3);

        // c. ratio of sun volume to earth volume
        double ratio = volSun / volEarth;

        System.out.println("a. Volume of the Earth (cubic miles): " + volEarth);
        System.out.println("b. Volume of the Sun (cubic miles): " + volSun);
        System.out.println("c. Sun volume / Earth volume = " + ratio);
    }
}
