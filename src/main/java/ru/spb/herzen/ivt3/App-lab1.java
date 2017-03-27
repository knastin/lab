package ru.spb.herzen.ivt3;

import org.kohsuke.randname.RandomNameGenerator;

public class App
{
    public static void main( String[] args )
    {
        System.out.println();
       Thread myThready = new Thread();
        myThready.start();
         try {
            myThready.join();
             } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println();
    Thread firstThread = new FirstThread();
      secondThread.start();  
    }
}
