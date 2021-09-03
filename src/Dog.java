public class Dog extends Animal {
    private static int count = 0;

    public Dog(String name) {
        super(name);
        this.count++;
    }

    @Override
    public void run(int dist) {
        if(dist > 500){
            System.out.println(super.name + " не может бежать больше 500 метров");
        }else {
            super.run(dist);
        }
    }

    @Override
    public void swim(int dist) {
        if(dist > 10){
            System.out.println(name + " не может плыть больше 10 метров");
        }else {
            super.swim(dist);
        }
    }

public static int getCount() {
    return count;
}



}

