package Decorator;

import Base.IMilkTea;
import Base.MilkTeaDecorator;

public class BlackSugar extends MilkTeaDecorator {
    public BlackSugar(IMilkTea inner) {
        super(inner);
    }

    @Override
    public double Cost() {
        return 3 + iMilkTea.Cost();
    }
}
