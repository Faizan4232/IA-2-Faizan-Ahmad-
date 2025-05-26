
public class Q2FrogJump {

    int minCost(int[] height) {
        int n = height.length;
        if (n == 1) {
            return 0;
        }
        int[] f = new int[n];
        f[0] = 0;
        f[1] = Math.abs(height[1] - height[0]);
        for (int i = 2; i < n; i++) {
            int oneStep = f[i - 1] + Math.abs(height[i] - height[i - 1]);
            int twoSteps = f[i - 2] + Math.abs(height[i] - height[i - 2]);
            f[i] = Math.min(oneStep, twoSteps);
        }
        return f[n - 1];
    }

    public static void main(String[] args) {
        Q2FrogJump frogJump = new Q2FrogJump();
        int[] height = {10, 20, 30, 10};
        int result = frogJump.minCost(height);
        System.out.println("Minimum cost to reach the last step: " + result);
    }
}
