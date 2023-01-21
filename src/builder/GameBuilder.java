package builder;

public class GameBuilder {
    private int id;
    private String name;
    private int price;

    public GameBuilder id(int id)  {
        this.id = id;
        return this;
    }

    public GameBuilder name(String name)  {
        this.name = name;
        return this;
    }

    public GameBuilder price(int price)  {
        this.price = price;
        return this;
    }

    public Game build() {
        return new Game(id, name, price);
    }
}


