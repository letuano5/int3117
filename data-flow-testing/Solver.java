public class Solver {
    public int countIntegerPointsInCircle(double x, double y, double r) throws Exception {
        if (x < -10 || x > 10 || y < -10 || y > 10 || r < 0 || r > 10) {
            throw new Exception("Input không hợp lệ");
        }
        long xx = Math.round(x * 10000);
        long yy = Math.round(y * 10000);
        long rr = Math.round(r * 10000);

        int ans = 0;
        for (int px = (int) Math.ceil(x - r); px <= (int) Math.floor(x + r); px++) {
            for (int py = (int) Math.ceil(y - r); py <= (int) Math.floor(y + r); py++) {
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
