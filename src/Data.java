public class Data {
    public static boolean check(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException{
        if (!wordCheck(login)){
            throw new WrongLoginException("Некорректный логин");
        } else if (!wordCheck(password)){
            throw new WrongPasswordException("Некорректный пароль");
        } else if (!password.equals(confirmPassword)){
            throw new WrongPasswordException("Пароли не совпадают");
        }
        return true;
    }

    private static boolean wordCheck(String word) {
        if (word.isBlank() || word.length() < 1 || word.length() > 20){
            return false;
        } else if (!word.matches("^[a-zA-Z0-9_]*$")){
            return false;
        }
        return true;
    }
}
