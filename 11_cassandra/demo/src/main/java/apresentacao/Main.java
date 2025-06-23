package apresentacao;

import java.util.UUID;

import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.Session;
import negocio.Product;
import persistencia.ProductDAO;

public class Main {
    public static void main(String[] args) {
        Cluster cluster = null;

        cluster = Cluster.builder().addContactPoint("127.0.0.1")
                .build();
        Session session = cluster.connect("inventory");

        ProductDAO productDAO = new ProductDAO(session);

        Product product = new Product();
        product.setId(UUID.randomUUID());
        product.setDescription("sdofksdoifkds");
        productDAO.inserir(product);
        System.out.println("Usuário salvo!");

    }

}