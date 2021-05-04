
package aps.view;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import aps.modelo.ModeloTabelas;

public class ApsTabelasModelo extends AbstractTableModel{

    private ArrayList<ModeloTabelas> linhas;
    String[ ] colunas;

    public ApsTabelasModelo(ArrayList<ModeloTabelas> arrayLinhas, String[ ] colunas) {
        this.colunas = colunas;
        linhas = arrayLinhas;
    }

//    @Override
    public int getColumnCount() {
        return colunas.length;
    }

//    @Override
    public int getRowCount() {
        return linhas.size();
    }

    //Retorna o nome da coluna, recebendo seu índice
//    @Override
    public String getColumnName(int indiceColuna) {
        return colunas[indiceColuna];
    }

    @Override
    public Object getValueAt(int row, int col) {
        ModeloTabelas dado = (ModeloTabelas) linhas.get(row);
        switch (col) {
            case 0:
                return dado.getFaunaFlora( );
            case 1:
                return dado.getGrupo( );
            case 2:
                return dado.getFamilia( );             
            case 3:
                return dado.getEspecie( );             
            case 4:
                return dado.getNomeComum( );             
            case 5:
                return dado.getCategoria( );             
            case 6:
                return dado.getSiglaCategoria( );             
            case 7:
                return dado.getBioma( );             
            case 8:
                return dado.getPrincipaisAmeacas( );             
            case 9:
                return dado.getAreaProtegida( );             
            case 10:
                return dado.getPlanoAcaoConservacao( );             
            case 11:
                return dado.getOrdenamentoPesqueiro( );             
            case 12:
                return dado.getNivelProtecao( );             
            case 13:
                return dado.getEspecieExclusivaBrasil( );             
            case 14:
                return dado.getEstadoOcorrencia( );             
            default:
                return null;
        }
    }

    //Adicionamos várias linhas na tabela de uma vez, recebendo um List de UsuarioModel
    public void addLista(ArrayList<ModeloTabelas> dado) {
        int tamanhoAntigo = getRowCount();

        //Adiciona os usuários
        linhas.addAll(dado);

        //Aqui reportamos a mudança para o JTable, assim ele pode se redesenhar, para visualizarmos a alteração
        fireTableRowsInserted(tamanhoAntigo, getRowCount() - 1);
    }
}

