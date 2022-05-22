import java.lang.Math;
public class measuringDistance {
    public static void main(String[] args) {

        System.out.println(args[0]);
        System.out.println(args[1]);
        int i = Integer.parseInt(args[0]);
        int j = Integer.parseInt(args[0]);
        double a = Math.pow(i, 2);
        double b = Math.pow(j, 2);
        double measureDistance = Math.sqrt(a + b);
        System.out.println("measuring distance using command line arguement:" + measureDistance);
    }
}