public class Hello {
    public static void main (String[] args) {
        String[] array = {"aa", "bb", "cc", "ab", "bc", "ac"};
        String expectedValue = "ab";
        for (int i = 0; i < array.length; i++) {
            if (expectedValue.equals(array[i])) {
                System.out.println("expected index is : " + i);
            }
        }
        }
        }

