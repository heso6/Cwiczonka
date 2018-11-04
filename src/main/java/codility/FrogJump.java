package codility;

public class FrogJump {
    public static int solution(int X, int Y, int D) {
        // write your code in Java SE 8
        int steps = (Y - X) / D;
        int extras = (Y - X) % D > 0 ? 1 : 0;
        return steps + extras;
    }
}

