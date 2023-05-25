public class Compositor {
    String nome;
    String pais;
    Musica[] musicas;

    public Compositor(String nome,String pais){
        this.nome = nome;
        this.pais = pais;
    }

    public void definirMusicas(String[] nome ){
        musicas = new Musica[nome.length];

        for (int i = 0; i < nome.length; i++) {
            musicas[i] = new Musica(nome[i], this);
        }
    }
    
    void listarMusicas(){
        for (int i = 0; i < musicas.length; i++) {
            System.out.println((i+1)+"º "+musicas[i].titulo);
        }
    }
}
