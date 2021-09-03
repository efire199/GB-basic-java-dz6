public class Cat extends Animal {
    private static int count = 0;

    public Cat(String name) {
        super(name);
        this.count++;
    }
    @Override
    public void run(int dist) {
        if(dist > 200){
            System.out.println(name + " не может бежать больше 200 метров");
        }else {
            super.run(dist);
        }
    }

    @Override
    public void swim(int dist) {
            System.out.println(name + " не умеет плавать");
    }
    public static int getCount() {
        return count;
    }

}
