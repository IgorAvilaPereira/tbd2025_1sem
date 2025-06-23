package persistencia;

import java.util.UUID;

import com.datastax.driver.core.PreparedStatement;
import com.datastax.driver.core.Session;

import negocio.Product;

public class ProductDAO {

    private Session session;

    public ProductDAO(Session session) {
        this.session = session;
    }

    public void inserir(Product product) {
        String query = "INSERT INTO product (id, description) " +
                       "VALUES (?, ?)";

        PreparedStatement ps = session.prepare(query);
        session.execute(ps.bind(product.getId(), product.getDescription()));
    }

   
}