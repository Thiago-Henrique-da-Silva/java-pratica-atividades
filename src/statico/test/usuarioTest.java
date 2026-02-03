package statico.test;

import statico.classes.SessaoUsuario;

public class usuarioTest {
    public static void main(String[] args) {
        SessaoUsuario sessao01 = new SessaoUsuario();
        //realizando login
        sessao01.login("Thiago3108", "thiago2004");
        //conferingo logins
        System.out.println("usuarios logados: " + SessaoUsuario.getUsuariosLogados());
        // fazendo logout do usuario
        sessao01.logout();
        System.out.println("usuarios logados: " + SessaoUsuario.getUsuariosLogados());
        System.out.println("------------------------------");

        SessaoUsuario sessao02 = new SessaoUsuario();
        //erro no login
        sessao02.login("thiago2004", "thiago2004");
    }
}
