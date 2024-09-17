class DiscountCalculator {
    double originalPrice;
    double discountRate;
    double discountAmount;
    double finalPrice;

    void acceptRecord(double price, double discount) {
        originalPrice = price;
        discountRate = discount;
    }

    void calculateDiscount() {
        discountAmount = originalPrice * (discountRate / 100);
        finalPrice = originalPrice - discountAmount;
    }

    void printRecord() {
        System.out.println("Original Price: ₹" + originalPrice);
        System.out.println("Discount Amount: ₹" + discountAmount);
        System.out.println("Final Price: ₹" + finalPrice);
    }

    
}