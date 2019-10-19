package natural;

/**
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 *        NaturalMystic                                                                      *                                                                                           *
 *    Erick Renato Vega Cerón                                                                *
 * 		Armsys Tech                                                         *
 *                                                                                           *
 *If u listen carefully now u will hear                                                       *
 *I've been through the desert on a horse with no name, it felt good to b out ov d rain...   *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * 
 **/ 
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JTextArea;
import java.awt.Color;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import java.lang.Math;
import javax.swing.JLabel;
import java.io.File;
import javax.sound.sampled.AudioFileFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;


class NaturalMysticFlowing extends JFrame{
static	private JButton botones[]= new JButton[10];
static	private String colores[]={"Blanco", "Azul", "Rojo", "Gris", "Amarillo", "Naranja", "Café", "Verde", "Rosa", "Cyan"};
static	private Color Cafe = new Color(160,82,45);
static	private Color coloresIndex[]={Color.WHITE, Color.BLUE, Color.RED, Color.GRAY, Color.YELLOW, Color.ORANGE, Cafe, Color.GREEN, Color.PINK, Color.CYAN};
static	private int[] orden = new int[50];
static	private int[] ordenEstablecido = new int[50];
static	private GridLayout matrizBotones;
static	private int ordenIndex=0;
static	public int NivelCantidad=3;
static	private Random rand = new Random();
static	public  boolean derrota =false, completo=false, cerrar=false;
static	public volatile int temp=0;
static	public int Puntos=0;

static private Sonidos sonido =new Sonidos();

      public void iniciarHiloSonido(){
      	sonido.start();
      }

	  public void reiniciarPanel(boolean completado){
	   	     if(completado==true&&derrota!=true){
	   	       if(NivelCantidad!=50)	
	   	     	NivelCantidad++;
	   	 for(int a=0; a<10; a++){
	      botones[a].setBackground(Color.BLACK);
	      botones[a].setForeground(Color.LIGHT_GRAY);
	   	                        }
	   	  for(int a=0; a<NivelCantidad; a++){
	      orden[a] =-1;
	   	                         }                                        
	   	         //bandera sagrada 
	   	         temp=1;
	   	         completo=true;
	   	         ordenIndex=0;
	   	         Puntos=Puntos+10;
	   	         //////////sonido.cerrarSonidos();
	   	         
	   	                              
	   	     }
	   	   if(completado==false && derrota!=true){
	   	   	temp=0;
	     	derrota=false;
	     	completo=false;
	   	      ordenIndex=0;
	   	      Puntos=Puntos-5;
	   	  for(int a=0; a<botones.length; a++){
	      botones[a].setBackground(Color.BLACK);
	      botones[a].setForeground(Color.LIGHT_GRAY);
	      ////////////sonido.cerrarSonidos();	
	   	                                    }
	   	                        }    
	       } 
	
