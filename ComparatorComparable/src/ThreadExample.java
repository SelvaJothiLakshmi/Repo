
public class ThreadExample extends Thread{

	
	public static int j=0;
	
	@Override
	public void run(){
		synchronized (Thread.class) {
		Thread th=Thread.currentThread();
	   
		for(int i=0;i<3;i++){
			j++;
			 System.out.println(j +" Thread   "+th.getName()); 
		}
		
		}
	}
	
	
	public static void main(String[] args) {
		
		
		ThreadExample t1=new ThreadExample();
		
		t1.setName("abc");
		t1.start();
		ThreadExample t2=new ThreadExample();
		
		t2.setName("def");
		t2.start();
		
	
		
	}

}
