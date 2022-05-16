package io.cucumber.skeleton;

public class Belly {
    private boolean growling;
    private int amountOfCookiesInBelly;

    public Belly(boolean growling) {
        this.growling = growling;
    }

    public void eat(int amountOfCookies) {

    }

    public boolean isGrowling() {
        return growling;
    }
}
