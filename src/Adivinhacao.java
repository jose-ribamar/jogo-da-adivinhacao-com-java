import javax.swing.*;
// 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
import java.awt.Font;
import java.awt.event.ActionEvent;

import java.awt.Color;
import javax.swing.JFrame;
import java.util.Random;
// import java.util.Scanner;

public class Adivinhacao extends JFrame{
  int  palpite, cont,num3, acert;
  JTextField n1;
  JTextField n2;
  JLabel placar = new JLabel("Placar");
  JLabel placar2 = new JLabel("Digite um valores entre 0 & 50");
  JLabel placa = new JLabel("Nível de dificuldade aleaório");
    // placar do jogo
    JLabel px = new JLabel("Erro = 0");
    JLabel ro = new JLabel("Rodada = 1");
    JLabel po = new JLabel("Acerto = 0");
    JButton novo = new JButton("Novo jogo");
    JButton zerar = new JButton("Zerar placar");
    // botões de dificuldade
    JLabel placar3 = new JLabel("Nível de dificuldade");
    JButton facil = new JButton("Fácil");
    JButton medio = new JButton("Médio");
    JButton dificil = new JButton("Difícil");
    
    JLabel ini = new JLabel("Inicia jogo");
    int PX =0; 
    int soma  = 0;
    int num1 = 34;
    int PO , RO, j1= 0;
    int faci = 5;
    int med = 10;
    int def = 15;
    Random random = new Random();
    // Scanner digite = new Scanner(System.in);

    public Adivinhacao(){
      
      
        setSize(700, 500);
        setTitle("Jogo da adivinhação");
       
        setResizable(false);
        // this.getContentPane().setBackground(new Color(200, 30, 50));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // JPanel painel = new JPanel(null);
        setLayout(null);
        // botao principal
        JButton b1 = new JButton("Enviar");
        b1.setBounds(100, 200, 250,70);
        b1.setFont(new Font("Arial", Font.BOLD, 40 ));
        b1.setForeground(new Color(200, 10, 10));
        b1.setBackground(Color.BLACK);
        // placar do jogo
        placar.setBounds(450,50,100,30);
        placar2.setBounds(100, 50, 200, 50);
        placa.setBounds(100, 25, 200, 50);
        px.setBounds(375,70,100,30);
        ro.setForeground(Color.orange);
        ro.setBounds(525,70,100,30);
        px.setForeground(Color.RED);
        po.setBounds(450,70,100,30);
        po.setForeground(Color.BLUE);
        // botoes
        novo.setBounds(425,100,140,30);
        zerar.setBounds(425,125,140,30);
        ini.setBounds(425,150,140,30);
        ini.setForeground(Color.RED);
        
        placar2.setForeground(Color.BLUE);

        // botoes de dificuldade
        placar3.setBounds(435,200,140,30);
        facil.setBounds(425,225,140,30);
        medio.setBounds(425,250,140,30);
        dificil.setBounds(425,275,140,30);


        // painel.add(b1);
        // adiciona coisas na nossa janela
        add(placar);
        add(placar2);
        add(placar3);
        add(placa);
        add(px);
        add(facil);
        add(dificil);
        add(medio);
        add(po);
        add(ro);
        add(novo);
        add(zerar);// posição do placar
        add(ini);
        add(b1);
        // adiciona uma janelinha de texto
        // n1
        n2 = new JTextField();
        n2.setBounds(100, 100, 200, 50);
        n2.setFont(new Font("Arial", Font.ITALIC, 40));
        n2.setText("");
        add(n2);

        setVisible(true);
        // chama a funcao do button
        b1.addActionListener(new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
              digite();
              randiw();
              atualizar();
              compara1();
              
              // Integer num2 = Integer.parseInt(n2.getText());
              // Integer soma = num2;

              //  JOptionPane.showMessageDialog(null,soma);
                 }
            }
         );
        //  zera o placar
         zerar.addActionListener(new java.awt.event.ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
             PO = 0;
             RO = 1;
             PX = 0;
             atualizar();
  
               }
          }
      );

      // selecilna um nivel de dificuldade
      facil.addActionListener(new java.awt.event.ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
           num1 = 5;
           atualizar();
           randiw();
           j1 = 5;
             }
        }
    );
    medio.addActionListener(new java.awt.event.ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
         num1 = 10;
         atualizar();
         randiw();
         j1 = 10;
           }
      }
  );
  dificil.addActionListener(new java.awt.event.ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
       num1 = 15;
       atualizar();
       randiw();
       j1 = 15;
         }
    }
);
// inicia uma nova rodada
      novo.addActionListener(new java.awt.event.ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            num1 = j1;
            atualizar();
            ini.setText("Iniciar jogo" );

             }
        }

        
    );
    }
    // atualiza p placar
    public void atualizar(){
      px.setText("Erro = " + PX);
      po.setText("Acerto = " + PO);
      ro.setText("Rodada = " + RO);
  }

    public void digite(){
    
      Integer num2 = Integer.parseInt(n2.getText());
      soma = num2;
    }
    // escolhe um numero aleatório de acordo com o nível de dificuldade
    public void randiw(){
      // faz com que não precise de um novo valor aleatório
      if(num1 == num3){
        num3 = num1;
      // níveis de dificuldade
      // facil
      }else if(num1 == faci){
        num3 = random.nextInt(10);
      num1 = num3;
      placar2.setText("Digite um valores entre 0 & 10");
      placa.setText("Fácil");
      placa.setForeground(Color.BLUE);
      ++RO;
      // medio
      }else if(num1 == med){
        num3 = random.nextInt(100);
      num1 = num3;
      placar2.setText("Digite um valores entre 0 & 100");
      placa.setText("Médio");
      placa.setForeground(Color.ORANGE);
      ++RO;
      // dificil
      }else if(num1 == def){
        num3 = random.nextInt(1000);
      num1 = num3;
      placar2.setText("Digite um valores entre 0 & 1000");
      placa.setText("Difícil");
      placa.setForeground(Color.RED);
      ++RO;
      }
      // caso nenhu nível de dificuldade não seja selecionado
      else{
      num3 = random.nextInt(50);
      num1 = num3;
      placar2.setText("Digite um valores entre 0 & 50");
      
      ++RO;
    }}

    public void j1m(){
      
    }
// compara os valores da maquina e do jogador
    public void compara1(){
      // se o palpite for maior do que o da máquina
      if(soma > num1 ){
        ++PX;
        atualizar();
        ini.setForeground(Color.red);
        ini.setText("Palpite muito alto " );
        
        // se o palpite for menor que o da máquina
      }else if(soma < num1 ){
        ++PX;
        atualizar();
        ini.setForeground(Color.BLUE);
        ini.setText("Palpite muito baixo " );
        
        // se o jogador acerta o palpite
      }else{
        ++PO;
        atualizar();
        ini.setForeground(Color.BLACK);
        ini.setText("Jogador 'acertou'");
        num1 = j1;
      }
    }
  // chama a funcao da janela e seus elementos
    public static void main(String[] args) {
        new Adivinhacao();
  
      }
      
    
}
