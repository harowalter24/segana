package segana;
// Generated Mar 13, 2012 4:29:28 PM by Hibernate Tools 3.2.1.GA


import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Usuario generated by hbm2java
 */
@Entity
@Table(name="usuario"
    ,catalog="gana"
)
public class Usuario  implements java.io.Serializable {


     private int idusuario;
     private String nombre;
     private String email;
     private Date fechaNac;
     private String password;
     private String direccion;
     private String tarjeta;
     private Set<Apuesta> apuestas = new HashSet<Apuesta>(0);
     private Set<Rolusuario> rolusuarios = new HashSet<Rolusuario>(0);
     private Set<Tarjeta> tarjetas = new HashSet<Tarjeta>(0);

    public Usuario() {
    }

	
    public Usuario(int idusuario) {
        this.idusuario = idusuario;
    }
    public Usuario(int idusuario, String nombre, String email, Date fechaNac, String password, String direccion, String tarjeta, Set<Apuesta> apuestas, Set<Rolusuario> rolusuarios, Set<Tarjeta> tarjetas) {
       this.idusuario = idusuario;
       this.nombre = nombre;
       this.email = email;
       this.fechaNac = fechaNac;
       this.password = password;
       this.direccion = direccion;
       this.tarjeta = tarjeta;
       this.apuestas = apuestas;
       this.rolusuarios = rolusuarios;
       this.tarjetas = tarjetas;
    }
   
     @Id 
    
    @Column(name="idusuario", unique=true, nullable=false)
    public int getIdusuario() {
        return this.idusuario;
    }
    
    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }
    
    @Column(name="nombre", length=250)
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    @Column(name="email", length=200)
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="fecha_nac", length=10)
    public Date getFechaNac() {
        return this.fechaNac;
    }
    
    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }
    
    @Column(name="password", length=45)
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    @Column(name="direccion", length=150)
    public String getDireccion() {
        return this.direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    @Column(name="tarjeta", length=100)
    public String getTarjeta() {
        return this.tarjeta;
    }
    
    public void setTarjeta(String tarjeta) {
        this.tarjeta = tarjeta;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="usuario")
    public Set<Apuesta> getApuestas() {
        return this.apuestas;
    }
    
    public void setApuestas(Set<Apuesta> apuestas) {
        this.apuestas = apuestas;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="usuario")
    public Set<Rolusuario> getRolusuarios() {
        return this.rolusuarios;
    }
    
    public void setRolusuarios(Set<Rolusuario> rolusuarios) {
        this.rolusuarios = rolusuarios;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="usuario")
    public Set<Tarjeta> getTarjetas() {
        return this.tarjetas;
    }
    
    public void setTarjetas(Set<Tarjeta> tarjetas) {
        this.tarjetas = tarjetas;
    }




}


