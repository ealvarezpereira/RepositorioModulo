/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quique.repo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.JOptionPane;
import org.kohsuke.github.GHCreateRepositoryBuilder;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionReferences;
import org.openide.awt.ActionRegistration;
import org.openide.util.NbBundle.Messages;
import org.kohsuke.github.GitHub;

//ActionID que a un fichero le asigna un ID de la clase
@ActionID(
        category = "File",
        id = "com.quique.repo.RepositoryActionListener"
)

//ActionRegistration que lo que hace es asignarle un icono al modulo
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

/**
 * @param git es una variable de tipo GitHub para crear el repositorio
 * @param usu es el usuario de GitHub
 * @param ctra es la contraseña de GitHub
 */
public final class RepositoryActionListener implements ActionListener {

    static GitHub github;

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            //Pedimos el usuario y la contraseña para poder conectarnos a github
            String usu = JOptionPane.showInputDialog("Usuario");
            String ctra = JOptionPane.showInputDialog("Contraseña");

            //Nos conectamos a github utilizando el usuario y la contraseña pasandoselos por parametos
            github = GitHub.connectUsingPassword(usu, ctra);
            //Pedimos el nombre del repositorio
            String repoNombre = JOptionPane.showInputDialog("Introduzca el nombre del repositorio");

            //Creamos un objeto GHCreateRepositoryBuilder y le asignamos la creación del repositorio
            GHCreateRepositoryBuilder repo = github.createRepository(repoNombre);
            repo.create();
        } catch (IOException ex) {
            System.out.println("Error repositorio. " + ex);
        }
    }
}
