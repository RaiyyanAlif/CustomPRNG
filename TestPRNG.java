package ict._22.ClassNames;

public class TestPRNG {

    public static void main(String[] args) {

        System.out.println("Random Integer: " + CustomPRNG.randomInt());
        System.out.println("Random Integer (1-100): " + CustomPRNG.randomInt(1, 100));
        System.out.println("Random Double: " + CustomPRNG.randomDouble());
        System.out.println("Random Float: " + CustomPRNG.randomFloat());
        System.out.println("Random Mixed: " + CustomPRNG.randomMixed());

        // Array example (hint-related)
        double[] myList = new double[10];
        for (int i = 0; i < myList.length; i++) {
            myList[i] = CustomPRNG.randomDouble();
            System.out.println("myList[" + i + "] = " + myList[i]);
        }
    }
}
