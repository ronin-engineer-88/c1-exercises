package _11_OOP_Principles;

public class StringExample {

    @Override
    public String toString() {
        return "I am a string example";
    }

    public static void main(String[] args) {

        // Using String literal
        String str1 = "Hello";
        System.out.println(str1);

        // Using new keyword
        String str2 = new String("World");
        System.out.println(str2);

        // Concatenating two String
        String str3 = str1 + str2;
        System.out.println(str3);

        // Return length of String
        System.out.println(str3.length());

        // Return character at given index
        System.out.println(str3.charAt(0));

        // Concatenates two String and return it
        System.out.println(str1.concat(str2));

        // Return substring from the given range index
        System.out.println(str3.substring(0,5));

        // Compare two String
        System.out.println(str1.equals(str2));

        // toString example
        StringExample example = new StringExample();
        System.out.println(example);
    }
}
