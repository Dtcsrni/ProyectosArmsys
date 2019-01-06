/**
 *
 * Automovil
 *
 * @Erick Renato Vega Cerón 
 * @version 1.3 2013/4/11
 *@Armsys Tech
 */
 
 import javax.swing.JOptionPane;
 import java.util.Random; 	
 import javax.swing.JTextArea;
 import javax.swing.JFrame;
 import javax.swing.JScrollPane;
	
	
 class Pantalla {

	static JTextArea texto = new JTextArea();
    static JFrame ventana = new JFrame("Automóvil-Sucesos");
    static JScrollPane scroll = new JScrollPane();
    
    static int F;
    
	
	void Escribir(String mensaje){
	    F++;
		texto.append("\n |"+F+"|"+mensaje);
		scroll.setViewportView(texto); 
			
			
			
			
		ventana.getContentPane().add(scroll); 
	    ventana.setSize(600,250);
		ventana.setVisible(true);
		texto.setCaretPosition( texto.getText().length() ); 
		
	   
	}
		
}	
	
class Bar extends Banco{//////////////////////////////////
Random rand = new Random();
Luces luces1 = new Luces();
Pantalla pant = new Pantalla();



 
 int opcion, opcion1, opcion2, opcion3, suerte, apuesta;
 static int borracho;
 static int valor=0;
 boolean pase;
 String moneda;
	

 	
	void bienvenido(){
		
	 opcion = JOptionPane.showOptionDialog(
   null,
   "Se acerca lentamente un anciano, que gentilmente te pregunta:\n¿Que tranza, vas a tomar algo o te quieres jugar unos varos, ese?", 
   "Bar", 
   JOptionPane.DEFAULT_OPTION,
   JOptionPane.PLAIN_MESSAGE, 
   null,    
   new String[]{"¿Qué tienes pa' remojar la garganta profunda?", "¿Qué esperas que no te encueras? Vamos a apostar", "Nada, solo pasaba a oler el hermoso aroma del alcohol" },  
   null);
   
   switch(opcion){
   	case 0:
   		if(borracho== 1)
  JOptionPane.showMessageDialog(null, "Andas mega ebrio!! No te puedo vender más chupe o me caen los tiras, o igual y me basqueas toda la mesa.");
  
else{
   		opcion1 = JOptionPane.showOptionDialog(
   null,
   "Tengo Tequila (Panalito) de a 2 varos (Valor +5), Vodka \"Oso Negro\" de a 5 (Valor + 25) y Vino \"Concha y Medatoro\" de a 15 (Valor +60)", 
   "Bar-Barra", 
   JOptionPane.DEFAULT_OPTION,
   JOptionPane.PLAIN_MESSAGE, 
   null,    
   new String[]{"Tequilawer", "Oso Negro", "Dame de esa concha\n", "No bebo compa, sorry" },  
   null);
    if(opcion1 == 0){
    	pase = gastar(2);
    		if(pase==true){
    			valor=5;
    	pant.Escribir("------\n-Bebes el menjurje y sientes como te raspa la garganta \nmientras ignoras la mosca que venía en el vaso babeado, \nsi no fuera por que amas el alcohol, \ndudarías de su autenticidad, e incluso de tomarlo-"); 
    	

   	
    		borracho++;
    		
    	}
    
    	    else{
    	 JOptionPane.showMessageDialog(null, "Primero consigue varo y luego pides wey","No te alcanza", JOptionPane.ERROR_MESSAGE);
    	 
    	    }
    }
    if(opcion1 == 1){
    	pase = gastar(5);
    		if(pase==true){
    			valor= 25;
    	pant.Escribir("------\nTe bebes la bebida de la \"Motherland\" como agua, \nel vodka es tu fuerte, aunque sabes que la maldición rusa, \no resaca, como lo conocen los nacos, \nno es muy tierna que digamos con los extranjeros"); 
    		borracho++;
    		
    	}
    
    	    else{
    	 JOptionPane.showMessageDialog(null, "Primero consigue varo y luego pides wey","No te alcanza", JOptionPane.ERROR_MESSAGE);
    	 
    	    }
    }
    if(opcion1 == 2){
    	pase = gastar(15);
    		if(pase==true){
    		
    			valor= 60;
    	pant.Escribir("------\nLe das de besitos a la copa, saboreas cada sorbo, \ny mientras el sabor dulce pasa por tu lengua de forma tan suave, \nrecuerdas a tu ex y lo mal que le ha ido, \ntomas entonces el resto del vino y mentalmente \nsaludas a la madre de esa zorra"); 
    		borracho++;
    		
    	
    		}
    	    else
    	 JOptionPane.showMessageDialog(null, "Primero consigue varo y luego pides wey","No te alcanza", JOptionPane.ERROR_MESSAGE);
    }	    	  	    	
    if(opcion1 == 3){
        	JOptionPane.showMessageDialog(null, "Jaja, igual y pierdes, pero ganarás muchos amigos!!. Bueno, da igual");
        	
    }
    }
   	break;
   	 
   	 case 1:
   	 	opcion2 = JOptionPane.showOptionDialog(
   null,
   "Sobres, a ver, ¿de a como le entras?", 
   "Bar-Apuestas", 
   JOptionPane.DEFAULT_OPTION,
   JOptionPane.PLAIN_MESSAGE, 
   null,    
   new String[]{"Con un varo a ver, ya vez uno que es pobre y codo", "Dale, que sean 5 varales", "ALV, que sean 20 varillas, ya luego si tengo sed aplico la del Bear Grylls"},  
   null);
   	 if(opcion2 == 0){
   	 	pase=gastar(1);
   	 	if(pase==false){
   	 		JOptionPane.showMessageDialog(null,"Ni un varo tienes en la tarjeta morro, ni pex, se cancela el juego, vuelve cuando tengas dinero, o el ass para apostar");
   	 	
   	 	}
   	    else
   	  apuesta = 1;
   	 }
   	 if(opcion2 == 1){
   	 	pase=gastar(5);
   	 	if(pase==false){
   	 		JOptionPane.showMessageDialog(null,"No te alcanza morro, ni pex, se cancela el juego, vuelve cuando tengas dinero, o el ass para apostar");
   	 		
   	 	}
   	    else
   	  apuesta = 5;
   	 }	
   	 if(opcion2 == 2){
   	 	pase=gastar(20);
   	 	if(pase==false){
   	 		JOptionPane.showMessageDialog(null,"No te alcanza morro, ni pex, se cancela el juego, vuelve cuando tengas dinero, o el ass para apostar");
   	 		
   	 	}
   	    else
   	  apuesta = 20;
   	 }
   
 if(apuesta>0){
    opcion3 = JOptionPane.showOptionDialog(
   null,
   "Sobres, cholos y pistolas. ¿Cara o cruz?", 
   "Bar-Apuestas", 
   JOptionPane.DEFAULT_OPTION,
   JOptionPane.PLAIN_MESSAGE, 
   null,    
   new String[]{"Feis", "Crozz"},  
   null);
   	  
   	suerte = rand.nextInt(2);
   	
   	if (suerte==0)
   			moneda="Cara";
   	if (suerte==1)
   			moneda="Cruz";	
   				
   	if(opcion3==suerte){
   		depositar(apuesta*2);
   		JOptionPane.showMessageDialog(null, "Bueno, os llevais los "+(apuesta*2)+" varos, ya que has ganado la apuesta, ha caído "+moneda+". Buena esa, po' perro!"); 
   	     pant.Escribir("\nEl cantinero ha depositado "+(apuesta*2)+" pesos a tu cuenta");
   	     apuesta=0;
   	     
   	
   	}
   	else{
   	 JOptionPane.showMessageDialog(null, "Jaja, he ganado, vengan pa' acá esos "+(apuesta*2)+" varos, tocó "+moneda+", po' perro!"); 	
   	apuesta=0;
   	
   	
   	}	
   	
   		 
 }   	 	
   break;
   
   case 2:
   	
   		
   	break;	
   	}




   }

	}

	
	
 
