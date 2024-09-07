public class Cancion {
        
private String titulo;
private String artista;
private int duracion; 
private String genero;
private String album;

//constante estática "SEGUNDOS_POR_MINUTO":
public static final int SEGUNDOS_POR_MINUTO = 60;


// Constructor por defecto
public Cancion() {
    this.titulo = "Desconocido";
    this.artista = "Desconocido";
    this.duracion = 0;
    this.genero = "Desconocido";
    this.album = "Desconocido";
}
    
// Constructor con parametros. 
public Cancion(String titulo, String artista, int duracion, String genero) {
    this.titulo = titulo;
    this.artista = artista;
    this.duracion = duracion;
}

// Métodos getter y setter

public String getTitulo() {
    return titulo;
}

public void setTitulo(String titulo) {
    this.titulo = titulo;
}

public String getArtista() {
    return artista;
}

public void setArtista(String artista) {
    this.artista = artista;
}

public int getDuracion() {
    return duracion;
}

public void setDuracion(int duracion) {
    this.duracion = duracion;
}

public String getGenero() {
    return genero;
}

public void setGenero(String genero) {
    this.genero = genero;
}

// Método para calcular la duración en minutos

private int calcularDuracionMinutos() {
    return duracion / SEGUNDOS_POR_MINUTO;
}


// Método para mostrar la información
public void mostrarInformacion() {
    System.out.println("Título: " + titulo);
    System.out.println("Artista: " + artista);
    System.out.println("Duración: " + calcularDuracionMinutos() + " minutos");
    System.out.println("Género: " + genero);
    System.out.println("Álbum: " + album);
}

// Sobrecarga del método mostrarInformacion
public void mostrarInformacion(String usuario) {
    mostrarInformacion();
    System.out.println("Escuchado por: " + usuario);
}

}

