import java.util.Arrays;
import java.util.HashMap;
import java.util.function.IntConsumer;

/**
 * Created by Administrator on 2015-7-29.
 */
public class Demo2 {
    static int[] arr={1,3,4,5,6,7,8,9,10};

    public static void main(String[] args) {

        Arrays.stream(arr).forEach((x)->
        System.out.println(x));

    }
}

class Demo<K,V>{
    private K data;

}