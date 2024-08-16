package utils;

public enum  Credenciais {

    ADMIN("admin", "admin");

    private final String login;
    private final String senha;

    Credenciais(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }

    public String getLogin() {
        return login;
    }

    public String getSenha() {
        return senha;
    }

}
