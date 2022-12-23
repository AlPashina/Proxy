public class Proxy implements DBRepository{
    private DBRepository dbr;
    public Proxy(DBRepository repository) {
        this.dbr = repository;
    }
    @Override
    public void read() {
        dbr.beginTransaction();
        dbr.read();
        dbr.endTransaction();
    }

    @Override
    public void beginTransaction() {
        dbr.beginTransaction();
    }

    @Override
    public void endTransaction() {
        dbr.endTransaction();
    }
}
