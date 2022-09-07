package Noor.week2b.override;

public class override {
    void sample() {
        System.out.print("this is sample class");
    }
}

class over extends override {
    void sample() {
        System.out.print("this is sample extended class");
    }
}

class OverrideDemo {
    public static void main(String args[]) {
        over obj = new over();
        obj.sample();
    }
}
