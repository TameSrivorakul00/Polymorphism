public class PekingDuck extends Duck {

 @Override
 public void clean(Animal animal) { // overriding
    System.out.println(animal + "I cannot clean. I died already.");
  }
  
}
