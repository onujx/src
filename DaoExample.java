interface DataAccessObject {
 public void select();
 public void insert();
 public void update();
 public void delete();
}
public class DaoExample {
    public static void dbWork(DataAccessObject dao) {
        dao.select();
        dao.insert();
        dao.update();
        dao.delete();
    }

    public static void main(String[] args) {
        dbWork(new OracleDao());
        dbWork(new MySqlDao());
    }
}

class OracleDao implements DataAccessObject {
    public void select() {
        System.out.println("Oracle DB에서 검색");
    }
    public void insert() {
        System.out.println("Oracle DB에서 검색");
    }
    public void update() {
        System.out.println("Oracle DB에서 검색");
    }
    public void delete() {
        System.out.println("Oracle DB에서 검색");
    }
}
class MySqlDao implements DataAccessObject {
    public void select() {
        System.out.println("MySql DB에서 검색");
    }
    public void insert() {
        System.out.println("MySql DB에서 검색");
    }
    public void update() {
        System.out.println("MySql DB에서 검색");
    }
    public void delete() {
        System.out.println("MySql DB에서 검색");
    }
}