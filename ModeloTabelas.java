
package aps.modelo;

public class ModeloTabelas {
    private String faunaFlora;
    private String grupo;
    private String familia;
    private String especie;
    private String nomeComum;
    private String categoria;
    private String siglaCategoria;
    private String bioma;
    private String principaisAmeacas;
    private String areaProtegida;
    private String planoAcaoConser;
    private String ordenamentoPesqueiro;
    private String nivelProtecao;
    private String especieExclusivaBr;
    private String estadoOcorrencia;
    
    public ModeloTabelas( ) {
        
    }
        
    public ModeloTabelas(String faunaFlora, String grupo, String familia, String especie, String nomeComum, 
                                                   String categoria,String siglaCategoria, String bioma, String principaisAmeacas, 
                                                   String areaProtegida, String planoAcaoConser, String ordenamentoPesqueiro, 
                                                   String nivelProtecao, String especieExclusivaBr,  String estadoOcorrencia) {
        this.faunaFlora = faunaFlora;
        this.grupo = grupo;
        this.familia = familia;
        this.especie = especie;
        this.nomeComum = nomeComum;
        this.categoria = categoria;
        this.siglaCategoria = siglaCategoria;
        this.bioma = bioma;
        this.principaisAmeacas = principaisAmeacas;
        this.areaProtegida = areaProtegida;
        this.planoAcaoConser = planoAcaoConser;
        this.ordenamentoPesqueiro = ordenamentoPesqueiro;
        this.nivelProtecao = nivelProtecao;
        this.especieExclusivaBr = especieExclusivaBr;
        this.estadoOcorrencia = estadoOcorrencia;
    }
    
    public String getFaunaFlora( ) {
        return this.faunaFlora;
    }
    public void setFaunaFlora(String faunaFlora) {
        this.faunaFlora = faunaFlora;
    }
    
    public String getGrupo( ) {
        return this.grupo;
    }
    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }
    
    public String getFamilia( ) {
        return this.familia;
    }
    public void setFamilia(String familia) {
        this.familia = familia;
    }
    
    public String getEspecie( ) {
        return this.especie;
    }
    public void setEspecie(String especie) {
        this.especie = especie;
    }
        
    public String getNomeComum( ) {
        return this.nomeComum;
    }
    public void setNomeComum(String nomeComum) {
        this.nomeComum = nomeComum;
    }
            
    public String getCategoria( ) {
        return this.categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
                
    public String getSiglaCategoria( ) {
        return this.siglaCategoria;
    }
    public void setSiglaCategoria(String siglaCategoria) {
        this.siglaCategoria = siglaCategoria;
    }
                    
    public String getBioma( ) {
        return this.bioma;
    }
    public void setBioma(String bioma) {
        this.bioma = bioma;
    }
                        
    public String getPrincipaisAmeacas( ) {
        return this.principaisAmeacas;
    }
    public void setPrincipaisAmeacas(String principaisAmeacas) {
        this.principaisAmeacas = principaisAmeacas;
    }
                            
    public String getAreaProtegida( ) {
        return this.areaProtegida;
    }
    public void setAreaProtegida(String areaProtegida) {
        this.areaProtegida = areaProtegida;
    }
                                
    public String getPlanoAcaoConservacao( ) {
        return this.planoAcaoConser;
    }
    public void setPlanoAcaoConservacao(String planoAcaoConser) {
        this.planoAcaoConser = planoAcaoConser;
    }
                                   
    public String getOrdenamentoPesqueiro( ) {
        return this.ordenamentoPesqueiro;
    }
    public void setOrdenamentoPesqueiro(String ordenamentoPesqueiro) {
        this.ordenamentoPesqueiro = ordenamentoPesqueiro;
    }
                                       
    public String getNivelProtecao( ) {
        return this.nivelProtecao;
    }
    public void setNivelProtecao(String nivelProtecao) {
        this.nivelProtecao = nivelProtecao;
    }
                                       
    public String getEspecieExclusivaBrasil( ) {
        return this.especieExclusivaBr;
    }
    public void setEspecieExclusivaBrasil(String especieExclusivaBr) {
        this.especieExclusivaBr = especieExclusivaBr;
    }
                                           
    public String getEstadoOcorrencia( ) {
        return this.especieExclusivaBr;
    }
    public void setEstadoOcorrencia(String estadoOcorrencia) {
        this.estadoOcorrencia = estadoOcorrencia;
    }
    
}
