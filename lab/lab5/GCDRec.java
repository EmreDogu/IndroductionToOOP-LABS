public class GCDRec{
    public static void main(String args[]){
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        System.out.println(gcd(a,b));
    }
        
    public static int gcd(int a, int b){  
        if (b==0)
            return a;
        return gcd(b, a%b);
    }
}