	  public NaturalMysticFlowing(){
	     	super("Natural Mystic");
	    
	          matrizBotones = new GridLayout( 2, 5, 3, 3 );	
	          setLayout( matrizBotones );
 	       
	  //Colocando botones junto con la acción de cada uno (activar bandera de presionado)-Inicio declaración de botones
         //Botón Blanco
         botones[0] = new JButton( colores[0] );
         botones[0].addActionListener( new ActionListener(){
			   public void actionPerformed(ActionEvent event) { 
			   	 botones[0].setBackground(Color.WHITE);
			   	 sonido.reproducir(0); 
			   	 orden[ordenIndex]=0;
			   	  if(orden[ordenIndex]!=ordenEstablecido[ordenIndex]){
			   	  	try{Thread.sleep(500);}catch(InterruptedException ex){JOptionPane.showMessageDialog(null, "Error en el sleep", "Error!", JOptionPane.ERROR_MESSAGE);}
			   	      reiniciarPanel(false);
			   	  	                                                 }
			   	  	else{
			   	  if(derrota!=true)				
			   	  ordenIndex++;
			   	  ////////sonido.cerrarSonidos();
			   	  }
			   	                                      
			   	  if(ordenIndex==NivelCantidad){
			   	  	try{Thread.sleep(500);}catch(InterruptedException ex){JOptionPane.showMessageDialog(null, "Error en el sleep", "Error!", JOptionPane.ERROR_MESSAGE);}
			   	  	reiniciarPanel(true);
			   	  	}
		                       	                              }
			                        });
			                        add( botones[0] );         
	     //Botón Azul
         botones[1] = new JButton( colores[1] );
         botones[1].addActionListener( new ActionListener(){
			   public void actionPerformed(ActionEvent event) {
			   	 botones[1].setBackground(Color.BLUE);
			   	 sonido.reproducir(1);  
			   	  orden[ordenIndex]=1;
			   	  if(orden[ordenIndex]!=ordenEstablecido[ordenIndex]){
			   	  	try{Thread.sleep(500);}catch(InterruptedException ex){JOptionPane.showMessageDialog(null, "Error en el sleep", "Error!", JOptionPane.ERROR_MESSAGE);}
			   	      reiniciarPanel(false);}
			   	  	else{
			   	  	if(derrota!=true)
			   	    ordenIndex++;
			   	    ////////sonido.cerrarSonidos();
			   	    }  
			   	  if(ordenIndex==NivelCantidad){
			   	  	try{Thread.sleep(500);}catch(InterruptedException ex){JOptionPane.showMessageDialog(null, "Error en el sleep", "Error!", JOptionPane.ERROR_MESSAGE);}
			   	  	reiniciarPanel(true);
			   	  	}
		                       	                              }
			                        });
			                        add( botones[1] ); 
		//Botón Rojo
         botones[2] = new JButton( colores[2] );
         botones[2].addActionListener( new ActionListener(){
			   public void actionPerformed(ActionEvent event) {
			   	 botones[2].setBackground(Color.RED); 
			   	 	sonido.reproducir(2); 
			   	  orden[ordenIndex]=2;
			   	  if(orden[ordenIndex]!=ordenEstablecido[ordenIndex]){
			   	  	try{Thread.sleep(500);}catch(InterruptedException ex){JOptionPane.showMessageDialog(null, "Error en el sleep", "Error!", JOptionPane.ERROR_MESSAGE);}
			   	      reiniciarPanel(false);}
			   	  	else{
			   	  	if(derrota!=true)
			   	    ordenIndex++;
			   	    ////////sonido.cerrarSonidos();
			   	    } 
			   	  if(ordenIndex==NivelCantidad){
			   	  	try{Thread.sleep(500);}catch(InterruptedException ex){JOptionPane.showMessageDialog(null, "Error en el sleep", "Error!", JOptionPane.ERROR_MESSAGE);}
			   	  	reiniciarPanel(true);
			   	  	}
		                       	                              }
			                        });
			                        add( botones[2] ); 
		 //Botón Gris
         botones[3] = new JButton( colores[3] );
         botones[3].addActionListener( new ActionListener(){
			   public void actionPerformed(ActionEvent event) {
			   	 botones[3].setBackground(Color.GRAY);
			   	 sonido.reproducir(3); 
			   	  orden[ordenIndex]=3;
			   	  if(orden[ordenIndex]!=ordenEstablecido[ordenIndex]){
			   	  	try{Thread.sleep(500);}catch(InterruptedException ex){JOptionPane.showMessageDialog(null, "Error en el sleep", "Error!", JOptionPane.ERROR_MESSAGE);}
			   	      reiniciarPanel(false);}
			   	  	else{
			   	  	if(derrota!=true)
			   	    ordenIndex++;
			   	    ////////sonido.cerrarSonidos();
			   	    } 
			   	  if(ordenIndex==NivelCantidad){
			   	  	try{Thread.sleep(500);}catch(InterruptedException ex){JOptionPane.showMessageDialog(null, "Error en el sleep", "Error!", JOptionPane.ERROR_MESSAGE);}
			   	  	reiniciarPanel(true);
			   	  	}
		                       	                              }
			                        });
			                        add( botones[3] ); 
		 //Botón Amarillo
         botones[4] = new JButton( colores[4] );
         botones[4].addActionListener( new ActionListener(){
			   public void actionPerformed(ActionEvent event) {
			   	 botones[4].setBackground(Color.YELLOW);
			   	 sonido.reproducir(4); 
			   	  orden[ordenIndex]=4;
			   	  if(orden[ordenIndex]!=ordenEstablecido[ordenIndex]){
                    try{Thread.sleep(500);}catch(InterruptedException ex){JOptionPane.showMessageDialog(null, "Error en el sleep", "Error!", JOptionPane.ERROR_MESSAGE);}
			   	      reiniciarPanel(false);}
			   	  	else{
			   	  	if(derrota!=true)
			   	    ordenIndex++;
			   	    ////////sonido.cerrarSonidos();
			   	    }  
			   	  if(ordenIndex==NivelCantidad){
			   	  	try{Thread.sleep(500);}catch(InterruptedException ex){JOptionPane.showMessageDialog(null, "Error en el sleep", "Error!", JOptionPane.ERROR_MESSAGE);}
			   	  	reiniciarPanel(true);
			   	  	}
		                       	                              }
			                        });
			                        add( botones[4] ); 
		 //Botón Naranja
         botones[5] = new JButton( colores[5] );
         botones[5].addActionListener( new ActionListener(){
			   public void actionPerformed(ActionEvent event) {
			   	 botones[5].setBackground(Color.ORANGE);
			   	 sonido.reproducir(5); 
			   	  orden[ordenIndex]=5;
			   	  if(orden[ordenIndex]!=ordenEstablecido[ordenIndex]){
                    try{Thread.sleep(500);}catch(InterruptedException ex){JOptionPane.showMessageDialog(null, "Error en el sleep", "Error!", JOptionPane.ERROR_MESSAGE);}
			   	      reiniciarPanel(false);}
			   	  	else{
			   	  	if(derrota!=true)
			   	    ordenIndex++;
			   	    ////////sonido.cerrarSonidos();
			   	    }  
			   	  if(ordenIndex==NivelCantidad){
			   	  	try{Thread.sleep(500);}catch(InterruptedException ex){JOptionPane.showMessageDialog(null, "Error en el sleep", "Error!", JOptionPane.ERROR_MESSAGE);}
			   	  	reiniciarPanel(true);
			   	  	}
		                       	                              }
			                        });
			                        add( botones[5] ); 
		 //Botón Café
         botones[6] = new JButton( colores[6] );
         botones[6].addActionListener( new ActionListener(){
			   public void actionPerformed(ActionEvent event) {
			   	 botones[6].setBackground(Cafe);
			   	 sonido.reproducir(6); 
			   	  orden[ordenIndex]=6;
			   	  if(orden[ordenIndex]!=ordenEstablecido[ordenIndex]){
			   	  	try{Thread.sleep(500);}catch(InterruptedException ex){JOptionPane.showMessageDialog(null, "Error en el sleep", "Error!", JOptionPane.ERROR_MESSAGE);}
			   	      reiniciarPanel(false);}
			   	  	else{
			   	  	if(derrota!=true)
			   	    ordenIndex++;
			   	    ////////sonido.cerrarSonidos();
			   	    }  
			   	  if(ordenIndex==NivelCantidad){
			   	  	try{Thread.sleep(500);}catch(InterruptedException ex){JOptionPane.showMessageDialog(null, "Error en el sleep", "Error!", JOptionPane.ERROR_MESSAGE);}
			   	  	reiniciarPanel(true);
			   	  	}
		                       	                              }
			                        });
			                        add( botones[6] ); 
			                        	                        	                        	                        	                             	                                                          
	      //Botón Verde
         botones[7] = new JButton( colores[7] );
         botones[7].addActionListener( new ActionListener(){
			   public void actionPerformed(ActionEvent event) {
			   	 botones[7].setBackground(Color.GREEN);
			   	 sonido.reproducir(7); 
			   	  orden[ordenIndex]=7;
			   	  if(orden[ordenIndex]!=ordenEstablecido[ordenIndex]){
			   	  	try{Thread.sleep(500);}catch(InterruptedException ex){JOptionPane.showMessageDialog(null, "Error en el sleep", "Error!", JOptionPane.ERROR_MESSAGE);}
			   	      reiniciarPanel(false);}
			   	  	else{
			   	  	if(derrota!=true)
			   	    ordenIndex++;
			   	    ////////sonido.cerrarSonidos();
			   	    } 
			   	  if(ordenIndex==NivelCantidad){
			   	  	try{Thread.sleep(500);}catch(InterruptedException ex){JOptionPane.showMessageDialog(null, "Error en el sleep", "Error!", JOptionPane.ERROR_MESSAGE);}
			   	  	reiniciarPanel(true);
			   	  	}
		                       	                              }
			                        });
			                        add( botones[7] ); 
		//Botón Rosa
         botones[8] = new JButton( colores[8] );
         botones[8].addActionListener( new ActionListener(){
			   public void actionPerformed(ActionEvent event) {
			   	 botones[8].setBackground(Color.PINK);
			   	 sonido.reproducir(8); 
			   	  orden[ordenIndex]=8;
			   	  if(orden[ordenIndex]!=ordenEstablecido[ordenIndex]){
			   	  	try{Thread.sleep(500);}catch(InterruptedException ex){JOptionPane.showMessageDialog(null, "Error en el sleep", "Error!", JOptionPane.ERROR_MESSAGE);}
			   	      reiniciarPanel(false);}
			   	  	else{
			   	  	if(derrota!=true)
			   	    ordenIndex++;
			   	    ////////sonido.cerrarSonidos();
			   	    }  
			   	  if(ordenIndex==NivelCantidad){
			   	  	try{Thread.sleep(500);}catch(InterruptedException ex){JOptionPane.showMessageDialog(null, "Error en el sleep", "Error!", JOptionPane.ERROR_MESSAGE);}
			   	  	reiniciarPanel(true);
			   	  	}
		                       	                              }
			                        });
			                        add( botones[8] ); 
		//Botón Cyan
         botones[9] = new JButton( colores[9] );
         botones[9].addActionListener( new ActionListener(){
			   public void actionPerformed(ActionEvent event) {
			   	botones[9].setBackground(Color.CYAN);
			   	sonido.reproducir(9); 
			   	  orden[ordenIndex]=9;
			   	  if(orden[ordenIndex]!=ordenEstablecido[ordenIndex]){
			   	  	try{Thread.sleep(500);}catch(InterruptedException ex){JOptionPane.showMessageDialog(null, "Error en el sleep", "Error!", JOptionPane.ERROR_MESSAGE);}
			   	      reiniciarPanel(false);}
			   	  	else{
			   	  	if(derrota!=true)
			   	    ordenIndex++;
			   	    ////////sonido.cerrarSonidos();
			   	    }  
			   	  if(ordenIndex==NivelCantidad){
			   	  	try{Thread.sleep(500);}catch(InterruptedException ex){JOptionPane.showMessageDialog(null, "Error en el sleep", "Error!", JOptionPane.ERROR_MESSAGE);}
			   	  	reiniciarPanel(true);
			   	  	}
		                       	                              }
			                        });
			                        add( botones[9] ); 	                        	                                                          
	      ///Fin de declaración de botones
	      //Define el color de base para todos los botones
	      for(int i=0; i<botones.length; i++){
	      botones[i].setBackground(Color.BLACK);
	      botones[i].setForeground(Color.LIGHT_GRAY);	
	   	                                    }                            
	                                  }
	     
