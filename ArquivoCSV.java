
package aps;

import aps.modelo.ModeloTabelas;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.google.gson.Gson;


public class ArquivoCSV extends aps.modelo.ModeloTabelas {
    //       public void ConverteCSV( ) {
       public static void main(String[ ] args) {
           
//           String csvArquivo = "http://dados.mma.gov.br/dataset/41a79b71-445f-4a6a-8c70-d46af991292a/resource/1f13b062-f3f6-4198-a4c5-3581548bebec/download/lista-de-especies-ameacas-2020.csv\n";
           String csvArquivo = "C:\\Users\\ranie\\Documents\\lista-de-especies-ameacas-2020-separador.csv";
//          String csvArquivo = "C:\\Users\\ranie\\Desktop\\testesAPS.csv";


           BufferedReader conteudoCSV = null;
           
           String linha = " ";
           
           String csvSeparador = ";";
                      
           try {
               conteudoCSV = new BufferedReader(new FileReader(csvArquivo));
                              
               while ((linha = conteudoCSV.readLine( )) != null) {
                   
                   String [ ] x = linha.split(csvSeparador);
                   
                   ModeloTabelas teste = new ModeloTabelas( );
                   
                   teste.setFaunaFlora(x[0]);
                   teste.setGrupo(x[1]);
                   teste.setFamilia(x[2]);
                   teste.setEspecie(x[3]);
                   teste.setNomeComum(x[4]);
                   teste.setCategoria(x[5]);
                   teste.setSiglaCategoria(x[6]);
                   teste.setBioma(x[7]);
                   teste.setPrincipaisAmeacas(x[8]);
                   teste.setAreaProtegida(x[9]);
                   teste.setPlanoAcaoConservacao(x[10]);
                   teste.setOrdenamentoPesqueiro(x[11]);
                   teste.setNivelProtecao(x[12]);
                   teste.setEspecieExclusivaBrasil(x[13]);
                   teste.setEstadoOcorrencia(x[14]);
                   
                   
                    Gson gson = new Gson(); // conversor
                    String arquivoJson = gson.toJson(teste);

                    // exibindo o JSON
                    System.out.println(arquivoJson + "\n");
               }
           } catch (FileNotFoundException e) {
               System.out.println("Arquivo não encontrado: \n" + e.getMessage( ));
           } catch (ArrayIndexOutOfBoundsException e) {
               System.out.println(" IndexOutOfBounds: \n" + e.getMessage( ));
           } catch (IOException e) {
               System.out.println(" IO Erro: \n" + e.getMessage( ));
           } finally {
               if(conteudoCSV != null) {
                   try {
                       conteudoCSV.close( );
                   } catch(IOException e) {
                       System.out.println(" IO Erro: \n" + e.getMessage( ));
                   }
               }
               
           }
           
           
       }

    
}
  


// http://dados.mma.gov.br/dataset/41a79b71-445f-4a6a-8c70-d46af991292a/resource/1f13b062-f3f6-4198-a4c5-3581548bebec/download/lista-de-especies-ameacas-2020.csv


// C:\\Users\\ranie\\Documents\\lista-de-especies-ameacas-2020-separador.csv