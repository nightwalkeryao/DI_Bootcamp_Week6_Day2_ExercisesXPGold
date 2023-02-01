public class RLVariables {
    private int mySecretNumber = 10;

    public void displaySecret() {
        this.mySecretNumber = 45;
        System.out.println("Local Variable: "+mySecretNumber);
    }

    public static void main(String[] args) {
        RLVariables secret = new RLVariables();
        System.out.println("Reference variable accessing instance variable: " + secret.mySecretNumber);
        secret.displaySecret();
        System.out.println("Reference variable accessing instance variable that points to the local variable: " +secret.mySecretNumber);
    }
}
