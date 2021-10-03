public class Movement {
    public static void main(String args[]){
        Engine FerrariEngine = new Engine(9000.0, "Ferrari");
        Engine Ferrari = new Engine(570.0, "Ferrari");
        Car car1 = new SportCar("Ferrari", 1485.0, FerrariEngine, 500);
        car1.start();
        car1.turnLeft();
        car1.turnRight();
        car1.stop();
        car1.printInfo();
        Engine ManEngine = new Engine(1000.0, "MAN");
        Car car2 = new Lorry("MAN", 4000.0, ManEngine, 100000.0);
        car2.start();
        car2.turnLeft();
        car2.turnRight();
        car2.stop();
        car2.printInfo();

    }
}

