package collection;
import java.util.*;
public class Collection {
    void fun(){
        Set st=new HashSet();                          // initialise a set

        st.add("coke");
        st.add("pepsi");
        st.add(5.6);

        if(st.contains("magii")){                        //contains
            System.out.println("Found");
            System.out.println(st);

        }
        else{
            System.out.println("not found");

        }
        st.remove("coke");
        System.out.println(st);
    }
    public static void main(String[] args) {
        Collection obj=new Collection();
        obj.fun();
    }
}
