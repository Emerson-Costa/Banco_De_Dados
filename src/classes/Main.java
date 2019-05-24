
package classes;

/**
 *
 * @author Emerson_Costa
 */
public class Main {

    public static void main(String[] args) {
        JdbcConnection c = new JdbcConnection("PostgreSql","localhost","5433","Pessoa","postgres","123456");
        c.conect();
         
        System.out.println(c.query("SELECT *FROM PESSOA"));
        c.disconect();
    }
    
}
