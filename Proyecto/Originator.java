package Proyecto; 

class Originator {
  private int vida;
  private int nivel;
  private int coordenadaX;
  private int coordenadaY;
  private int coordenadaZ;
  private String ultimoObjeto;

  public void setVida(int vida) {
    this.vida = vida;
  }

  public void setNivel(int nivel) {
    this.nivel = nivel;
  }

  public void setCoordenadas(int coordenadaX, int coordenadaY, int coordenadaZ) {
    this.coordenadaX = coordenadaX;
    this.coordenadaY = coordenadaY;
    this.coordenadaZ = coordenadaZ;
  }

  public void setUltimoObjeto(String ultimoObjeto) {
    this.ultimoObjeto = ultimoObjeto;
  }

  public int getVida() {
    return vida;
  }

  public int getNivel() {
    return nivel;
  }

  public int getCoordenadaX() {
    return coordenadaX;
  }

  public int getCoordenadaY() {
    return coordenadaY;
  }

  public int getCoordenadaZ() {
    return coordenadaZ;
  }

  public String getUltimoObjeto() {
    return ultimoObjeto;
  }

  public Memento saveStateToMemento() {
    return new Memento(vida, nivel, coordenadaX, coordenadaY, coordenadaZ, ultimoObjeto);
  }


  public void getStateFromMemento(Memento memento) {
    vida = memento.getVida();
    nivel = memento.getNivel();
    coordenadaX = memento.getCoordenadaX();
    coordenadaY = memento.getCoordenadaY();
    coordenadaZ = memento.getCoordenadaZ();
    ultimoObjeto = memento.getUltimoObjeto();
  }
}

