public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Cow ngua = new Cow();
        ngua.eat();
        ngua.sound();
        Duck donald = new Duck();
        donald.sound();
        Pig piglet = new Pig();
        piglet.sound();
        Owl hedwig = new Owl();
        hedwig.sound();

        donald.fly();
        hedwig.fly();
        
        PekingDuck daisy = new PekingDuck();
        donald.clean(ngua);
        donald.clean(piglet);
        donald.clean(hedwig);



    }
}
