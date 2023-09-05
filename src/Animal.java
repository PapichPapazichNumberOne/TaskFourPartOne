class Animal {
    private static int count = 0;

    public Animal() {
        count++;
    }

    public static int getCount() {
        return count;
    }

    public void run(int distance) {
        System.out.println("Животное пробежало " + distance + " м.");
    }

    public void swim(int distance) {
        System.out.println("Животное проплыло " + distance + " м.");
    }
}

class Cat extends Animal {
    private static int count = 0;
    private boolean isFull;

    public Cat() {
        super();
        count++;
        isFull = false;
    }

    public static int getCount() {
        return count;
    }

    public void eat(int amount, int foodInPlate) {
        if (foodInPlate >= amount) {
            foodInPlate -= amount;
            isFull = true;
            System.out.println("Кот поел и наелся.");
        } else {
            System.out.println("В миске недостаточно еды для кота.");
        }
    }

    public boolean isFull() {
        return isFull;
    }
}

class Plate {
    private int food;

    public Plate(int food) {
        this.food = Math.max(food, 0);
    }

    public void addFood(int amount) {
        if (amount > 0) {
            food += amount;
            System.out.println("В миску добавили " + amount + " еды.");
        } else {
            System.out.println("Нельзя добавить отрицательное количество еды.");
        }
    }

    public int getFood() {
        return food;
    }
}

