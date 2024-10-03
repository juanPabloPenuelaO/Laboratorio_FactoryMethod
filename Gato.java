public class Gato implements Mascota {
    @Override
    public void desplazarse() {
        System.out.println("El gato corre sigilosamente");
    }

    @Override
    public void comer() {
        System.out.println("El gato come croquetas felinas");
    }

    @Override
    public void dormir() {
        System.out.println("El gato duerme en una caja");
    }

    @Override
    public void emitirSonido() {
        System.out.println("el gato emite: miau");
    }
}