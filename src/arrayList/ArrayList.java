package arrayList;
import java.util.*;
public class ArrayList {
    void func(){
        List ls=new java.util.ArrayList();
        ls.add("Coke");
        ls.add("Pepsi");
        System.out.println(ls);
        System.out.println("no of items: "+ls.size());


    }
    public static void main(String[] args) {
        ArrayList obj=new ArrayList();
        obj.func();
    }
}
