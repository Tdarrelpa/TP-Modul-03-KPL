/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author timotius Darrel
 */
public class DataDiri 
{
    private String nama;
    
    public DataDiri(String nama, String jenisKelamin) 
    { 
        this.nama = nama;
    }
    
    public String getNama() 
    { 
        return nama;
    }
    
    @Override
    protected void finalize()
    {
        nama = null;
    }
}