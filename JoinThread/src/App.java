public class App {
    public static void main(String[] args) throws Exception {
        int intArray[] = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        MioThread thrArray[] = new MioThread[10];
        for (int i = 0; i < 10; i++) {
            thrArray[i] = new MioThread(intArray, i);
            thrArray[i].start();
        }
        // ASPETTO CHE TUTTI I THREAD ABBIANO TERMINATO
        for (int i = 0; i < 10; i++) {
            thrArray[i].join();
        }

        for (int i = 0; i < 10; i++) {
            System.out.print(intArray[i] + " ");
        }
        System.out.println();
    }
}