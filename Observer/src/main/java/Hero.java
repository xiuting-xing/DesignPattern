/**
 * @Author ken_xing
 * @Date 2021/6/21--16:46
 * @Version 1.0
 * @Description
 */
public class Hero extends Subject {
    public void move()
    {
        System.out.println("主角出场");
        notifyObserver();
    }
}
