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
public class AbstractFactoryApp {
    public static void main(String[] args) {
        Document aDocument = Document.getDocument();
        aDocument.setStyle(new SmallStyle());
        aDocument.displayDocument("Abstract factory",
                "By: Dr. Abdelkareem Alashqar");
        aDocument.setStyle(new LargeStyle());
         aDocument.displayDocument("Abstract factory",
                "By: Dr. Abdelkareem Alashqar");
        
        
    }
    
}
