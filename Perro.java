public class Perro implements Mascota {
    @Override
    public void desplazarse() {
        System.out.println("El perro corre ruidoso");
    }

    @Override
    public void comer() {
        System.out.println("El perro come croquetas de caninos");
    }

    @Override
    public void dormir() {
        System.out.println("El perro duerme en el suelo");
    }

    @Override
    public void emitirSonido() {
        System.out.println("el perro emite: Guau");
    }
}