package autotyper;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.HashMap;

public class autoclicker 
{    
    public static HashMap<Integer,Integer> keys = new HashMap<Integer, Integer>()    ;
    // 0 48
    // 1 49
    // 2 50
    // ....
    // 9 57
    public static void main(String[] args)
    {
        keys.put(0, 48);
        keys.put(1, 49);
        keys.put(2, 50);
        keys.put(3, 51);
        keys.put(4, 52);
        keys.put(5, 53);
        keys.put(6, 54);
        keys.put(7, 55);
        keys.put(8, 56);
        keys.put(9, 57);
        
    try {
        Robot robot = new Robot();
           robot.delay(10000);      
        ArrayList<Integer> storage = new ArrayList<Integer>();
           for(int i = 1481;i <=10000;i+=2){
            storage = listKeys(i);
            for(int j = storage.size() -1;j>=0;j--){
                robot.keyPress(storage.get(j));
                robot.delay(1);
                robot.keyRelease(storage.get(j));
            }
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
            robot.delay(3000);
        }
        }catch (AWTException ex) {}
    }
    public static ArrayList<Integer> listKeys(int number){
        ArrayList<Integer> output = new ArrayList<Integer>();
        while(number != 0){
            output.add(keys.get(number%10));
            number/=10;
        }
        return output;
    }

}