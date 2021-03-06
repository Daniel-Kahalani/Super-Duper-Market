package engineLogic;

public class StoreProduct extends Product
{
    private int price;

    public StoreProduct(Product product, int price)
    {
        super(product);
        this.price = price;
    }

    protected StoreProduct(StoreProduct storeProduct)
    {
        super(storeProduct);
        this.price = storeProduct.price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) { this.price = price; }
}
