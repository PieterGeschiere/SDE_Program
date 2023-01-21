package builder;

public class Director {

    public void buildAmongUs(GameBuilder builder) {
        builder.name("Among Us")
                .price(9);
    }

    public void buildBackrooms(GameBuilder builder) {
        builder.name("Backrooms")
                .price(7);
    }

    public void buildOverwatch(GameBuilder builder) {
        builder.name("Overwatch")
                .price(40);
    }
}
