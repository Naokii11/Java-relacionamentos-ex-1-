import java.util.ArrayList;

public class Revista {
    private String titulo;
    private long codigo;
    private ArrayList<Edicao> edicaos = new ArrayList<Edicao>();

    public Revista(String titulo, long codigo, int numeroEdicao,int volumeEdicao, String tituloArg1, String tituloArg2,int pagIni1,int pagIni2){
        this.titulo = titulo;
        this.codigo = codigo;
        Edicao edicao1 = new Edicao(numeroEdicao,volumeEdicao,tituloArg1,pagIni1,tituloArg2,pagIni2);
        edicaos.add(edicao1);
    }
}
