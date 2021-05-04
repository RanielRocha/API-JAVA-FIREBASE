package aps;

import static aps.conexao.ConexaoFirebase.initFirebase;
import aps.view.ApsView;

public class Main {

    public static void main(String[ ] args) {
        initFirebase( );

        new ApsView( ).setVisible(true);
    }

}