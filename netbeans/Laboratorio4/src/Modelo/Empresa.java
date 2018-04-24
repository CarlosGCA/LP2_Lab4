package Modelo;
public class Empresa extends Cliente{
	private String ruc;
	private String nombreEmpresa;

	public Empresa(int id_cliente, int telefono, String direccion, String cuenta,
					String ruc, String nombreEmpresa){
		super(id_cliente, telefono, direccion, cuenta);
		setRuc(ruc);
		setNombreEmpresa(nombreEmpresa);
	}

    public Empresa(){
    }

	public String getRuc() {
        return ruc;
    }

    /**
     * @param ruc the ruc to set
     */
    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    /**
     * @return the nombreEmpresa
     */
    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    /**
     * @param nombreEmpresa the nombreEmpresa to set
     */
    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }
}