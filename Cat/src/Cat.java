public class Cat
{
    private double originWeight;
    private double weight;

    private double minWeight;
    private double maxWeight;

    public Cat()
    {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        minWeight = 1000.0;
        maxWeight = 9000.0;
    }

    public char meow()
    {
        while (weight > minWeight)
        {
            weight -= 1;
            System.out.println("Meow");
        }
        return 0;
    }

    public char feed(Double amount)
    {
        weight += amount;
        return 0;
    }

    public char overfeed(Double amount)
    {
        while (weight < maxWeight)
        {
            weight += amount;
        }
        return 0;
    }

    public void drink(Double amount)
    {
        weight += amount;
    }

    public Double getWeight()
    {
        return weight;
    }

    public String getStatus()
    {
        if (weight < minWeight) {
            return "Dead";
        } else if (weight > maxWeight) {
            return "Exploded";
        } else if (weight > originWeight) {
            return "Sleeping";
        } else {
            return "Playing";
        }
    }
}