package designPattern.builder;

class Director {

    private Builder builder;

    Director(Builder builder) {
        this.builder = builder;
    }

    void build() {
        builder.build1();
        builder.build2();
    }


}
