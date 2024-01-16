// Final class with final variable and method
final class Final {
    // Final variable
    final int x = 1;

    // Final method accessible only by classes within the same package
    final void finalMethod() {
        // Method implementation
    }
    public static void main(String[] args){
     Final a = new Final();
     System.out.println(a.x);
    }
}
