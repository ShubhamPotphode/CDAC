public class BMITracker {
    double weight, height, bmi;
    String classification;

    public void acceptRecord(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }

    public void calculateBMI() {
        bmi = weight / (height * height);
    }

    public void classifyBMI() {
        if (bmi < 18.5) {
            classification = "Underweight";
        } else if (bmi >= 18.5 && bmi < 24.9) {
            classification = "Normal weight";
        } else if (bmi >= 25 && bmi < 29.9) {
            classification = "Overweight";
        } else {
            classification = "Obese";
        }
    }

    public void printRecord() {
        System.out.printf("BMI: %.2f\nClassification: %s\n", bmi, classification);
    }
}