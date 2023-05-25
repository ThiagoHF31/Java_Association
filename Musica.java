public class Musica {
    String titulo;
    Compositor compositor;

    public Musica(String nome, Compositor compositor){
        this.titulo = nome;
        this.compositor = compositor;
    }

    void MostraComp(){
        System.out.println(compositor.nome);
        System.out.println("\033[34mPaís de nascimento: \033[0m"+compositor.pais);
    }
}