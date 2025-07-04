package Basics_of_multithreading_1;

class Printer {
    public synchronized void printSyncMethod(String message) {
        for (int i = 1; i <= 3; i++) {
            System.out.println(message + " - Sync Method: " + i);
        }
    }

    public void printSyncBlock(String message) {
        synchronized (this) {
            for (int i = 1; i <= 3; i++) {
                System.out.println(message + " - Sync Block: " + i);
            }
        }
    }
}

class SyncThread1 extends Thread {
    Printer printer;

    SyncThread1(Printer printer) {
        this.printer = printer;
    }

    public void run() {
        printer.printSyncMethod("Thread 1");
    }
}

class SyncThread2 extends Thread {
    Printer printer;

    SyncThread2(Printer printer) {
        this.printer = printer;
    }

    public void run() {
        printer.printSyncBlock("Thread 2");
    }
}

public class Question2 {
    public static void main(String[] args) {
        Printer sharedPrinter = new Printer();

        SyncThread1 t1 = new SyncThread1(sharedPrinter);
        SyncThread2 t2 = new SyncThread2(sharedPrinter);

        t1.start();
        t2.start();
    }
}
