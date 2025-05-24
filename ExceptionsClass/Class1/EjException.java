package ExceptionsClass.Class1;

public class EjException {
    public static void main(String[] args) {
        int divisor;
        try {
            divisor =  Integer.parseInt("0");
            int div = 10 / divisor;
            System.out.println(div);
        } catch (NumberFormatException nfe) {
            System.out.println("1~ = Number exception: " + nfe);
        } catch (ArithmeticException ae) {
            System.out.println("2~ = Take the exception: " + ae);
        } finally {
            System.out.println("Is optional but always exec");
        }
    }
}
