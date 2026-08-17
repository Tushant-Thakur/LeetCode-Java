class Solution {
    public static boolean isPrime(long num){
        if(num<2) return false;
        for(long i=2;i*i<=num;i++){
            if(num%i==0) return false;
        }
        return true;
    }
    public long sumOfLargestPrimes(String s) {
        Set<Long> primes = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            long num = 0;
            for (int j = i; j < s.length(); j++) {
                num = num * 10 + (s.charAt(j) - '0');
                if (isPrime(num)) {
                    primes.add(num);
                }
            }
        }
        List<Long> list = new ArrayList<>(primes);
        list.sort(Collections.reverseOrder());

        long sum = 0;
        for (int i = 0; i < Math.min(3, list.size()); i++) {
            sum += list.get(i);
        }
        return sum;
        
    }
}