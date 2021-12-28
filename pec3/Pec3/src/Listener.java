public class Listener extends gen.pseint_grammarBaseListener {
    Bloque bloquePrincipal = new Bloque();
    Bloque actual = bloquePrincipal;

    @Override
    public void enterBloquesi(pseint_grammar.BloquesiContext ctx) {
        super.enterBloquesi(ctx);
        Bloque nuevo = new Bloque();
        actual.anadirHijo(nuevo);
        actual = nuevo;
    }
}
