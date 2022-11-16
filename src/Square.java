public class Square extends Shape{
    public Square(String name, double aSide) {
        super(name, aSide);
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

    @Override
    public double getPerimeter() {
        return getASide() * 4;
    }
}
