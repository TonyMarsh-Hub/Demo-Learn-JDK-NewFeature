package streamapi.useStrategePattern.filter.impl;


import streamapi.User;
import streamapi.useStrategePattern.filter.MyFilter;

public class AgeFilter implements MyFilter<User> {
    @Override
    public boolean filter(User users) {
        return users.getAge() >= 25;
    }
}
