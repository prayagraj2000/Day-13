public class Vec2 {
    private BigDecimal x, y;

    public Vec2(double xa, double ya) {
        this.x = BigDecimal.valueOf(xa);
        this.y = BigDecimal.valueOf(ya);
    }

    public Vec2(long xa, long ya) {
        this.x = BigDecimal.valueOf(xa);
        this.y = BigDecimal.valueOf(ya);
    }

    public Vec2(Vec2 vec) {
        this.x = vec.x;
        this.y = vec.y;
    }
    public void addX(double xa) {
        x = x.add(BigDecimal.valueOf(xa));
    }

    public void addX(long xa) {
        x = x.add(BigDecimal.valueOf(xa));
    }

    public void addY(double ya) {
        y = y.add(BigDecimal.valueOf(ya));
    }

    public void addY(long ya) {
        y = y.add(BigDecimal.valueOf(ya));
    }

    @Override
    public String toString() {
        return String.format("x = %s, y = %s", x.toString(), y.toString());
    }
}
