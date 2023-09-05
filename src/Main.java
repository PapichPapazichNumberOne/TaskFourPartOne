public class Main {

    public static void main(String[] args) {
        Plate plate = new Plate(20);
        Cat[] cats = new Cat[3];
        Dog[] dogs = new Dog[2];

        for (int i = 0; i < cats.length; i++) {
            cats[i] = new Cat();
        }

        for (int i = 0; i < dogs.length; i++) {
            dogs[i] = new Dog();
        }


        for (Cat cat : cats) {
            int amount = 10;
            cat.eat(amount, plate.getFood());
        }

        System.out.println("Сытость котов:");
        for (Cat cat : cats) {
            System.out.println("Кот наелся: " + cat.isFull());
        }

        System.out.println("Создано животных: " + Animal.getCount());
        System.out.println("Создано котов: " + Cat.getCount());
        System.out.println("Создано собак: " + Dog.getCount());


        for (Cat cat : cats) {
            cat.run(100);
            cat.swim(5);
        }

        for (Dog dog : dogs) {
            dog.run(400);
            dog.swim(8);
        }
    }
}
