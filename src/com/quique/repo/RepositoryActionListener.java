/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quique.repo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionReferences;
import org.openide.awt.ActionRegistration;
import org.openide.util.NbBundle.Messages;
import org.kohsuke.github.*;

@ActionID(
        category = "File",
        id = "com.quique.repo.RepositoryActionListener"
)
@ActionRegistration(
        iconBase = "com/quique/repo/Upload.png",
        displayName = "#CTL_RepositoryActionListener"
)
@ActionReferences({
    @ActionReference(path = "Menu/File", position = 0)
    ,
  @ActionReference(path = "Toolbars/File", position = 0)
})
@Messages("CTL_RepositoryActionListener=Repository")
public final class RepositoryActionListener implements ActionListener {
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        
    }
}
