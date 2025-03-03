/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;


import Model.DataDiriModel;
import View.DataDiriView;
import java.awt.Container;
import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener;
/**
 *
 * @author timotius Darrel
 */
public class DataDiriController 
{
    private final DataDiriModel model;
    private final DataDiriView view;

    public DataDiriController(DataDiriModel model, DataDiriView view) 
    {
        this.model = model;
        this.view = view;

        view.getTextPane().setText(model.getTextPane().getText()); // Update JTextPane in view

        view.getBtnKirim().addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                String nama = view.getTextNama().getText();
                model.showInputtedName(nama);
                view.getTextNama().setText("");
                view.getTextPane().setText(model.getTextPane().getText()); // Update JTextPane in view
            }
        });

        view.getBtnClear().addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                model.clearOutput();
                view.getTextPane().setText(""); // Clear JTextPane in view
            }
        });
    }
}