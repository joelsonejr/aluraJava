public class SistemaInterno {

    private int senha = 2222;

    public void autentica(Autenticavel fa){
        boolean autenticou = fa.autentica(this.senha);
        if(autenticou){
            System.out.println(fa + " Pode entrar no sitema");
        } else {
            System.out.println(fa + " Nao pode entrar no sistema");
        }
    }
}
