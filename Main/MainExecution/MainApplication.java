/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package MainExecution;

import Model.DataDiriModel;
import View.DataDiriView;
import Controller.DataDiriController;
/**
 *
 * @author timotius Darrel
 */
public class MainApplication 
{

    public static void main(String[] args) 
    {
        DataDiriModel model = new DataDiriModel();
        DataDiriView view = new DataDiriView();
        new DataDiriController(model, view);
    }
}
