import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

public class HalloJavamitForEach {
    List<String> arr;

    public static void main(String[] args){
        HalloJavamitForEach h = new HalloJavamitForEach();
        h.maketheList();
        h.normalGoThrough();
    }

    public void maketheList(){
        arr = new ArrayList<>();
        arr.add("Ahja");
        arr.add("B");
        arr.add("C");
        arr.add("D");
    }

    private void forEachGOThrough(){
        arr.forEach(a-> System.out.println(a));
    }

    private void normalGoThrough(){
        for(String s : arr) System.out.println(s);
    }
}
