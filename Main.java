public class Main {
    public static void main(String[] args) {
        //fábrica para Perro
        MascotaFactory perroFactory = new PerroFactory();
        Mascota perro = perroFactory.crearMascota();
        perro.desplazarse();
        perro.comer();
        perro.dormir();
        perro.emitirSonido();

        //fábrica para Gato
        MascotaFactory gatoFactory = new GatoFactory();
        Mascota gato = gatoFactory.crearMascota();
        gato.desplazarse();
        gato.comer();
        gato.dormir();
        gato.emitirSonido();
    }
}

public static void main(String[] args) {
    
}