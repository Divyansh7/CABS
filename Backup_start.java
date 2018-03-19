package backup;
 
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Backup_start{
    private static class Threads1 implements Runnable {
        Threads1() {
        }
        public void Output1() {
             
            do{
                Server ob=new Server();
            }while(true);
        }     
        @Override
        public void run() {
            Output1();
        }
    }    
    private static class Threads2 implements Runnable {
        Threads2() {
        }
        public void Output2() throws ClassNotFoundException, SQLException, InterruptedException {
            do{
                 main_backup obj=new main_backup();
                 Thread.sleep(30000);
            }while(true);
        }     
        @Override
        public void run() {
            try {
                Output2();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Backup_start.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(Backup_start.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InterruptedException ex) {
                Logger.getLogger(Backup_start.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    } 
    public static void main(String[] args)
   // void back()
    {
        Thread ob1 = new Thread(new Threads1());
        Thread ob2 = new Thread(new Threads2());
        ob1.start();
        ob2.start();     
        System.out.println("Thread " + ob1.getName() + " is alive: " + ob1.isAlive());
        System.out.println("Thread " + ob2.getName() + " is alive: " + ob2.isAlive());
        try {
            System.out.println("Waiting for Threads to finish");
            ob1.join();
            ob2.join();
        } catch (InterruptedException e) {
        }         
        System.out.println("Thread " + ob1.getName() + " is alive: " + ob1.isAlive());
        System.out.println("Thread " + ob2.getName() + " is alive: " + ob2.isAlive());
        System.out.println("Main Thread Exiting");
    }
}