	  public NaturalMysticFlowing(int argumento){
	     }                             
	                                
	  public void generarNivel(){
	  System.out.println("Generando nuevo nivel");
	  for(int i=0; i<botones.length; i++){
	      botones[i].setBackground(Color.BLACK);
	      botones[i].setForeground(Color.LIGHT_GRAY);	
	   	                                    }   
	  	try{Thread.sleep(1500);}catch(InterruptedException ex){JOptionPane.showMessageDialog(null, "Error en el sleep", "Error!", JOptionPane.ERROR_MESSAGE);}
	  	for(int i=0; i<NivelCantidad;i++){
	  	ordenEstablecido[i] = rand.nextInt(10);
	  	System.out.println(ordenEstablecido[i]+1);
	  	}                                              
	                            }
	                            
	  public void presentarColores(){
	     	for(int x=0; x<NivelCantidad;x++){
	  	 botones[ordenEstablecido[x]].setBackground(coloresIndex[ordenEstablecido[x]]);
	  	 sonido.reproducir(ordenEstablecido[x]); 
	  	 try{Thread.sleep(500);}catch(InterruptedException ex){JOptionPane.showMessageDialog(null, "Error en el sleep", "Error!", JOptionPane.ERROR_MESSAGE);}
	  	 botones[ordenEstablecido[x]].setBackground(Color.BLACK);
	  	 ////////sonido.cerrarSonidos();
	  	 try{Thread.sleep(250);}catch(InterruptedException ex){JOptionPane.showMessageDialog(null, "Error en el sleep", "Error!", JOptionPane.ERROR_MESSAGE);}	 	
	  	}
	     }
	     
