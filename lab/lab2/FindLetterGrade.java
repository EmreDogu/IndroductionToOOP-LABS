public class FindLetterGrade{
    
    public static void main(String[] args){
    
        int value1 = Integer.parseInt(args[0]);
        
        if (value1>=90 && value1<=100)
            System.out.println("Your grade is A");
            else if (value1>=80 && value1<90)
                System.out.println("Your grade is B");
            else if (value1>=70 && value1<80)
                System.out.println("Your grade is C");
            else if (value1>=60 && value1<70)
                System.out.println("Your grade is D");
            else if (value1>=0 && value1<60)
                System.out.println("Your grade is F");
            else
                System.out.println("Not a valid grade!");
    }
}
    
        
