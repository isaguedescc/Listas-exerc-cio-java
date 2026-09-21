package poo.paralelepipedo;

public class Paralelepipedo {
    private float altura;
    private float comprimento;
    private float largura;

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public void setComprimento(float comprimento) {
        this.comprimento = comprimento;
    }

    public void setLargura(float largura) {
        this.largura = largura;
    }
    
    public float getAltura() {
        return altura;
    }
    public float getComprimento() {
        return comprimento;
    }
    public float getLargura() {
        return largura;
    }

    public float getArea(){
        float area =(2 * (altura * largura + altura *
        comprimento + largura * comprimento));
        return area;
    }

      public float getVolume(){
        float volume =(altura * comprimento *largura);
        return volume;
    }
      @Override
      public String toString() {
        return "Paralelepipedo [altura=" + altura + ", comprimento=" + comprimento + ", largura=" + largura
                + ", Area=" + getArea() + ", Volume=" + getVolume() + "]";
      }
    
    
    
}
