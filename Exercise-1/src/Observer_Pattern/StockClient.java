package Observer_Pattern;
public class StockClient implements StockObserver {
    private String clientName;

    public StockClient(String clientName) {
        this.clientName = clientName;
    }

    @Override
    public void update(Stock stock) {
        System.out.println("Notification to " + clientName + ": Stock " + stock.getPrice() + " changed to " + stock.getPrice());
    }

    public static void main(String[] args) {
        Stock google = new Stock("Google", 1200);
        StockClient client1 = new StockClient("Client 1");
        StockClient client2 = new StockClient("Client 2");

        google.addObserver(client1);
        google.addObserver(client2);

        google.setPrice(1300);
        google.setPrice(1250);
    }
}

