import java.util.List;

/**
 *@author Jacques Jamieson
 *241 Assignment 2014
 *ExamPile interface is a simple Stack implementation
 */
public interface ExamPile{

    public void load(List<Integer> items);

    public int size();

    public int peak();

    public int mark(int depth, int value);

    public void delay(int count);

}
