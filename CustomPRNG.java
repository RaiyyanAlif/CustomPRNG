package ict._22.ClassNames;

public class CustomPRNG {

    // Internal seed
    private static long seed = System.currentTimeMillis();

    // Core PRNG logic
    private static long nextSeed() {
        long a = 1664525;
        long c = 1013904223;
        long m = (1L << 32);

        seed = (a * seed + c) % m;

        // Bitwise mixing (novelty)
        seed ^= (seed << 13);
        seed ^= (seed >> 7);
        seed ^= (seed << 17);

        return Math.abs(seed);
    }

    // Generate random integer
    public static int randomInt() {
        return (int) (nextSeed() % Integer.MAX_VALUE);
    }

    // Overloaded: random integer within range
    public static int randomInt(int min, int max) {
        return min + (randomInt() % (max - min + 1));
    }

    // Generate random double [0,1)
    public static double randomDouble() {
        return nextSeed() / (double) Long.MAX_VALUE;
    }

    // Generate random float [0,1)
    public static float randomFloat() {
        return (float) randomDouble();
    }

    // Mixed-type generator
    public static Number randomMixed() {
        int choice = randomInt(1, 3);
        if (choice == 1)
            return randomInt();
        else if (choice == 2)
            return randomDouble();
        else
            return randomFloat();
    }
}
