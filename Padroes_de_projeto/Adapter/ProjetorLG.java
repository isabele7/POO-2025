package Padroes_de_projeto.Adapter;

// Adaptee com sua própria interface (enable)
class ProjetorLG {
    public void enable(int timer) {
      System.out.println("Ligando projetor da LG em " + timer + " minutos");
    }
}