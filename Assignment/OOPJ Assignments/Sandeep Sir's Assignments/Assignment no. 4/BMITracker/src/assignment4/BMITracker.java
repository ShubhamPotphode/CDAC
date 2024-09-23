package assignment4;


public class BMITracker {
 private double weight;
 private double height;

 
 public BMITracker(double weight, double height) {
     this.weight = weight;
     this.height = height;
 }

 
 public double getWeight() {
     return weight;
 }

 public void setWeight(double weight) {
     this.weight = weight;
 }

 public double getHeight() {
     return height;
 }

 public void setHeight(double height) {
     this.height = height;
 }

 
 public double calculateBMI() {
     return weight / (height * height);
 }


 public String classifyBMI() {
     double bmi = calculateBMI();
     if (bmi < 18.5) {
         return "Underweight";
     } else if (bmi >= 18.5 && bmi < 24.9) {
         return "Normal weight";
     } else if (bmi >= 25 && bmi < 29.9) {
         return "Overweight";
     } else {
         return "Obese";
     }
 }

 
 @Override
 public String toString() {
     return String.format("Weight: %.2f kg, Height: %.2f meters", weight, height);
 }
}

