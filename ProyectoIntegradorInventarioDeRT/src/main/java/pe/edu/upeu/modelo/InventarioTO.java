package pe.edu.upeu.modelo;


import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class InventarioTO {
    public String idRT;
    public String nombre;
    public String categoria;
    public String tipoC;
    public String ubicacion;

    public InventarioTO() {
    }

    public InventarioTO( String idRT,String nombre, String categoria, String tipoC, String ubicacion) {
        this.idRT = idRT;
        this.nombre = nombre;
        this.categoria = categoria;
        this.tipoC = tipoC;
        this.ubicacion = ubicacion;
    }

    public String getIdRT() {return idRT;}
    public void setIdRT(String idRT) {this.idRT = idRT;}

    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}

    public String getCategoria() {return categoria;}
    public void setCategoria(String Categoria) {this.categoria = Categoria;}

    public String getTipoC() {return tipoC;}
    public void setTipoC(String tipoC) {this.tipoC = tipoC;}

    public String getUbicacion() {return ubicacion;}
    public void setUbicacion(String ubicacion) {this.ubicacion = ubicacion;}
}
