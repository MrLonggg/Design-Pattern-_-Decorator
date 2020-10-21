import Base.IMilkTea;
import Base.MilkTea;
import Base.MilkTeaDecorator;
import Decorator.BlackSugar;
import Decorator.Buble;

public class MilkTeaShop {
    public static void main(String[] args) {
        IMilkTea myMilkTea = new MilkTea();
        System.out.println(myMilkTea.Cost());

        Buble bubleMilTea = new Buble(myMilkTea);
        System.out.println(bubleMilTea.Cost());

        BlackSugar blackSugarMilkTea = new BlackSugar(myMilkTea);
        System.out.println(blackSugarMilkTea.Cost());

        MilkTeaDecorator blackSugarMilkTeaBuble = new Buble(blackSugarMilkTea);
        System.out.println(blackSugarMilkTeaBuble.Cost());
    }
}
