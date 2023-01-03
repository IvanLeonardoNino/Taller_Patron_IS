package Proyecto;

class Memento {
  private final int vida;
  private final int nivel;
  private final int coordenadaX;
  private final int coordenadaY;
  private final int coordenadaZ;
  private final String ultimoObjeto;

  public Memento(int vida, int nivel, int coordenadaX, int coordenadaY, int coordenadaZ, String ultimoObjeto) {
    this.vida = vida;
    this.nivel = nivel;
    this.coordenadaX = coordenadaX;
    this.coordenadaY = coordenadaY;
    this.coordenadaZ = coordenadaZ;
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
}
