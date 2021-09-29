public class FindMinimum{
    
    public static void main(String[] args){
        
        int value1 = Integer.parseInt(args[0]);
        int value2 = Integer.parseInt(args[1]);
        int value3 = Integer.parseInt(args[2]);

        boolean condition1 = value1<=value2 && value1<=value3;
        boolean condition2 = value2<=value3 && value2<=value1;
        boolean condition3 = value3<=value1 && value3<=value2;
        
        if (condition1)
            System.out.println(value1);
            else if (condition2)
                System.out.println(value2);       
            else
                System.out.println(value3);        
    }
}
 
