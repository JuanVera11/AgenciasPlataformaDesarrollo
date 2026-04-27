public class ClienteVIP extends Cliente {
    private double descuento;
    private String categoria;

    public ClienteVIP(String nombre, String apellido, String telefono, String cedula, String correo, String direccion, double descuento, String categoria) {
        super(nombre, apellido, telefono, cedula, correo, direccion);
        this.descuento = descuento;
        this.categoria = categoria;
    }

    public double getDescuento() { return descuento; }
    public String getCategoria() { return categoria; }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Categoría VIP: " + categoria);
        System.out.println("Descuento: " + descuento + "%");
    }
}