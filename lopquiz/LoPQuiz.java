package lopquiz;

import Vista.Ventana;
import IO.Lector;

/**
 *
 * @author Mario Kazemu Payan, Oscar Shaitan Tigreros
 */
public class LoPQuiz {

    
    private final  String[] preguntasEsport = GetDatos("preguntasEsport.txt");
    private final String[] respuestasEsport = GetDatos("respuestasEsport.txt");    
    private final  String[] preguntasItems= GetDatos("preguntasItems.txt");
    private final String[] respuestasItems= GetDatos("respuestasItems.txt");
    private final  String[] preguntasJuego= GetDatos("preguntasJuego.txt");
    private final String[] respuestasJuego= GetDatos("respuestasJuego.txt");
    private final  String[] preguntasLore= GetDatos("preguntasLore.txt");
    private final String[] respuestasLore= GetDatos("respuestasLore.txt");
    private final  String[] preguntasComunidad= GetDatos("preguntasComunidad.txt");
    private final String[] respuestasComunidad= GetDatos("respuestasComunidad.txt");
       
    public static void main(String[] args) {
        Ventana ventana = new Ventana();
        ventana.setVisible(true);        
    }
    public String[] GetDatos(String archivo){
        Lector lector = new Lector();
        String[] temp = null;
       try{
        temp= lector.leer(archivo);       
       } catch(Exception ex){
           System.out.println(ex);
       }
       return temp;
    }
    
    public int getPreguntasLoreSize(){       
        return preguntasLore.length;
    }
    public int getRespuestasLoreSize(){
        return respuestasLore.length;
    }
     public int getPreguntasEsportSize(){        
        return this.preguntasEsport.length;
    }
    public int getRespuestasEsportSize(){
        return respuestasEsport.length;
    }
     public int getPreguntasItemsSize(){
        return preguntasItems.length;
    }
    public int getRespuestasItemsSize(){
        return respuestasItems.length;
    }
     public int getPreguntasJuegoSize(){         
        return  preguntasJuego.length;
    }
    public int getRespuestasJuegoSize(){
        return respuestasJuego.length;
    }
     public int getPreguntasComunidadSize(){
        return preguntasComunidad.length;
    }
    public int getRespuestasComunidadSize(){
        return respuestasComunidad.length;
    }
    
    public String getPreguntaEsport(int pregunta){        
        return preguntasEsport[pregunta];
    }
    public String getPreguntaItems(int pregunta){
        return preguntasItems[pregunta];
    }
    public String getPreguntaJuego(int pregunta){
        return preguntasJuego[pregunta];
    }
    public String getPreguntaLore(int pregunta){
        return preguntasLore[pregunta];
    }
    public String getPreguntaComunidad(int pregunta){
        return preguntasComunidad[pregunta];
    }
    public String getRespuestaEsport(int pregunta){        
        return respuestasEsport[pregunta];
    }
    public String getRespuestaItems(int pregunta){
        return respuestasItems[pregunta];
    }
    public String getRespuestaJuego(int pregunta){
        return respuestasJuego[pregunta];
    }
    public String getRespuestaLore(int pregunta){
        return respuestasLore[pregunta];
    }
    public String getRespuestaComunidad(int pregunta){
        return respuestasComunidad[pregunta];
    }
}
