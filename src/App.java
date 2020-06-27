public class App
{
    String str1 = new String("Test1");
    String str2 = new String("Test2");
    int num = 5;

    public static void main( String[] args ) {
        App app1 = new App();
        App app2 = new App();
        System.out.println( app1.equals(app2) );
    }
}