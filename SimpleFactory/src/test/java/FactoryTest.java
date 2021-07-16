import org.junit.jupiter.api.Test;

/**
 * @Author ken_xing
 * @Date 2021/7/16--10:22
 * @Version 1.0
 * @Description
 */
public class FactoryTest {
    @Test
    public void simpleFactoryTest()
    {
        ICreateProductions productions=ProductionsFactory.getInstance(1);
        productions.CreateIcecream();

        ICreateProductions productions1=ProductionsFactory.getInstance(2);
        productions1.CreateIcecream();
    }

}
