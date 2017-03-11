package designPattern.builder;

public class Test {

    public static void main(String[] args) {
        Builder builder = new MailBuilder();
        Director director = new Director(builder);
        director.build();
    }

}
