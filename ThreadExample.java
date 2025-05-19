public class ThreadExample extends Thread {
  @Override
    public void run(){
 for (int i=0;i<100;i++){
    System.out.println(i);
 }

   }
   public static void main(String[] args) {
    ThreadExample t1=new ThreadExample();
    t1.start();
    ThreadExample t2=new ThreadExample();
    t2.start();
}

}