	  public void continuar(){
	     	do{
	    //nada 		
	     	}while(temp!=1);
	     }
	     
	  public void reiniciarNiveles(){
	     	Puntos=0;
	     	temp=0;
	     	derrota=false;
	     	completo=false;
	     	for(int a=0; a<NivelCantidad; a++){
	      orden[a] =-1;
	   	                         }
	     	NivelCantidad=3;
	     	ordenIndex=0;
	     }
	                            
	                                 		
}

class HiloBotones extends Thread{
	
	NaturalMysticFlowing presentarBotones= new NaturalMysticFlowing();
	HiloPanelTexto Panel=new HiloPanelTexto();
	panelLogros logros = new panelLogros();
	
	
	public void setter(){
	presentarBotones.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
    presentarBotones.setSize( 600, 250 );
    presentarBotones.setVisible( true );
    presentarBotones.setLocation(350, 300);
		
	}
	public void run(){
	presentarBotones.iniciarHiloSonido();	
    Panel.start();
    Panel.recalcular();
    do{	
    presentarBotones.temp=0;	
	presentarBotones.generarNivel();
	presentarBotones.presentarColores();
	Panel.contarTiempo();
	presentarBotones.continuar();
	if(presentarBotones.temp==1&&presentarBotones.completo==true && presentarBotones.derrota!=true){
        	logros.setIconoyTexto(1);
        	logros.visibilidad(true);
            presentarBotones.completo=false;
            Panel.detenerTiempo();
           try{Thread.sleep(2000);}catch(InterruptedException ex){JOptionPane.showMessageDialog(null, "Error en el sleep", "Error!", JOptionPane.ERROR_MESSAGE);}  
            logros.visibilidad(false);
            logros.limpiarFrame();
            Panel.recalcular();
            Panel.reiniciarTiempo();
	}
	Panel.detenerTiempo();
	Panel.reiniciarTiempo();
	Panel.recalcular();
    }while(presentarBotones.cerrar!=true);
    
		
	}
	void visibilidad(boolean visible){
    presentarBotones.setVisible( visible );		
	}
	
} //Hilo Principal

