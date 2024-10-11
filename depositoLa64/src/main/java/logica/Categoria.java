
package logica;


public class Categoria {
    
    int id_categoria;
    String nombreCategoria;
    String descripcion;
    String productos;

    public Categoria() {
    }

    public Categoria(int id_categoria, String nombreCategoria, String descripcion, String productos) {
        this.id_categoria = id_categoria;
        this.nombreCategoria = nombreCategoria;
        this.descripcion = descripcion;
        this.productos = productos;
    }

    public int getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(int id_categoria) {
        this.id_categoria = id_categoria;
    }

    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getProductos() {
        return productos;
    }

    public void setProductos(String productos) {
        this.productos = productos;
    }
    
    
    
}
