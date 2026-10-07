public class Var1 {

    private int instanceVar = 10;
    static int staticVar = 100;

    public Var1(int instanceVar) {
        this.instanceVar = instanceVar;
    }

    public void showScopes(int paramVar) {
        int localVar = 20;
        double dynVar = Math.sqrt(paramVar);

        System.out.println("Instance variable: " + instanceVar);
        System.out.println("Static variable: " + staticVar);
        System.out.println("Method parameter: " + paramVar);
        System.out.println("Dynamically initialized: " + dynVar);
        System.out.println("Local variable: " + localVar);

        if (localVar > 10) {
            int blockVar = 5;
            System.out.println("Block variable: " + blockVar);
        }
    }

    public static void main(String args[]) {
        Var1 obj = new Var1(50);
        obj.showScopes(30);
    }
}