class Banco{/////////////////////////////



	static private int dinero;
	
	void abrirCuenta(){
		dinero=20;
	}

	int comprobar(){
	return dinero;	
	}
	
	boolean  gastar(int cantidad){
		boolean autorizado;
		if (cantidad>dinero)
		autorizado = false;
		else{
		dinero= dinero-cantidad;
		autorizado = true;
		}
	 return autorizado;	
	}
	void depositar(int cantidad){
		dinero =dinero+cantidad;
	}
	
	void  consultar(){
		int opcion;
		boolean pase;
	opcion=JOptionPane.showConfirmDialog(null, "Consultar tu saldo te cuesta una moneda, ¿deseas consultar tu saldo?", "Consulta de saldo", JOptionPane.YES_NO_OPTION);
	if(opcion==JOptionPane.YES_OPTION){
		pase = gastar(1);
		if(pase == false)
	JOptionPane.showMessageDialog(null, "Tu cuenta bancaria está vacía");
	      else				
	JOptionPane.showMessageDialog(null, "Tu saldo actual es de: "+dinero+" pesos, ya con el coste de consulta descontado.");
	}
	}
}



class Luces{
 Pantalla pant = new Pantalla();
 static	boolean estado;
 static	int energia =100;
	void encender(){
		estado = true;
		pant.Escribir("\n-Se han encendido las luces-");
	}
	void apagar(){
		estado = false;
		pant.Escribir("\n-Se han apagado las luces-");
		
	}
}

