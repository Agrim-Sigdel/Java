public class User extends Thread{
    private String userName;
    private Printer printer;
    
    public User(String userName, Printer printer) {
        this.userName = userName;
        this.printer = printer;
    }
    
    @Override
    public void run() {
        synchronized(printer){ . //block synchronized on printer object
        
            printer.printDocument(userName);
        
    }
    }
    
    public static void main(String[] args) {
        Printer printer = new Printer();
        
        User user1 = new User("User1", printer);
        User user2 = new User("User2", printer);
        User user3 = new User("User3", printer);
        
        user1.start();
        user2.start();
        user3.start();
}
    
}