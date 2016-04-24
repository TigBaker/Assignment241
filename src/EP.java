import java.util.*;
import java.lang.*;
/**
 *@author Jacques Jamieson
 *241 Assignment 2016
 *EP implements ExamPile interface
 */
public class EP implements ExamPile{

    /**Holds the exam pile stack*/
    private List<Integer> items ;

    /**Used to indicate the size of the stack and next available position*/
    private int top = 0;
    public static void main(String [] args){
        ExamPile exampile = new EP();
        exampile.load(new ArrayList<Integer>());
        int test = exampile.mark(1, 2);
        System.out.println(test);
    }

    /**Used to indicate the size of the stack and next available position*/
    public void load(List<Integer> items){
        this.items = items;
    }

    /**Used to indicate the size of the stack and next available position*/
    public int size(){
        return 0;
    }

    /**Used to indicate the size of the stack and next available position*/
    public int peak(){
        try{
            return 0;
        }catch(EmptyPileException e){
            e.printStackTrace();
        }

        return 0;
    }

    /**Used to indicate the size of the stack and next available position*/
    public int mark(int depth, int value){
        int returnValue = 0;
        try{
            for(int i = 0; i < depth; i++){
                if(i == this.items.get(i) ){
                    returnValue = this.items.get(i);
                    this.items.remove(i);
                    return returnValue;
                }
            }

        }catch(EmptyPileException e){
            e.printStackTrace();
        }
        return -1;
    }

    /**Used to indicate the size of the stack and next available position*/
    public void delay(int count) {
        try {

        } catch (EmptyPileException e) {
            e.printStackTrace();
        }
    }
}
