public abstract class Ejercicio {
    protected String nombre;
    protected String descripcion;

    public Ejercicio(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public String getNombre() { return nombre; }
    public String getDescripcion() { return descripcion; }

    public abstract void ejecutar();
}