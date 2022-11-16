public class Triangle extends Shape{
    private double bSide;
    private double cSide;

    public Triangle(String name, double aSide, double bSide, double cSide) {
        super(name, aSide);
        this.bSide = bSide;
        this.cSide = cSide;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public double getASide() {
        return super.getASide();
    }

    @Override
    public void setASide(double aSide) {
        super.setASide(aSide);
    }

    public double getBSide() {
        return bSide;
    }

    public void setBSide(double bSide) {
        this.bSide = bSide;
    }

    public double getCSide() {
        return cSide;
    }

    public void setCSide(double cSide) {
        this.cSide = cSide;
    }

    @Override
    public double getPerimeter() {
        return getASide() + getBSide() + getCSide();
    }
}
