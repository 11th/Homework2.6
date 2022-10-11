public class Main {
    public static void main(String[] args) {
        try {
            if (Data.check("123", "_", "_")) {
                System.out.println("Данные корректны");
            }
        } catch (WrongLoginException | WrongPasswordException e){
            System.out.println(e.getMessage());
        }
    }
}