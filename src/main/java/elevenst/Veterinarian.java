package elevenst;

import java.util.LinkedList;
import java.util.Queue;

public class Veterinarian {

    private final Queue<String> veterinarians;

    public Veterinarian() {
        veterinarians = new LinkedList<>();
    }

    public void accept(String petName) {
        veterinarians.offer(petName);
    }

    public String heal() {
        return veterinarians.poll();
    }

    public static void main(String[] args) {
        Veterinarian veterinarian = new Veterinarian();
        veterinarian.accept("Barkley");
        veterinarian.accept("Mittens");
        System.out.println(veterinarian.heal());
        System.out.println(veterinarian.heal());
    }
}
