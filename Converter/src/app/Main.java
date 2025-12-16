package app;

class Main {

    public static final double CONV_M_TO_KM = 1.60934;

    public static void main(String[] args) {
        System.out.println("Converter app");

        double miles = 5;
        double kms = convMilesToKms(miles);
        System.out.printf("Result is %.2f kilometers.%n", kms);
    }

    private static double convMilesToKms(double kms) {
        return kms * CONV_M_TO_KM;
    }
}