class Motor extends Banco{//////////////////////////

Luces luces1 = new Luces();
private Bar bar1 = new Bar();
Random rand = new Random();
Pantalla pant = new Pantalla();

	boolean activo, pase=false;
    static	double combustible;
	int desgaste = 0, opcion, opcion2,revoluciones, suerte;
	boolean transmision = true;
	

	

	void chequeo(){
		int opcion=0;
		JOptionPane.showMessageDialog(null, "El desgaste actual es de: "+desgaste+"%.\nEl nivel de batería es de "+luces1.energia+"%.");
		
		if(desgaste >= 100){
		opcion =JOptionPane.showConfirmDialog(null, "El desgaste actual es de "+desgaste+"%.\t ¿Desea reparar las llantas? Coste: 25 pesos", "¿Reparar?", JOptionPane.YES_NO_OPTION);
	       if(opcion==JOptionPane.YES_OPTION){
	       	 pase = gastar(25);
	       	if(pase==true){
	       desgaste=0;
	       transmision=true;
	       pant.Escribir("\n-Llantas reparadas-");
	       	}
	       	else
	       JOptionPane.showMessageDialog(null, "Tu cuenta no tiene suficiente dinero!!!", "Maldito pobre, fuera de mi negocio!", JOptionPane.ERROR_MESSAGE);		
	         }
		}
	    if(luces1.energia <= 0){
	    opcion2 =JOptionPane.showConfirmDialog(null, "El nivel de carga de la batería es de "+(luces1.energia)+"%.\t ¿Desea recargar la batería? Coste: 35 pesos", "¿Recargar?", JOptionPane.YES_NO_OPTION);	
	      if(opcion2==JOptionPane.YES_OPTION){
	       	 pase = gastar(35);
	       	if(pase==true){
	       luces1.energia=100;
	       pant.Escribir("\n-Batería recargada-");
	       	}
	       	else
	       JOptionPane.showMessageDialog(null, "Tu cuenta no tiene suficiente dinero!!!", "Maldito pobre, fuera de mi negocio!", JOptionPane.ERROR_MESSAGE);		
	         }	
	    }
	    	          	   	
	}
	
	
	void arrancar(){
		
		if(transmision == false)
			JOptionPane.showMessageDialog(null, "Hay un problema con la transmisión!! El auto no puede avanzar hasta que sea reparado!", "Se han detectado fallas", JOptionPane.ERROR_MESSAGE);
		else{			
		pant.Escribir("\n---Arrancando motor---");
		activo=true;
	        }
	}
	
