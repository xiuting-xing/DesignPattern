import java.util.*;

/**
 * @Author ken_xing
 * @Date 2021/6/21--16:01
 * @Version 1.0
 * @Description 被观察对象
 */
abstract public class Subject {
    private List<Observer> observerList=new ArrayList<Observer>();

    public void attachObserver(Observer observer)
    {
        observerList.add(observer);
    }

    public void detachObserver(Observer observer)
    {
        observerList.remove(observer);
    }

    public void notifyObserver()
    {
        for(Observer observer:observerList)
        {
            observer.update();
        }
    }

}
