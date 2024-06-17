public class StringCalculator {
    public static int add(String numbers) {
        if (numbers == null || numbers.isEmpty()) {
            return 0;
        }

        String[] nums = numbers.split(",");
        int sum = 0;

        for (String num : nums) {
            sum += Integer.parseInt(num.trim());
        }

        return sum;
    }

    public static void main(String[] args) {

        System.out.println("Hello world!");
        System.out.println(add("//;\n1;2"));

    }
}