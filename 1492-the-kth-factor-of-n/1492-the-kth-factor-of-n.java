class Solution {
    public int kthFactor(int n, int k) {
        List<Integer> factors = new ArrayList<>();
           for (int i = 1; i <= n / 2; i++) {
                if (n % i == 0) {
                    factors.add(i);
                }
            }
            factors.add(n);

        if (k > factors.size() || k <= 0) {
            return -1;
        }

        return factors.get(k - 1);
    }
}       