class panelTexto extends JFrame {	
	private volatile int tiempo=setTiempo();
	NaturalMysticFlowing Natural;
	panelLogros logros;
    private JLabel cronometro;
    private JLabel nivel; 
    private JLabel Puntaje;
    public Timer segundero;
	
	
	panelTexto(){
		super( "Tiempo, nivel y puntaje" );
		setLayout(new BorderLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
		setSize(210,200);
		setVisible(true);
	    setLocation(500,100);
    cronometro = new JLabel(" Tiempo restante: "+tiempo+" segundos", JLabel.CENTER); 
    nivel = new JLabel(" Nivel: "+(Natural.NivelCantidad-2), JLabel.CENTER); 
    Puntaje = new JLabel("Puntaje: "+Natural.Puntos, JLabel.CENTER);
    Natural = new NaturalMysticFlowing(1);
    logros= new panelLogros();
    cronometro.setForeground(Color.BLUE);
    
    	add(nivel,BorderLayout.NORTH);
		add(Puntaje, BorderLayout.CENTER);
		add(cronometro, BorderLayout.SOUTH);
		
	}
	
	public void setter(){
		tiempo=setTiempo();
	segundero = new Timer (1000, new ActionListener () 
{ 
    public void actionPerformed(ActionEvent e) 
    { 	
        tiempo=tiempo-1;
        cronometro.setForeground(Color.RED);
        cronometro.setText(" Tiempo Restante: "+tiempo+" segundos");
        nivel.setText(" Nivel: "+(Natural.NivelCantidad-2));
        Puntaje.setText(" Puntaje: "+ Natural.Puntos);
        /*if(Natural.temp==1 && Natural.completo==true){
        	Natural.completo=false;
        	logros.setIconoyTexto(1);
        	logros.visibilidad(true);
            segundero.stop();
        } */
        if(tiempo==0){
        	Natural.derrota=true;
        	logros.setIconoyTexto(0);
        	logros.visibilidad(true);
        segundero.stop();
        tiempo=setTiempo();	
        }		
     } 
});
	               }
	 private int setTiempo(){
	  int time;
	  float	timeF;
	 	timeF=(Natural.NivelCantidad/2);
	 	timeF=Math.nextUp(timeF);
	 	time=Math.round(timeF);
	 return time+3;		 	
	 }
	 public void esperar(){
	 	do{
	 	}while(tiempo!=0);
	 } 
	 
	 public void refrescarCifras(){
		 Icon technologies = new ImageIcon( getClass().getResource( "techno.gif" ) );
		  JLabel imagen;
		 imagen=new JLabel();
		 imagen.setIcon(technologies);
			add(imagen);
			
		
	 	cronometro.setText(" Tiempo Restante: "+tiempo+" segundos");
        nivel.setText(" Nivel: "+(Natural.NivelCantidad-2));
        Puntaje.setText(" Puntaje: "+ Natural.Puntos);
       
		
        cronometro.setForeground(Color.BLUE);
        logros.limpiarFrame();
	 }	           	
}//La clase de la ventana con texto que controla el timer

class panelLogros extends JFrame{ //El panel que será visible solo al terminar cada ciclo mostrando la victoria (:D) o el fracaso (D:)
	Icon victory = new ImageIcon( getClass().getResource( "correcto.gif" ) );
    Icon fracas = new ImageIcon( getClass().getResource( "incorrecto.gif" ) );
    NaturalMysticFlowing natural = new NaturalMysticFlowing(1);
    private JButton BotonReintentar = new JButton("Jugar de Nuevo");
    private JLabel victoria, fracaso, imagen;
	
