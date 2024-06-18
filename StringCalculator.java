public class StringCalculator {
public static int add(String numbers) {
     if (numbers == null || numbers.isEmpty()) {
            return 0;
        }

        String delimiter = ",|\n";
        if (numbers.startsWith("//")) {
            int delimiterEnd = numbers.indexOf("\n");
            delimiter = numbers.substring(2, delimiterEnd);
            numbers = numbers.substring(delimiterEnd + 1);
        }

        String[] nums = numbers.split(delimiter);
        int sum = 0;

        for (String num : nums) {
            sum += Integer.parseInt(num.trim());
        }

        return sum;
}

    public static void main(String[] args) {
        System.out.println(add("1,2,3"));
        System.out.println(add("1,2,3,4,5,6,7,8,9,10"));
        System.out.println(add("1\n2,3"));

    }
}
