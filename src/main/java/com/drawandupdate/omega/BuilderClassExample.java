package com.drawandupdate.omega;

/**
 * Created by rojahn on 7/10/2017.
 */
public class BuilderClassExample {
    private String foo;
    private int id;
    private String bar;

    private BuilderClassExample(Builder builder) {
        setFoo(builder.foo);
        setId(builder.id);
        setBar(builder.bar);
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getFoo() {
        return foo;
    }

    public void setFoo(String foo) {
        this.foo = foo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBar() {
        return bar;
    }

    public void setBar(String bar) {
        this.bar = bar;
    }


    public static final class Builder {
        private String foo;
        private int id;
        private String bar;

        private Builder() {
        }

        public Builder withFoo(String val) {
            foo = val;
            return this;
        }

        public Builder withId(int val) {
            id = val;
            return this;
        }

        public Builder withBar(String val) {
            bar = val;
            return this;
        }

        public BuilderClassExample build() {
            return new BuilderClassExample(this);
        }
    }
}
