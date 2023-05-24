package Rr;
import java.io.FileWriter;
import java.io.IOException;
//import java.util.Random;

//import java.io.PrintStream;

public class Thread1 implements Runnable {
	
	public void run() {
		String fName = "file" + Thread.currentThread() + ".txt";
		FileWriter w;

        try {
            w = new FileWriter(fName);
           
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        
        //w.close();

        //Random random=new Random();
        long start = System.currentTimeMillis();
        for (int i=1; i<=(1000000000/Main.thread);i++)
        {
            String s= "hi";
            try {
                w.write(s+'\n');

            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }
        try {
            w.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

       
        long end=System.currentTimeMillis();
        long totalTime=end-start;
        System.out.println("Time taken is :- " + totalTime +"millisecond");
        
	}
	public void printOutput() {
		for(int i=Main.thread;i>=1;i--){
            Thread t=new Thread(new Thread1());
            System.out.println(i+" thread running.");
            t.start();
            try {
                t.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
	}
}
	