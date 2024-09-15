package prg.p1;

class InstanceCounter {

    private static int instanceCount = 0;

    public InstanceCounter() {
        instanceCount++;
    }

    public static int getInstanceCount() {
        return instanceCount;
    }
}

public class Main {
    public static void main(String[] args) {

        @SuppressWarnings("unused")
		InstanceCounter obj1 = new InstanceCounter();
        @SuppressWarnings("unused")
		InstanceCounter obj2 = new InstanceCounter();
        @SuppressWarnings("unused")
		InstanceCounter obj3 = new InstanceCounter();


        System.out.println("Number of instances created: " + InstanceCounter.getInstanceCount());
    }
}
