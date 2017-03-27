package spb.herzen;
public class SecondThreed extends Thread {
   public void run(){
Thread myThready = new Thread();
        myThready.start();
      for(int i = 0; i < 5; i++)
		{
         try {
            myThready.sleep(1000);
             } catch (InterruptedException e) {
            e.printStackTrace();
         break;
         }
      }
   }
}
         
