package IO;

/**
 *
 * @author Mario Kazemu Payan, Oscar Shaitan Tigreros
 */
import java.io.*;
public class Lector{
    
    String[] arregloResultante;
    FileInputStream fichero;
    
    public Lector(){
        arregloResultante = null;
        fichero = null;
    }
    
	public String[] leer(String ficheroString) throws FileNotFoundException {
		fichero = new FileInputStream(ficheroString);
		InputStreamReader ss = null;
                BufferedReader s = null; 
		try {			
			ss = new InputStreamReader(fichero, "ISO-8859-1");
                        s = new BufferedReader(ss);
                        
                        int numeroLineas = Integer.parseInt(s.readLine());
                        arregloResultante = new String[numeroLineas];

			for(int i=0;i<numeroLineas;i++){
                            String linea = s.readLine();
                            arregloResultante[i] = linea;                            
			}

		}catch (IOException | NumberFormatException ex) {
			System.out.println("Mensaje: " + ex.getMessage());
		} finally {
			try {
				if (ss != null){
					ss.close();
                                        s.close();
                                        fichero.close();
                                }
			} catch (Exception ex2) {
				System.out.println("Mensaje 2: " + ex2.getMessage());
			}
		}
            return arregloResultante;
	}
}
