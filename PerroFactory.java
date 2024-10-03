public class PerroFactory extends MascotaFactory {
    @Override
    public Mascota crearMascota() {
        return new Perro(); // retorna instancia de Perro
    }
}