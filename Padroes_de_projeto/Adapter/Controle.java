package Padroes_de_projeto.Adapter;

// Classe cliente
class Controle {
    void init(Projetor projetor) {
      projetor.liga();   // O cliente usa o método comum, sem saber a implementação real
    }
}
