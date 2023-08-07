package me.krios2146.medium;

public class ReverseInteger {
    public int reverse(int x) {
        StringBuilder sb = new StringBuilder();
        boolean isSigned = false;
        if (x < 0) {
            isSigned = true;
            x = x * -1;
        }
        sb.append(x);
        sb.reverse();
        try {
            int i = Integer.parseInt(sb.toString());
            return isSigned ? i * -1 : i;
        } catch (Exception e) {
            return 0;
        }
    }
}
