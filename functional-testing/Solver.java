public class Solver {
    public int countIntegerPointsInCircle(double x, double y, double r) throws Exception {
        if (x < -10 || x > 10 || y < -10 || y > 10 || r < 0 || r > 10) {
            throw new Exception("Input không hợp lệ");
        }
        long xx = (long) (x * 10000);
        long yy = (long) (y * 10000);
        long rr = (long) (r * 10000);

        int ans = 0;
        for (int px = -1000; px <= 1000; px++) {
            for (int py = -1000; py <= 1000; py++) {
                if ((xx - px * 10000) * (xx - px * 10000) +
                    (yy - py * 10000) * (yy - py * 10000) <=
                    rr * rr) {
                    ++ans;
                }
            }
        }
        return ans;
    }

    public int countIntegerPointsInCircleCorrect(double x, double y, double r) throws Exception {
        if (x < -10 || x > 10 || y < -10 || y > 10 || r < 0 || r > 10) {
            throw new Exception("Input không hợp lệ");
        }
        long xx = Math.round(x * 10000);
        long yy = Math.round(y * 10000);
        long rr = Math.round(r * 10000);

        int ans = 0;
        for (int px = -1000; px <= 1000; px++) {
            for (int py = -1000; py <= 1000; py++) {
                if ((xx - px * 10000) * (xx - px * 10000) +
                    (yy - py * 10000) * (yy - py * 10000) <=
                    rr * rr) {
                    ++ans;
                }
            }
        }
        return ans;
    }
}
