package streamapi.useStrategePattern.filter;

public interface MyFilter<User> {
    boolean filter(User user);
}
