/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

/**
 *
 * @author RojeruSan
 */
public class Sentencias {
    
    public static String LISTAR = "SELECT * FROM usuarios";
    
    public static String REGISTRAR = "INSERT INTO usuarios("
            + "historiaclinica,"
            + "apellido1,"
            + "apellido2,"
            + "apellido3,"
            + "nombres,"
            + "sexo,"
            + "edadaños,"
            + "edadmeses,"
            + "edaddias,"
            + "conyuge,"
            + "fechanacimiento,"
            + "lugarnacimiento,"
            + "nacionalidad,"
            + "DPI,"
            + "estadocivil,"
            + "grupoetnico,"
            + "religion,"
            + "afiliadoigss,"
            + "numerotelefono,"
            + "escolaridad,"
            + "profesion,"
            + "lugardetrabajo,"
            + "residencia,"
            + "nombrepadre,"
            + "padrevivo,"
            + "nombremadre,"
            + "madreviva,"
            + "encargado,"
            + "direccionencargado,"
            + "claseadmision,"
            + "servicioingreso,"
            + "otraespecialidad,"
            + "fecha,"
            + "hora,"
            + "medico,"
            + "Admitidopor,"
            + "ingresa,"
            + "ingresaa,"
            + "tipodeadmision)" 
            + "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
    
    public static String ACTUALIZAR = "UPDATE usuarios SET "
            + "nombre = ?,"
            + "usuario = ?,"
            + "password = ? "
            + "WHERE id = ?";
    
    public static String ELIMINAR = "DELETE FROM usuarios WHERE id = ?";
    
    public static String ELIMINAR_TODO = "TRUNCATE TABLE usuarios";
    
    private String id;
    private String historiaclinica;
    private String nombres;
    private String apellido1;
    private String apellido2;
    private String apellido3;
    private String nombrepadre;
    private String padrevivo;
    private String nombremadre;
    private String madreviva;
    private String conyuge;
    private String fechanacimiento;
    private String nacionalidad;
    private String lugardenacimiento;
    private String sexo;
    private String edadaños;
    private String edadmeses;
    private String edaddias;
    private String DPI;
    private String estadocivil;
    private String grupoetnico;
    private String religion;
    private String afiliadoaligss;
    private String numerotelefono;
    private String escolaridad;
    private String profesion;
    private String lugardetrabajo;
    private String residencia;
    private String municipio;
    private String departamento;
    private String encargado;
    private String direccionencargado;
    private String clasedeadmision;
    private String serviciodeingreso;
    private String fecha;
    private String hora;
    private String medico;
    private String admitidopor;
    private String tipodeadmision;
    private String ingresa;
    private String ingresaa;
    private String otraespecialidad;

    public String getOtraespecialidad() {
        return otraespecialidad;
    }

    public void setOtraespecialidad(String otraespecialidad) {
        this.otraespecialidad = otraespecialidad;
    }

    public String getIngresa() {
        return ingresa;
    }

    public void setIngresa(String ingresa) {
        this.ingresa = ingresa;
    }

    public String getIngresaa() {
        return ingresaa;
    }

    public void setIngresaa(String ingresaa) {
        this.ingresaa = ingresaa;
    }

    public String getApellido3() {
        return apellido3;
    }

    public void setApellido3(String apellido3) {
        this.apellido3 = apellido3;
    }

    public String getPadrevivo() {
        return padrevivo;
    }

    public void setPadrevivo(String padrevivo) {
        this.padrevivo = padrevivo;
    }

    public String getMadreviva() {
        return madreviva;
    }

    public void setMadreviva(String madreviva) {
        this.madreviva = madreviva;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEdad() {
        return edadaños;
    }

    public void setEdad(String edad) {
        this.edadaños = edad;
    }

    public String getDPI() {
        return DPI;
    }

    public void setDPI(String DPI) {
        this.DPI = DPI;
    }

    public String getEstadocivil() {
        return estadocivil;
    }

    public void setEstadocivil(String estadocivil) {
        this.estadocivil = estadocivil;
    }

    public String getGrupoetnico() {
        return grupoetnico;
    }

    public void setGrupoetnico(String grupoetnico) {
        this.grupoetnico = grupoetnico;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public String getAfiliadoaligss() {
        return afiliadoaligss;
    }

    public void setAfiliadoaligss(String afiliadoaligss) {
        this.afiliadoaligss = afiliadoaligss;
    }

    public String getNumerotelefono() {
        return numerotelefono;
    }

    public void setNumerotelefono(String numerotelefono) {
        this.numerotelefono = numerotelefono;
    }

    public String getEscolaridad() {
        return escolaridad;
    }

    public void setEscolaridad(String escolaridad) {
        this.escolaridad = escolaridad;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public String getLugardetrabajo() {
        return lugardetrabajo;
    }

    public void setLugardetrabajo(String lugardetrabajo) {
        this.lugardetrabajo = lugardetrabajo;
    }

    public String getResidencia() {
        return residencia;
    }

    public void setResidencia(String residencia) {
        this.residencia = residencia;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getEncargado() {
        return encargado;
    }

    public void setEncargado(String encargado) {
        this.encargado = encargado;
    }

    public String getDireccionencargado() {
        return direccionencargado;
    }

    public void setDireccionencargado(String direccionencargado) {
        this.direccionencargado = direccionencargado;
    }

    public String getClasedeadmision() {
        return clasedeadmision;
    }

    public void setClasedeadmision(String clasedeadmision) {
        this.clasedeadmision = clasedeadmision;
    }

    public String getServiciodeingreso() {
        return serviciodeingreso;
    }

    public void setServiciodeingreso(String serviciodeingreso) {
        this.serviciodeingreso = serviciodeingreso;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getMedico() {
        return medico;
    }

    public void setMedico(String medico) {
        this.medico = medico;
    }

    public String getAdmitidopor() {
        return admitidopor;
    }

    public void setAdmitidopor(String admitidopor) {
        this.admitidopor = admitidopor;
    }

    public String getTipodeadmision() {
        return tipodeadmision;
    }

    public void setTipodeadmision(String tipodeadmision) {
        this.tipodeadmision = tipodeadmision;
    }
    
    

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHistoriaclinica() {
        return historiaclinica;
    }

    public void setHistoriaClinica(String historiaclinica) {
        this.historiaclinica = historiaclinica;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }
    
    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }
    
    public String getNombrepadre() {
        return nombrepadre;
    }

    public void setNombrepadre(String nombrepadre) {
        this.nombrepadre = nombrepadre;
    }
    
    public String getNombremadre() {
        return nombremadre;
    }

    public void setNombremadre(String nombremadre) {
        this.nombremadre = nombremadre;
    }
    
    public String getConyuge (){
        return conyuge;
    }
    
    public void setConyuge (String conyuge){
        this.conyuge = conyuge;
    }
    
    public String getFechanacimiento (){
        return fechanacimiento;
    }
    
    public void setFechanacimiento (String fechanacimiento){
        this.fechanacimiento = fechanacimiento;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getLugardenacimiento() {
        return lugardenacimiento;
    }

    public void setLugardenacimiento(String lugardenacimiento) {
        this.lugardenacimiento = lugardenacimiento;
    }
        
    public String getEdadmeses() {
        return edadmeses;
    }

    public void setEdadmeses(String edadmeses) {
        this.edadmeses = edadmeses;
    }

    public String getEdaddias() {
        return edaddias;
    }

    public void setEdaddias(String edaddias) {
        this.edaddias = edaddias;
    }

                
    

            
}
