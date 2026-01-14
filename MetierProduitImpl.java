import java.io.*;
import java.util.*;

interface IProduitMetier {
    void add(Product p);
    List<Product> getAll();
    Product findById(long id);
    void delete(long id);
    void saveAll();
}

class MetierProduitImpl implements IProduitMetier {
    private List<Product> products = new ArrayList<>();
    private final String fileName = "products.dat";

    @Override
    public void add(Product p) { products.add(p); }

    @Override
    public List<Product> getAll() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            products = (List<Product>) ois.readObject();
        } catch (Exception e) {
            System.out.println("No existing data found.");
        }
        return products;
    }

    @Override
    public Product findById(long id) {
        return products.stream().filter(p -> p.getId() == id).findFirst().orElse(null);
    }

    @Override
    public void delete(long id) {
        products.removeIf(p -> p.getId() == id);
    }

    @Override
    public void saveAll() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(products);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
