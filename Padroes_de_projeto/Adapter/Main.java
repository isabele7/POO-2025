package Padroes_de_projeto.Adapter;

public class Main {
    public static void main(String[] args) {
       Projetor samsung = new AdaptadorProjetorSamsung();
       Projetor lg = new AdaptadorProjetorLG();
       
       Controle c = new Controle();
       c.init(samsung);
       c.init(lg);
    }
}