    void apagar(){
	  pant.Escribir("\n--Motor apagado--");
	  activo=false;	
	 } 	
	
	
	void repostar(){
		boolean pase=false;
		int gasolina=0;
		String gas;
		apagar();
		do{
		gas=JOptionPane.showInputDialog(null, "¿Cuantos litros desea repostar? Costo: 1 litro = 10 pesos");
		try{	
		if(gas != null){			
		gasolina = Integer.parseInt(gas);
		if(gasolina == 41621){
			pant.Escribir("\nPurr purrrp, mexican lucky, purrr purrrrp mexican luck.\nComo te gusta Daft Punk, he de regalarte unos varos...");
			depositar(100);
		}
		else{
				if ((combustible+gasolina)>6)
			JOptionPane.showMessageDialog(null, "El tanque de combustible solo tiene capacidad para 6 litros como máximo!!", "Es demasiado!", JOptionPane.ERROR_MESSAGE);
	            else{
	            	pase = gastar((gasolina*10));
	            		if(pase == false)	            	
	            	  JOptionPane.showMessageDialog(null,"No tienes suficiente dinero para tantos litros!!", "Maldito pobre!", JOptionPane.ERROR_MESSAGE);
	            	  else{
	            		
	    	pant.Escribir("\n-Se ha rellenado el tanque con "+gasolina+" litros de combustible. \n  Costo total: "+((gasolina*10))+" pesos.");
	    	combustible=combustible+gasolina;
	            	  }
	            }
		}
		}
		}catch(NumberFormatException e){
			JOptionPane.showMessageDialog(null, "Has ingresado letras, cuando estoy casi seguro que deben de ser números!!!, intentalo de nuevo", "¿Qué rayos haces?", JOptionPane.ERROR_MESSAGE);
		}
		            
		}while((gasolina>6 || pase==false) && gas!=null && gas!="41621");
			              
	}

	
	  void funcionar(){
	  	int repostar=0, apagado=0, robado=0;
	  		  	
	  	if(activo==false)
	  		JOptionPane.showMessageDialog(null, "El motor está apagado!!", "Motor", JOptionPane.ERROR_MESSAGE);
	  	else{
	  	do{
	  	if(combustible >=0.5){
	  		pant.Escribir("Avanzando... (Kilometros recorridos:"+revoluciones+", Combustible restante:"+combustible+" litros)");
	  		
	  		
	  		try {
           Thread.sleep(900);
                 } catch (InterruptedException ex) {
                                                       }
	  		combustible=combustible-0.5;
	  		revoluciones=revoluciones+2;
	  		desgaste = desgaste+5;
	  		if(luces1.estado == true)
	  		luces1.energia = luces1.energia -2;
	  		  if(desgaste==100)
              transmision=false;
              if(luces1.energia==0 && luces1.estado==true){
              luces1.estado=false;
              pant.Escribir("\n-Las luces se han apagado debido a la falta de energía-\n");
              }
              if(luces1.estado!=true)
              {
              suerte = rand.nextInt(6+((bar1.valor*3)/100));
              if(suerte == 0 || suerte == 5){
              	robado = (rand.nextInt(19));
              	 pase =	gastar(robado-(bar1.valor*robado)/100);
              	 if(pase==true)
              	pant.Escribir("\n-Un chaka se acerca aprovechando la falta de luz y te asalta \n\"Horaleh guei, kaileh kon thodoh peh\".\n Ha logrado quitarte "+robado+" pesos.\n");
              	bar1.borracho=0;
              	bar1.valor=0;
              }
              if(bar1.valor>0 && suerte == 2){
              	pant.Escribir("\n-Un chaka se acerca aprovechando la falta de luz e intenta asaltarte,\n debido a que estás ebrio, te armas de valor\n y te enfrentas a el. Cuando el despreciable chaka yace en el suelo, \n revisas con cuidado entre sus bolsillos y encuentras una \n bolsa de holy weed, de la cual fumas un poco y vendes el resto. (Valor +"+(bar1.valor/2 +5)+", Dinero +"+(bar1.valor/2 +2)+"\n");
                bar1.valor=(bar1.valor/2 +5);
              	depositar((bar1.valor/2 +2));
              	bar1.borracho=0;
                }
              } 
	  	}
	  	else{
	  		pant.Escribir("\nNo hay suficiente combustible para avanzar.");
	  		bar1.borracho=0;
	  	     apagar();
	  	     apagado=1;
	  	    }	  
	  	
	  	}while(apagado!=1);
	  	}
	  
	  	
	  }
	  	
     }
     

     
 
 
public class Automovil {//////Clase principal (Principal, i still lovin u)
    
