public class CoinChangeProblem {
    public static int coinChange(int[] coins, int amount) {
        if (amount == 0) return 0;
        if (amount < 0) return -1;
        int minCoins = Integer.MAX_VALUE;
        for (int coin : coins) {
            int res = coinChange(coins, amount - coin);
            if (res >= 0 && res < minCoins) {
                minCoins = res + 1;
            }
        }
        return (minCoins == Integer.MAX_VALUE) ? -1 : minCoins;
    }

    public static void main(String[] args) {
        int[] coins = {1, 2, 5};
        int amount = 11;
        int result = coinChange(coins, amount);
        System.out.println("Minimum coins needed: " + result);
    }
}