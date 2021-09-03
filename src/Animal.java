public class Animal {
    private static int count = 0;
    protected String name;

    public Animal( String name) {
        this.count++;
        this.name = name;
    }

    public void run (int dist){
        if (dist >= 0) {
            System.out.println(name + " пробежал " + dist + " м.");
        }else {
            System.out.println("Расстояние не может быть отрицательным");
        }
    }


    public static int getCount() {
        return count;
    }

    public void swim (int dist){
        if (dist >= 0) {
        System.out.println(name + " проплыл " + dist + " м.");
        }else {
        System.out.println("Расстояние не может быть отрицательным");
    }
    }
}
