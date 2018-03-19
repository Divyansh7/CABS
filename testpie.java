/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;


import java.io.File;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author Student
 */
public class testpie extends javax.swing.JFrame{
int totalFolder=0;
  int totalFile=0;

    /**
     * @param args the command line arguments
     */
   // public static void main(String[] args)
    

   testpie()
    {
        String folder1 = "D:\\CDOT BACKUP\\backup\\Kamal Sir";
      String folder2 = "D:\\CDOT BACKUP\\backup\\New Folder";
  try{
//  testpie size=new testpie();
  long folderSizeByte=this.getFileSize(new File(folder1));
  long folderSizeByte1=this.getFileSize(new File(folder2));
  System.out.println("folder Size1: "+folderSizeByte+" Bytes" );
  System.out.println("folder Size2: "+folderSizeByte1+" Bytes" );
  System.out.println("Total Number of Folders: "+this.getTotalFolder());
  System.out.println("Total Number of Files: "+this.getTotalFile());
  DefaultPieDataset pieDataset = new DefaultPieDataset();
        pieDataset.setValue("EMS", folderSizeByte);
        pieDataset.setValue("router", folderSizeByte1);
//        pieDataset.setValue("total space",usableDiskSpaceGB);
//        pieDataset.setValue("usable space", totalDiskSpaceGB);
        JFreeChart chart = ChartFactory.createPieChart("Pie Chart", pieDataset, true, true, true);
         PiePlot P=(PiePlot)chart.getPlot();
      //  P.setForegroundAlpha(TOP_ALIGNMENT);
        ChartFrame frame =new ChartFrame("Pie Chart",chart);
frame.setVisible(true);
frame.setSize(450,500);
  }catch (Exception e)
  {}
  
//  try{
//  Data_usage size=new Data_usage();
//  long folderSizeByte1=size.getFileSize(new File(folder));
//  System.out.println("folder Size: "+folderSizeByte1+" Bytes" );
//  //System.out.println("Total Number of Folders: "+size.getTotalFolder());
//  System.out.println("Total Number of Files: "+size.getTotalFile());
//  }catch (Exception e)
//  {}
}
  public long getFileSize(File folder) {
  totalFolder++; 
  System.out.println("Folder: " + folder.getName());
  long foldersize = 0;

  File[] filelist = folder.listFiles();
  for (int i = 0; i < filelist.length; i++) {
  if (filelist[i].isDirectory()) {
  foldersize += getFileSize(filelist[i]);
  } else {
  totalFile++;
  foldersize += filelist[i].length();
  }
  }
  return foldersize;
  }
  public int getTotalFolder() {
  return totalFolder;
  }
  public int getTotalFile() {
  return totalFile;
    }
    
}