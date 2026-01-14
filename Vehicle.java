public class Vehicle {

    public void testSpeed(int speed) throws TooFastException {
        if (speed > 90) {
            throw new TooFastException(speed);
        }
        System.out.println("Speed is within limits: " + speed);
    }

    public static void main(String[] args) {
        Vehicle car = new Vehicle();

        try {
            car.testSpeed(80);   // OK
            car.testSpeed(120);  // Exception
        } catch (TooFastException e) {
            e.printStackTrace();
        }
    }
}
