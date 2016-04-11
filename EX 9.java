1:



package JavaApplication1;

class WELCOME extends Thread
{  
 
 public void run(){  
    for(int i=1;i<5;i++)
        {  
        try
        {Thread.sleep(3000);
        }catch(InterruptedException e){System.out.println(e);}  
        System.out.println("WELCOME ");  
        }  
                   }
}

class HELLO extends Thread
{  
 
 public void run(){  
    for(int i=1;i<5;i++)
        {  
        try
        {Thread.sleep(2000);
        }catch(InterruptedException e){System.out.println(e);}  
        System.out.println("Hello");  
        }  
                   }
}
class GOODMORNING extends Thread
{  
 
 public void run(){  
    for(int i=1;i<5;i++)
        {  
        try
        {Thread.sleep(1000);
        }catch(InterruptedException e){System.out.println(e);}  
        System.out.println("Good Morning");  
        }  
                   }
}

public class JavaApplication1
{


 
public static void main(String args[]){  
  GOODMORNING t1=new GOODMORNING();
  HELLO t2 = new HELLO();
  WELCOME t3 = new WELCOME();
  
   
  t1.start();  
  t2.start();
  t3.start();
 }  
}






2:


class Q { 
int n; 
boolean valueSet = false; 
synchronized int get() { 
if(!valueSet) 
try { 
wait(); 
} catch(InterruptedException e) { 
System.out.println("InterruptedException caught"); 
} 
System.out.println("Got: " + n); 
valueSet = false; 
notify(); 
return n; 
} 
synchronized void put(int n) { 
if(valueSet) 
try { 
wait(); 
} catch(InterruptedException e) { 
System.out.println("InterruptedException caught"); 
} 
this.n = n; 
valueSet = true; 
System.out.println("Put: " + n); 
notify(); 
} 
}

class Producer implements Runnable { 
Q q; 
Producer(Q q) { 
this.q = q; 
new Thread(this, "Producer").start(); 
} 
public void run() { 
int i = 0; 
while(true) { 
q.put(i++); 
} 
} 
}

class Consumer implements Runnable { 
Q q; 
Consumer(Q q) { 
this.q = q; 
new Thread(this, "Consumer").start(); 
} 
public void run() { 
while(true) { 
q.get(); 
} 
} 
}

class PCFixed { 
public static void main(String args[]) { 
Q q = new Q(); 
new Producer(q); 
new Consumer(q); 
System.out.println("Press Control-C to stop."); 
} 
}





