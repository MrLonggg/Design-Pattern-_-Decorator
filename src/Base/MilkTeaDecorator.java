package Base;

public abstract class MilkTeaDecorator implements IMilkTea {
    protected IMilkTea iMilkTea;

    protected MilkTeaDecorator(IMilkTea inner) {
        iMilkTea = inner;
    }

    @Override
    public abstract double Cost();
}