	panelLogros(){
		super( "Resultado" );
		setLayout( new FlowLayout() );
		victoria = new JLabel("Has logrado superar el nivel! "); 
		fracaso= new JLabel("Has sido derrotado!");
		imagen=new JLabel();
		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        setSize( 200, 150 );
        setVisible( false );
        setLocation(500, 550);
        BotonReintentar.addActionListener(
			new ActionListener(){
			 public void actionPerformed(ActionEvent event){
			 	
	  		   natural.temp=1;
	  		   try{Thread.sleep(500);}catch(InterruptedException ex){JOptionPane.showMessageDialog(null, "Error en el sleep", "Error!", JOptionPane.ERROR_MESSAGE);}
	  		   natural.reiniciarNiveles();
	  		   
	  		   //natural.completo=false;
	  		   visibilidad(false);
			  		}
		                       	                     }
			
			                            );	
			             }
	               
	panelLogros(int nada){
		}	  
			           
	 public void  setIconoyTexto(int resultado){
			if(resultado==0){
			imagen.setIcon(fracas);
			add(imagen);
			add(fracaso);
			natural.derrota=true;
			//natural.completo=false;
			try{Thread.sleep(1200);}catch(InterruptedException ex){JOptionPane.showMessageDialog(null, "Error en el sleep", "Error!", JOptionPane.ERROR_MESSAGE);}
			add(BotonReintentar);	
			}
			if(resultado==1){
				natural.completo=false;
				natural.derrota=false;
			imagen.setIcon(victory);
			add(imagen);
			add(victoria);
			}
		}
		
	 public void limpiarFrame(){
	 	getContentPane().removeAll();
	 }
	 public void visibilidad(boolean visible){
	 	setVisible(visible);
	 } 
		              
	}

class HiloPanelTexto extends Thread{
 panelTexto panel = new panelTexto();
 	
 	public void run(){		
		panel.setter();		
	}
	public void contarTiempo(){
		panel.segundero.start();
	}
	public void detenerTiempo(){
		panel.segundero.stop();
		
	}
	public void reiniciarTiempo(){
		panel.setter();
	}
	public void recalcular(){
		panel.refrescarCifras();
	}
 	
 }//El hilo que controla el timer y la ventana de texto de este
 
class Sonidos extends Thread{
private Clip sonido0, sonido1, sonido2, sonido3, sonido4, sonido5, sonido6, sonido7, sonido8, sonido9;
private File sound0 = new File("tono0.wav"); 
private File sound1 = new File("tono1.wav"); 
private File sound2 = new File("tono2.wav"); 
private File sound3 = new File("tono3.wav");
private File sound4 = new File("tono4.wav"); 
private File sound5 = new File("tono5.wav"); 
private File sound6 = new File("tono6.wav");
private File sound7 = new File("tono7.wav");
private File sound8 = new File("tono8.wav");
private File sound9 = new File("tono9.wav");
		



