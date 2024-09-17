
public class TestToolBoothRevenueManager {
	
	public static void main(String[] args) {
        TollBoothRevenueManager tollBooth = new TollBoothRevenueManager();    
        tollBooth.setTollRates(50.00, 100.00, 30.00);
        tollBooth.acceptRecord(10, 5, 7);  
        tollBooth.calculateRevenue();
        tollBooth.printRecord();
    }

}
