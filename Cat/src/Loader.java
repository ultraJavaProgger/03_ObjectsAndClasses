public class Loader
{
    public static void main(String[] args)
    {
        Cat cat = new Cat();
        Cat cat2 = new Cat();

        System.out.println("\n========================================");
        System.out.println("The first cat weight: " + cat.getWeight() + ".\nSecond cat weight: " + cat2.getWeight() + ".");
        System.out.println("========================================\n");

        System.out.println("Let's feed our cats.");

        cat.feed(2.0);
        cat2.feed(2.0);

        System.out.println("\n========================================");
        System.out.println("The first cat weight: " + cat.getWeight() + ".\nSecond cat weight: " + cat2.getWeight() + ".");
        System.out.println("========================================\n");

        System.out.println("Let's overfeed our cats.");

        cat.overfeed(1.0);
        cat2.overfeed(1.0);

        System.out.println("\n========================================");
        System.out.println("The first cat status: " + cat.getStatus() + ".\nSecond cat status: " + cat2.getStatus() + ".");
        System.out.println("========================================\n");

        System.out.println("Let's \"замяукаем\" cats.\n");

        cat.meow();
        cat2.meow();

        System.out.println("\n========================================");
        System.out.println("The first cat status: " + cat.getStatus() + ".\nSecond cat status: " + cat2.getStatus() + ".");
        System.out.println("========================================\n");
    }
}