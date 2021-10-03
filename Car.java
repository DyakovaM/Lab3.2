public abstract class Car {
    String mark, kind;
    double weight;
    Engine engine;
    public void start(){
        System.out.println(kind + " " + mark + " поехал");
    }
    public void stop(){
        System.out.println(kind + " " + mark + " остановился");
    }
    public void turnLeft(){
        System.out.println("Поворот налево");
    }
    public void turnRight(){
        System.out.println("Поворот направо");
    }
    public void printInfo(){
        System.out.println("Марка: " + mark + "\nКласс: " + kind + "\nВас: " + weight + "\nМощность: " + engine.power
                + "\nEngine manufacturer: " + engine.manufacturer);
    }
}
