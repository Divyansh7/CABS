package javaapplication1;

import javax.swing.UIManager;

public class JavaApplication1 
{
      public static void main(String[] args)
    {
        main obj=new main();
        obj.checkdatabase();
        CreateTable obj1=new CreateTable();
        obj1.checktable();
        try {
            UIManager.setLookAndFeel("com.jtattoo.plaf.aero.HiFiLookAndFeel");
        } 
        catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) 
        {
            java.util.logging.Logger.getLogger(ViewPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
            new ViewPage().setVisible(true);
        }
}
 