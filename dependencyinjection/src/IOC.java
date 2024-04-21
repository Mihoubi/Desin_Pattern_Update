public class IOC {
public static void main (String[] args){
IOC container = new IOC();
User user = container.new User(container.new MysqlDatabase());
user.add(" here !!! ");

}

public class User {

    Database database;
    public User (Database database){
        this.database =database;
    }
    public void add (String data){
        database.persist(data);
    }

}
public interface Database{

    void persist (String data);
}

public class MysqlDatabase implements Database{


    @Override
    public void persist(String data) {
        System.out.println("Mysql has persist data" + data);
    }
}

public class OraclDatabase implements Database{


    @Override
    public void persist(String data) {
        System.out.println("Oracle has persist data" + data);
    }
}
}
