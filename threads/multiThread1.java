/* initially there are three diff ways to create thread class here we are using  extends Thread
 * the other two are runnable interface and thread class
 */
package threads;

public class multiThread1 {
    public static void main(String[] args) {
        A obj1=new A();
        B obj2=new B();
        obj1.start();
        obj2.start();
    }


}

class A extends Thread{
    public void show() {
        for(int i=1;i<5;i++) {
            System.out.println("hello");
            try {Thread.sleep(1000);} catch (InterruptedException e) {}
        }    
    }
    public void run() { // Added return type "void"
        show();
    }
}



class B extends Thread{
    public void show() {
        for(int i=1;i<5;i++) {
            System.out.println("hii");
            try {Thread.sleep(1000);} catch (InterruptedException e) {}
            }
        }
    
    
    public void run() { // Added return type "void"
        show();
    }
}
        


    
/* ro achieve multithread in java we use thread class
 * use a function named run() in the class individually
 * and call that function start in the main function
 * itr will be prinbted but not like as we want i.e., paraly so we need to use 
 * Thread sleep();
 * and still we will get a exception in the console so
 * we need to use thread class
 * 
 * after we achieve the multithread we will get the output at same time but not parally
 * because in every system there is a thing called sceduler 
 * that provides some facility to achieve the multithread
 * it provides some amount of timwe to each thread
 * and it will distribute the time to each thread
 * so it is not coming at same time meaning parally
 * so we use the thread sleep method and it stop a thread for some amount of time and at that stopped time 
 * the other thread will start and do its job 
 * and this cycle continues
 */
