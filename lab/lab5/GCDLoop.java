public class GCDLoop{
    public static void main(String args[]){ 
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int r = 1; 
        while (r>0) {
            r = a % b;
            a = b;
            b = r;
            }
        System.out.println(a);
        }
}
            
