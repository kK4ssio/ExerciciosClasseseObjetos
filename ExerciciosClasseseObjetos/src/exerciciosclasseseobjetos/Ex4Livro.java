//exercicio 4: classe livro
package exerciciosclasseseobjetos;

/**
 *
 * @author Kassio Dias Monteiro
 */
public class Ex4Livro {
    private String titulo;
    private String autor;
    private int NumPag;
    private int NumExe;
    
    public Ex4Livro(String titulo, String autor, int NumPag, int NumExe){
        this.titulo = titulo;
        this.autor = autor;
        this.NumPag = NumPag;
        this.NumExe = NumExe;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumPag() {
        return NumPag;
    }

    public void setNumPag(int NumPag) {
        this.NumPag = NumPag;
    }

    public int getNumExe() {
        return NumExe;
    }

    public void setNumExe(int NumExe) {
        this.NumExe = NumExe;
    }
    
    public void DadosLivro(){
        System.out.println("TITULO: "+titulo+"  AUTOR: "+autor+"  NUMERO DE PAGINAS: "+NumPag+"  NUMERO DE EXEMPLARES: "+NumExe);
    }
}

