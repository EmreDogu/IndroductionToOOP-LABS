public class FindPrimes{
    public static void main(String[] args){
        int kontrol;
        int number = Integer.parseInt(args[0]);        
        for(int i=2; i<=number; i++){
            kontrol=0;
            for(int z=2; z<=i/2; z++){
                if(i%z==0) 
                    kontrol++;
            }
            if(kontrol==0) 
                    System.out.println(i);
        }
    }
}
