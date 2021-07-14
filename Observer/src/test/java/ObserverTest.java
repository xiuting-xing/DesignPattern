import org.junit.jupiter.api.Test;

/**
 * @Author ken_xing
 * @Date 2021/6/21--16:48
 * @Version 1.0
 * @Description
 */
public class ObserverTest {
    @Test
    public void ObserverTest()
    {
        Hero hero=new Hero();
        Monster monster=new Monster();
        Demon demon=new Demon();

        //添加进去观察者怪物和宝藏
        hero.attachObserver(monster);
        hero.attachObserver(demon);

        hero.move();
    }
}
