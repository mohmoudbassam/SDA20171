/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory;

/**
 *
 * @author aashgar
 */
public class Document {
    private Style aStyle;
    private Title aTitle;
    private Content aContent;
    private static Document aDocument;
   private Document(){}
   public static Document getDocument(){
       if(aDocument == null)
           aDocument = new Document();
       return aDocument;
   }
   public void setStyle(Style aStyle){
       this.aStyle = aStyle;
   }
  
   public void displayDocument(String title, String content){
       this.aTitle = this.aStyle.getTitle();
       this.aContent = this.aStyle.getContent();
       System.out.println("Processing Document ....");
       this.aTitle.view(title);
       this.aContent.view(content);
       
   }
    
}
