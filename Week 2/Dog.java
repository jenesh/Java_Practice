public class Dog {
    public int weightInPounds;
    public void makenoise () {
        if (weightInPounds < 10) {
            System.out.println("Meow! Meow!");
        } else if (weightInPounds < 30) {
            System.out.println("Bark! Bark!");
        } else {
            System.out.println("Wolf!");
        }
    }
}