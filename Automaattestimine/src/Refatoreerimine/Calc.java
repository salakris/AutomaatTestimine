package Refatoreerimine;

public class Calc {
	
    public static final int JUNIOR = 1;
    public static final int SENIOR = 2;
    public static final int SPECIALIST = 3;

    // Screen test
    public static void main(final String[] args) {
        Calc c = new Calc();
        System.err.println(c.pay(SPECIALIST, 3) + " should be 66");
    }

    protected int pay(final int type,final int h) {
        int Sum = 0;
        if (type == JUNIOR) {
            if (h > 8) { // if longer than eight hours
                Sum = 10 * (h - 8) * 2; // double pay
                Sum += 10 * 8;
            } else {
                Sum += 10 * h;
            }
        } else if (type == SENIOR) {
            if (h > 8) { // if longer than eight hours
                Sum = 15 * (h - 8) * 2; // double pay
                Sum += 15 * 8;
            } else {
                Sum += 15 * h;
            }
        } else if (type == SPECIALIST) {
            if (h > 9) { // if longer than nine hours
                Sum = 22 * (h - 9) * 3; // triple pay after 9 hours
                Sum += 22 * 9;
            } else {
                Sum += 22 * h;
            }
        } else if (h > 20) { // hero bonus
            if (type == JUNIOR) {
                Sum += 10;
            } else if (type == SENIOR) {
                Sum += 20;
            } else if (type == SPECIALIST) {
                Sum += 30;
            }
        }
        return Sum;
    }
}
