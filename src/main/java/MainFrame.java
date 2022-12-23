public class MainFrame {
    public static void main(String[] args) {
        DBRepository pgbase = new PostgresRepository();
        DBRepository proxy = new Proxy(pgbase);
        proxy.read();
    }
}
