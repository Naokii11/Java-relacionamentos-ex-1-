import java.util.ArrayList;

public class Edicao {
    private int numeroEdicao;
    private int volume;
    private ArrayList<Artigo> artigos = new ArrayList<Artigo>();

    public Edicao(int numeroEdicao,int volume,String titulo1, int pagInit1, String titulo2, int pagInit2){
            this.numeroEdicao = numeroEdicao;
            this.volume = volume;
            Artigo artigo1 = new Artigo(titulo1,pagInit1);
            Artigo artigo2 = new Artigo(titulo2,pagInit2);
            artigos.add(artigo1);
            artigos.add(artigo2);
    }
}
