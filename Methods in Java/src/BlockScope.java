public class BlockScope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;        // variable declared outside the block can be updated inside the block but can't be reinitialized.

        {
            // int a = 6;   // It will not reinitialize
            a=15;
            System.out.println(a);

            int c = 30;    // variable initialized inside the block can't be updated outside the block, but it can be initialized.
        }
        // c = 10;   It can't be updated outside the block
        int c = 25;
        b=10; // variable like 'b' declared outside the block can be updated inside the block as well as outside the block.
        System.out.println(b);
    }
}
