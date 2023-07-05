public class Vehicle implements Start,Stop {
    @Override
    public void start() {
        System.out.println("Vehicle is starting");

    }

    @Override
    public void stop() {
        System.out.println("Vehicle is stoping");
    }
}
