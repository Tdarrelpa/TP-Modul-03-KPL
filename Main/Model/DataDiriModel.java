/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import javax.swing.JTextPane; 
import java.util.*;

/**
 *
 * @author timotius Darrel
 */
public class DataDiriModel 
{
    private final List<DataDiri> dataDiriList;
    private final JTextPane textPane;

    public DataDiriModel() 
    {
        dataDiriList = new ArrayList<>();
        textPane = new JTextPane();
        textPane.setEditable(false);
    }

    public void showInputtedName(String name) 
    {
        textPane.setText("Halo " + name);
    }

    public void clearOutput() 
    {
        textPane.setText("");
    }

    public JTextPane getTextPane() 
    {
        return textPane;
    }

    public void setTextPaneText(String text) 
    {
        textPane.setText(text);
    }
}