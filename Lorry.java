public class Lorry extends Car{
    double maxWeight;
    public Lorry(String mark,double weight, Engine engine, double maxWeight){
        this.mark=mark;
        this.weight=weight;
        this.engine=engine;
        this.kind="Lorry";
        this.maxWeight=maxWeight;
    }
    public void printInfo(){
        System.out.println("Марка: " + mark + "\nКласс: " + kind + "\nВес: " + weight + "\nМощность: " + engine.power
                + "\nПроизводитель двигателя: " + engine.manufacturer + "\nМаксимальный вес: " + maxWeight);
    }
}
