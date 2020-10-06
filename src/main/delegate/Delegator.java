package main.delegate;

public class Delegator implements Coder{
    private SuperCoder superCoder;

    public Delegator() {
        this.superCoder = new SuperCoder();
    }
    @Override
    public void code(String need) {
        System.out.println("check the need is worth doing and profitable");
        // do some check
        superCoder.code(need);
    }
}
