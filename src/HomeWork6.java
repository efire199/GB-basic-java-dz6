public class HomeWork6 {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Bobik");
        dog1.run(500);
        dog1.run(-1);
        Dog dog2 = new Dog("Sharik");
        dog2.run(501);
        dog2.run(1);
        Dog dog3 = new Dog("Mumu");
        dog3.swim(11);
        dog3.swim(10);
        dog3.swim(-1);
        Cat cat1 = new Cat("Murzik");
        cat1.run(200);
        cat1.run(201);
        cat1.swim(1);

        System.out.println("Всего животных " + Animal.getCount());
        System.out.println("Всего кошек " + Cat.getCount());
        System.out.println("Всего собак " + Dog.getCount());

    }

}
