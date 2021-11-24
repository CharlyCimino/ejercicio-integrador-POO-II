package fabricadeinstrumentos;

/**
 *
 * @author Charly Cimino Aprendé más Java en mi canal:
 * https://www.youtube.com/c/CharlyCimino Encontrá más código en mi repo de
 * GitHub: https://github.com/CharlyCimino
 */
public class Principal {

    public static void main(String[] args) {

        Fabrica f = new Fabrica();
        cargarFabrica(f);

        // PRUEBA PUNTO A)
        // f.listarInstrumentos();
        // PRUEBA PUNTO B)
        /*
        ArrayList<Instrumento> lista = f.instrumentosPorTipo(TipoInstrumento.PERCUSION);
        for (Instrumento instrumento : lista) {
            System.out.println(instrumento);
        }
         */
        // PRUEBA PUNTO C)
        /*
        Instrumento borrado = f.borrarInstrumento("ZZZ111");
        System.out.println("Se borró: " + borrado);
        f.listarInstrumentos();
         */
        // PRUEBA PUNTO D)
        /*
        double[] porcs = f.porcInstrumentosPorTipo("Sasdasd");

        for (int i = 0; i < porcs.length; i++) {
            System.out.println(porcs[i]);
        }
         */
    }

    private static void cargarFabrica(Fabrica f) {
        Sucursal s1 = new Sucursal("Sucursal A");
        Sucursal s2 = new Sucursal("Sucursal B");

        s1.agregarInstrumento(new Instrumento("ABC123", 13214, TipoInstrumento.CUERDA));
        s1.agregarInstrumento(new Instrumento("BCD456", 13432, TipoInstrumento.VIENTO));
        s1.agregarInstrumento(new Instrumento("DEF567", 15464, TipoInstrumento.PERCUSION));

        s2.agregarInstrumento(new Instrumento("ASD353", 52432, TipoInstrumento.CUERDA));
        s2.agregarInstrumento(new Instrumento("VXCBE2", 45645, TipoInstrumento.VIENTO));

        f.agregarSucursal(s1);
        f.agregarSucursal(s2);
    }

}
