package Collections.List;
import java.util.*;

public class StringsToArrayList {

    public static void main(String[] args)
    {  
        //array to arrayList
        String[] words = {"hi", "boom", "hello", "friend", "dear"};  
        
        //Arrays has a static method called asList() to convert an array into ArrayList
        
        //parameterization
        List<String> list = Arrays.asList(words);  
        
        System.out.println("As a list:" +list);
    
        for (String e : list)
        {  
            System.out.print(" "+ e);  
        }
    }
 }