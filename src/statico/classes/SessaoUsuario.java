package statico.classes;

public class SessaoUsuario {
    private static int usuariosLogados = 0;
    private String login;
    private String senha;

    public void login(String login, String senha) {
        if (login.equals(senha)) {
            System.out.println("sua senha deve ser diferente do login,digite novamente.");
            return;
        }
        this.login = login;
        this.senha = senha;
        usuariosLogados++;
        System.out.println("login realizado com sucesso.");
    }

    public void logout() {
        usuariosLogados--;
        System.out.println("logout realizado com sucesso.");
    }

    public String getLogin() {
        return login;
    }

    public String getSenha() {
        return senha;
    }

    public static int getUsuariosLogados() {
        return usuariosLogados;
    }
}
