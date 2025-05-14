package Padroes_de_projeto.Adapter;

// Adapter que herda de ProjetorSamsung e implementa o método liga() para Samsung
class AdaptadorProjetorSamsung extends ProjetorSamsung implements Projetor {
    public void liga() {
      this.turnOn(); 
    }
}