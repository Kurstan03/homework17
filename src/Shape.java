public abstract class Shape {
    private String name;
    private double aSide;

    public Shape(String name, double aSide) {
        this.name = name;
        this.aSide = aSide;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getASide() {
        return aSide;
    }

    public void setASide(double aSide) {
        this.aSide = aSide;
    }

    public abstract double getPerimeter();
}
