package Decorator;

import Base.IMilkTea;
import Base.MilkTeaDecorator;

public class Buble extends MilkTeaDecorator {

    public Buble(IMilkTea inner) {
        super(inner);
    }

    @Override
    public double Cost() {
        return 5 + iMilkTea.Cost();
    }

}
