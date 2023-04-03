public class Figurine {
    public static void main(String[] args) throws Exception {
        int numCollezionisti = 3;
        int numFigurine = 20;
        Collezionista[] coll = new Collezionista[numCollezionisti];
        Monitor m = new Monitor(numFigurine);
        System.out.println(m.toString());
        for (int i = 0; i < numCollezionisti; i++) {
            coll[i] = new Collezionista("Collez" + i, numFigurine, m);
            coll[i].start();
        }
    }
}
