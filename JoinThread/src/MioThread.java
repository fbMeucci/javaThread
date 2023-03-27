public class MioThread extends Thread {
    private int[] intArray;
    private int index;

    public MioThread(int[] intArray, int index) {
        this.intArray = intArray;
        this.index = index;
    }

    public void run() {
        try {
            intArray[index] = (int) Math.random() * 100 + 1;
            sleep(100);
        } catch (Exception e) {
        }
    }

}
