public class GatoFactory extends MascotaFactory {
    @Override
    public Mascota crearMascota() {
        return new Gato(); //retorna instancia de Gato
    }
}