    public static void main(String[] args) {
    	int opcion1, salir=1, error=0, fin=0, ganar=0, perder=0;

    	
    	
Motor motor1 = new Motor();
Luces luces1 = new Luces();
Bar bar1 = new Bar();
Random rand = new Random();
Banco banco1 = new Banco();
Pantalla pant = new Pantalla();

JOptionPane.showMessageDialog(null, "-------------------------------------------------------------------\nSales de tan genial fiesta en donde por fin lograste conseguir un beso de\naquella chica que tanto te gustaba desde que entraste a la universidad\n y subes a tu auto, odias el sol,\npor lo que no puedes estar expuesto a el por mucho tiempo,\nsolo tienes los 20 pesos que te han quedado despues del cover y los billetes en las tangas de tus amigas,\ntodos se han ido de la fiesta ya y\nnecesitas llegar a casa (que está a 100 kilómetros) o llamar a tus padres para\n que vengan por ti, regañandote después por no organizarte bien y\n obligarlos a gastar mucho en pasaje.\n\t-Aquí comienza tu aventura...-\n-------------------------------------------------------------------","Pero qué buena fiesta", JOptionPane.INFORMATION_MESSAGE);

banco1.abrirCuenta();

do{
	

   		
if(banco1.comprobar()<=0 && motor1.combustible == 0){
	perder=1;
}
if(motor1.revoluciones>=100){
	ganar=1;
}


	
if(ganar!=1 && perder!=1)
{	
opcion1 = JOptionPane.showOptionDialog(
   null,
   "\tUsted está dentro del vehículo\n¿Qué desea hacer ahora?:", 
   "Vehiculo (V1.3) - Dtcsrni Technologies", 
   JOptionPane.DEFAULT_OPTION,
   JOptionPane.PLAIN_MESSAGE, 
   null,    
   new String[]{"Arrancar", "Apagar", "Repostar", "Avanzar", "Chequeo", "Encender luces", "Apagar luces", "Cuenta bancaria", "Bar del pueblo", "Terminar aventura" },  
   null);
    


switch(opcion1){
	case 0:
	     motor1.arrancar();
	    break;
	case 1:
		motor1.apagar(); 
	break;
	case 2:
		motor1.repostar();
	break;
	case 3:
		motor1.funcionar();
	break;
	case 4:
		motor1.chequeo();
		break;
	case 5:
		luces1.encender();
		break;
	case 6:
		luces1.apagar();
		break;	
	case 7:
		banco1.consultar();
		break;
	case 8:
	  	bar1.bienvenido();
	  	if(motor1.combustible>0 && motor1.activo == true){
   		motor1.combustible=motor1.combustible-0.5;
   		pant.Escribir("\n-Regresas a tu auto y te das cuenta que lo dejaste encendido, \nel motor se ha gastado 0.5 litros al estar en reposo pero encendido");
   	}
   	if(luces1.estado==true && luces1.energia>0){
   		luces1.energia=luces1.energia-2;
   		pant.Escribir("\n-Regresas a tu auto y te das cuenta que dejaste las luces encendidas, \nla batería se ha gastado 2% al estar las luces encendidas");
   	}
	  	break;
	case 9:
	salir=JOptionPane.showConfirmDialog(null, "¿De verdad desea dejar esta aventura maravillosa y perder automáticamente sin puntuación alguna?", "¿Tan rápido y ya te vas? :'(", JOptionPane.YES_NO_OPTION);
	if(salir==JOptionPane.YES_OPTION)
		salir=0;
	
	 	break;  									
}	
}
if(ganar==1){
	pant.Escribir("\n---Has llegado a tu casa!!---");
JOptionPane.showMessageDialog(null, "Llegas a tu casa y estacionas el auto en la cochera.\nApenas estacionas y apagas tu auto, corres a tu recámara y duermes, tus padres al verte\nse sienten orgullosos de ti, ya que has ido y regresado de una fiesta sin complicaciones.\nHan prometido darte más permisos siempre que lo pidas.\n----Dinero conseguido: "+motor1.comprobar()+" pesos---", "--Has Ganado!!!--", JOptionPane.INFORMATION_MESSAGE);	
salir=0;
}
if(perder==1){
	pant.Escribir("\n-Has perdido!!-");
JOptionPane.showMessageDialog(null, "Enciendes tu auto para disponerte a partir y este tose de forma cascarreante.\nAl revisar el tablero te das cuenta de que ya no tienes gasolina.\nRápidamente sacas tu cartera para poder ir a una gasolinera cercana y comprar más combustible\ny entonces te das cuenta que no tienes dinero ya.\nNo te queda otra opción que llamar a tus padres para que vengan por ti.\nAl llegar a casa después de escuchar muchos regaños por ser desorganizado e irresponsable\n y por la fortuna que les has hecho gastar en pasajes, prometen\n jamás darte permisos de nuevo.", "Has perdido!!", JOptionPane.INFORMATION_MESSAGE);	
salir=0;
}	

}while(salir==1);
pant.ventana.dispose();

    }
}
