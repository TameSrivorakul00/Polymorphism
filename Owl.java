public class Owl extends Animal 
 {

    @Override
    void sound() {
        System.out.println("hoot hoot");
    }

    @Override
    public void fly() {
        System.out.println("ฮูกบิน");

    }

    @Override
    public void glide() {
       System.out.println("ฮูกร่อน");

    }

}
