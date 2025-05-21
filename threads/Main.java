class MyThread extends Thread{
    // overriding the run method to define thread behaviour
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

// There will be a main thread that will be running main program by dafault
// Main thread will make object thread1 and object thread2;
// Will then make a new thread(first thread will be spawned and then run method will be called)
// It calls start() on both, which spawns two separate threads.
// while thread1 is being perfomed main thread is still going down will start another thread
// now both thread will run is parallel

public class Main{
    public static void main(String[] args){
        // The main thread will create two thread objects
        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();
        
        // start() -> 
        thread1.start();
        thread2.start();
    }
}