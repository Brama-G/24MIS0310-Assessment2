class PrimeNumbers{
    public static void main(String args[]){
        System.out.println("Prime numbers from 1 to 10");
        for(int i = 2; i<=10; i++){
            int orig = i;
            int count = 0;
            for(int j = 1; j<=i; j++){
                if(i%j==0)
                    count++;
            }
            if(count == 2)
                System.out.println(i+" is prime number.");
        }
    }
}
