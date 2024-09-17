class TollBoothRevenueManager {
    double carTollRate;
    double truckTollRate;
    double motorcycleTollRate;
    int carCount;
    int truckCount;
    int motorcycleCount;
    double totalRevenue;

    void setTollRates(double carRate, double truckRate, double motorcycleRate) {
        carTollRate = carRate;
        truckTollRate = truckRate;
        motorcycleTollRate = motorcycleRate;
    }

    void acceptRecord(int carCount, int truckCount, int motorcycleCount) {
        this.carCount = carCount;
        this.truckCount = truckCount;
        this.motorcycleCount = motorcycleCount;
    }

    void calculateRevenue() {
        totalRevenue = (carCount * carTollRate) + (truckCount * truckTollRate) + (motorcycleCount * motorcycleTollRate);
    }

    void printRecord() {
        int totalVehicles = carCount + truckCount + motorcycleCount;
        System.out.println("Total number of vehicles: " + totalVehicles);
        System.out.println("Total revenue collected: ₹" + totalRevenue);
    }
    
}