package Padroes_de_projeto.Adapter;

// Adapter que herda de ProjetorLG e implementa o método liga() para LG
class AdaptadorProjetorLG extends ProjetorLG implements Projetor {
    public void liga() {
      this.enable(0);  
    }
}