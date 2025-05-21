class MyRunnable implements Runnable{
    // overriding the run method to define thread behaviour (bussiness logic)
    @Override
    public void run(){
        System.out.println("Thread " + Thread.currentThread().threadId() + " is runnin!");
        for(int i=0;i<5;i++){
            try{
                System.out.println(i + " " + Thread.currentThread().threadId());
                Thread.sleep(500);
            }catch(InterruptedException e){
                System.out.println("Thread " + Thread.currentThread().threadId() + " interupted.");
            }
        }
    }
}

public class UsingRunnableInterface{
    public static void main(String[] args){
        // Creating instance of runnable
        MyRunnable runnable = new MyRunnable();
        // The main thread will create two thread objects, injecting runnable object
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        
        // start() -> spawns separate threads
        thread1.start();
        thread2.start();
    }
}
