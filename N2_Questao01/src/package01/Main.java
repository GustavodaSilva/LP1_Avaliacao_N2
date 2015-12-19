
package package01;

public class Main {

    public static void main(String[] args) {
        Tela01 t = new Tela01();
        t.setTitle("Conversor");
        //Define titulo da tela
        t.setSize(500,500);
        //Define o tamanho da tela
        t.setVisible(true);
        //Torna a janela visível
        t.setResizable(true);
        //Habilita o maximizar
        t.setLocationRelativeTo (null);
    }
    
}
