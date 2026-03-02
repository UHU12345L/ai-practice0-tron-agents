package P0;
import java.util.*;

import P0.Entorno;

public class Tron {
// --- MAPAS DE PRUEBA ---
    
    // Mapa trampa: La casilla (1,1) al Este lleva a un callejón sin salida
    static final String MAPA_CALLEJON =
            "#########\n" +
            "#A      #\n" + 
            "# ##### #\n" + 
            "# #   # #\n" + 
            "#     S #\n" +
            "#########";

    static final String MAPA_GRANDE =
            "####################\n" +
            "#A  #              #\n" +
            "# # # ###### ##### #\n" +
            "# #   #      #     #\n" +
            "# ##### ###### ### #\n" +
            "#     #        #   #\n" +
            "# ### ######## # # #\n" +
            "#   #          #   #\n" +
            "# ############## S #\n" +
            "####################";

    public static void main(String[] args) throws InterruptedException {

        // 1. SELECCIONAR MAPA
        // String mapaActual = MAPA_CALLEJON;
        String mapaActual = MAPA_GRANDE;

        Entorno juego = new Entorno(mapaActual);
        
        // 2. SELECCIONAR AGENTE (Descomenta el que quieras usar)
        
        
        AgenteInteractivo agente = new AgenteInteractivo(); 
         System.out.println(agente);
         
        System.out.println("--- Inicio de la Simulación ---");
        boolean juegoActivo = true;
        int ciclos = 0;

        while (juegoActivo && ciclos < 300) {
            System.out.println("\n\n--- Ciclo " + ciclos + " ---");
            juego.dibujar();

            // El agente piensa
            String accion = agente.pensar(juego);
            
            if (accion == null) {
                System.out.println("Agente decide no moverse (o entrada inválida).");
                continue; 
            }

            System.out.println("Agente decide: " + accion);
            
            // Mover
            boolean exito = juego.moverAgente(accion);

            // Verificar estado
            if (!exito) {
                
                    System.out.println(">>> ¡CRASH! El agente se ha estrellado.");
                    juegoActivo = false;
               
            } else if (juego.hemosGanado()) {
                System.out.println(">>> ¡VICTORIA! Meta alcanzada.");
                juego.dibujar();
                juegoActivo = false;
            }

            // Pausa 
            
             Thread.sleep(300); 
           
            ciclos++;
        }
    }
}
