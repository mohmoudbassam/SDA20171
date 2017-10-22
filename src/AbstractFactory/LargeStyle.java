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
public class LargeStyle implements Style{

    @Override
    public Title getTitle() {
        return new LargeTitle();
    }

    @Override
    public Content getContent() {
        return new LargeContent();
    }
}
