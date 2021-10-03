public class SportCar extends Car{
    double maxSpeed;
    public SportCar(String mark,double weight, Engine engine, double maxSpeed){
        this.mark=mark;
        this.weight=weight;
        this.engine=engine;
        this.kind="Sport Car";
        this.maxSpeed=maxSpeed;
    }
    public void printInfo(){
        System.out.println("Марка: " + mark + "\nКласс: " + kind + "\nВес: " + weight + "\nМощность: " + engine.power
                + "\nПроизводитель двигателя: " + engine.manufacturer + "\nМаксимальная скорость: " + maxSpeed);
    }
}
