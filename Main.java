package Generics.homework3;

public class Main {
    public static void main(String a[]) {
        Box<String, Banana> bananaBox = new Box<>("banana", new Banana());
        bananaBox.getObj().printClass();

        Box<String, Apple> appleBox = new Box<>("apple", new Apple());
        appleBox.getObj().printClass();

        Box<String, Fruit> fruitBox = new Box<>("fruit", new Fruit());
        fruitBox.getObj().printClass();

        // Класс-родитель Box параметризован <K, T extends Fruit>,
        // первым дженериком может быть любой тип данных (в т.ч. класс-обертка для примитивов)
        // главное, чтобы такой тип данных не нарушал дальнейшую работу программы.
        // Но второй дженерик имеет строгую типизацию, допускется использовать
        // только тип данных супер-класса Fruit и его наследников
        /*Box<String, Cabbage> cabbageBox = new Box<>("cabbage", new Cabbage());
        cabbageBox.getObj().printClass();*/

        VegetableBox<String, Cabbage> vegetableBox = new VegetableBox<>("cabbage", new Cabbage());
        vegetableBox.getObj().printClass();
    }
}
