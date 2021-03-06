
package aps.conexao;
        
import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ConexaoFirebase {
 
    public static void initFirebase() {
        String databaseURL = "https://aps2021-1e737-default-rtdb.firebaseio.com/";

        FileInputStream refreshToken = null;
        try {
            refreshToken = new FileInputStream("credenciais.json");
            FirebaseOptions options;
            options = new FirebaseOptions.Builder()
                    .setCredentials(GoogleCredentials.fromStream(refreshToken))
                    .setDatabaseUrl(databaseURL)
                    .build( );
            
            FirebaseApp.initializeApp(options);
            
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Erro de leitura da configuração do Firebase! \n" + ex.getMessage());
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Erro de leitura da configuração do Firebase! \n" + ex.getMessage());
        } finally {
            try {
                refreshToken.close();
            } catch (IOException ex) {
                Logger.getLogger(ConexaoFirebase.class.getName( )).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    
    public static String generateUUID(){
        return UUID.randomUUID().toString();
    }
}