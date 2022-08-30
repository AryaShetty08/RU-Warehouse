package warehouse;

/*
 * Use this class to test to addProduct method.
 */
public class AddProduct {
    public static void main(String[] args) {
        //StdIn.setFile("addtoend.in");
        //StdOut.setFile("addtoend.out");

        //StdIn.setFile("fixheap.in");
        //StdOut.setFile("fixheap.out");

        StdIn.setFile("addproduct.in");
        StdOut.setFile("addproduct.out");

	// Use this file to test addProduct
    int size = StdIn.readInt();
    Warehouse w = new Warehouse();
    for(int i = 0; i < size; i++) {
        int day = StdIn.readInt();
        int id = StdIn.readInt();
        String name = StdIn.readString();
        int stock = StdIn.readInt();
        int demand = StdIn.readInt();
        w.addProduct(id, name, stock, day, demand);
    }
    System.out.print(w);
    }
}
