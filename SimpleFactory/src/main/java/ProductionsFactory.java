/**
 * @Author ken_xing
 * @Date 2021/7/16--9:47
 * @Version 1.0
 * @Description 简单工厂模式，将“类实例化“的操作于使用对象的操作进行分离解耦。
 */
public class ProductionsFactory {
    public static ICreateProductions getInstance(int productionType)
    {
        ICreateProductions productions;

        switch(productionType)
        {
            case 1:
                productions=new CreateLemon();
                break;
            case 2:
                productions=new CreateBanana();
                break;
            default:
                productions=new CreateBanana();
                break;
        }

        return productions;

    }
}
