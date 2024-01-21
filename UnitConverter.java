import java.util.Scanner;

public class UnitConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        
        while (true) {
            System.out.println("Select the conversion type:");
            System.out.println("1. Kilogram to Pound");
            System.out.println("2. Gram to Ounce");
            System.out.println("3. Kilometer to Mile");
            System.out.println("4. Millimeter to Inch");
            System.out.println("Type 'exit' to end the program.");
            input = scanner.nextLine();
            
            if (input.equals("exit")) {
                System.out.println("Exiting the program...");
                break;
            }
            
            int choice = Integer.parseInt(input);
            
            switch (choice) {
                case 1:
                    System.out.println("Enter the weight in kilograms:");
                    double kg = scanner.nextDouble();
                    double lb = kg * 2.20462;
                    System.out.println(kg + " kilograms is equal to " + lb + " pounds.");
                    break;
                case 2:
                    System.out.println("Enter the weight in grams:");
                    double gram = scanner.nextDouble();
                    double ounce = gram * 0.035274;
                    System.out.println(gram + " grams is equal to " + ounce + " ounces.");
                    break;
                case 3:
                    System.out.println("Enter the distance in kilometers:");
                    double km = scanner.nextDouble();
                    double mile = km * 0.621371;
                    System.out.println(km + " kilometers is equal to " + mile + " miles.");
                    break;
                case 4:
                    System.out.println("Enter the length in millimeters:");
                    double mm = scanner.nextDouble();
                    double inch = mm * 0.0393701;
                    System.out.println(mm + " millimeters is equal to " + inch + " inches.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        
        scanner.close();
    }
}