 public void run(){
 	try {
sonido0 = AudioSystem.getClip();
sonido1 = AudioSystem.getClip();
sonido2 = AudioSystem.getClip();
sonido3 = AudioSystem.getClip();
sonido4 = AudioSystem.getClip();
sonido5 = AudioSystem.getClip();
sonido6 = AudioSystem.getClip();
sonido7 = AudioSystem.getClip();
sonido8 = AudioSystem.getClip();
sonido9 = AudioSystem.getClip();

System.out.println("Cargados todos clips");
 	
 	sonido0.open(AudioSystem.getAudioInputStream(sound0));
 	sonido1.open(AudioSystem.getAudioInputStream(sound1));
 	sonido2.open(AudioSystem.getAudioInputStream(sound2));
 	sonido3.open(AudioSystem.getAudioInputStream(sound3));
 	sonido4.open(AudioSystem.getAudioInputStream(sound4));
 	sonido5.open(AudioSystem.getAudioInputStream(sound5));
 	sonido6.open(AudioSystem.getAudioInputStream(sound6));
 	sonido7.open(AudioSystem.getAudioInputStream(sound7));
 	sonido8.open(AudioSystem.getAudioInputStream(sound8));
 	sonido9.open(AudioSystem.getAudioInputStream(sound9));
System.out.println("Cargados todos sonidos");
 	
 	}catch(Exception e){System.out.println("Error al Cargar:" +e);}
 }
 
 void reproducir(int tono){
 	 if (sonido0.isRunning())
            sonido0.stop();
     if (sonido1.isRunning())
            sonido1.stop();
     if (sonido2.isRunning())
            sonido2.stop();       
     if (sonido3.isRunning())
            sonido3.stop();
     if (sonido4.isRunning())
            sonido4.stop();
     if (sonido5.isRunning())
            sonido5.stop();
     if (sonido6.isRunning())
            sonido6.stop();
     if (sonido7.isRunning())
            sonido7.stop();
     if (sonido8.isRunning())
            sonido8.stop();
     if (sonido9.isRunning())
            sonido9.stop();
     sonido0.setFramePosition(0);
     sonido1.setFramePosition(0);
     sonido2.setFramePosition(0);
     sonido3.setFramePosition(0);
     sonido4.setFramePosition(0);
     sonido5.setFramePosition(0);
     sonido6.setFramePosition(0);
     sonido7.setFramePosition(0);
     sonido8.setFramePosition(0);
     sonido9.setFramePosition(0);
             
            	        
 	if(tono==0)
 	sonido0.start();
 	if(tono==1)
 	sonido1.start();
 	if(tono==2)
 	sonido2.start();
 	if(tono==3)
 	sonido3.start();
 	if(tono==4)
 	sonido4.start();
 	if(tono==5)
 	sonido5.start();
 	if(tono==6)
 	sonido6.start();
 	if(tono==7)
 	sonido7.start();
 	if(tono==8)
 	sonido8.start();
 	if(tono==9)
 	sonido9.start();
 }
 void cerrarSonidos(){
 	sonido0.close();
 	sonido1.close();
 	sonido2.close();
 	sonido3.close();
 	sonido4.close();
 	sonido5.close();
 	sonido6.close();
 	sonido7.close();
 	sonido8.close();
 	sonido9.close();
 }
 		
} 

class Presentacion extends JFrame{
Icon technologies = new ImageIcon( getClass().getResource( "techno.gif" ) );
private JLabel imagen;
private JLabel texto;
	
	Presentacion(){
		super( "Ing. en Sistemas Presenta:" );
		setLayout( new FlowLayout() );
	    texto = new JLabel("Grupo 17 de |Ing. en Sistemas| Presenta: Natural Mystic");
	    imagen=new JLabel();
        setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        setSize( 500, 180 );
        setVisible( true );
        setLocation(500,300);	
	}
	
	void iniciarPresentacion(){
		    imagen.setIcon(technologies);
			add(imagen);
			add(texto);	
	}
	
}

public class NaturalMystic { //Clase principal (Principal, i'll always luv u)
    
    public static void main(String[] args) {
    Presentacion presentar = new Presentacion();
    presentar.iniciarPresentacion();
    try{Thread.sleep(5000);}catch(InterruptedException ex){JOptionPane.showMessageDialog(null, "Error en el sleep", "Error!", JOptionPane.ERROR_MESSAGE);}
    presentar.setVisible(false);	
    HiloBotones botonp = new HiloBotones();
    botonp.setter();
    botonp.start();
    
    
}
}
