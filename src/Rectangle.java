public class Rectangle extends Shape{
    private double bSide;

    public Rectangle(String name, double aSide,double bSide) {
        super(name, aSide);
        this.bSide = bSide;
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

    @Override
    public double getPerimeter() {
        return getASide() + getBSide() * 2;
    }
}
