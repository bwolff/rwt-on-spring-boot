// Copyright (c) 2022 Benjamin Wolff <kontakt@wolff.software>. All rights reserved.
package de.wolff.rwtonspringboot;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.rap.rwt.RWT;
import org.eclipse.rap.rwt.application.AbstractEntryPoint;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;


// Example RWT EntryPoint that is associated with the RWT application in config.RwtApplicationConfiguration.
public class HelloRwtOnSpringBootEntryPoint extends AbstractEntryPoint {

    @Override
    protected void createContents(Composite parent) {
        var label = new Label(parent, SWT.NONE);
        label.setText("I'm an RWT standalone app running on Spring Boot. Pretty neat!");

        var customStylelabel = new Label(parent, SWT.NONE);
        customStylelabel.setData(RWT.CUSTOM_VARIANT, "custom");
        customStylelabel.setText("RWT theming can easily be used as well.");

        var text = new Text(parent, SWT.BORDER);
        text.setText("Type me");

        var button = new Button(parent, SWT.PUSH);
        button.setText("Push me");
        button.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                MessageDialog.openInformation(getShell(), "I'm a JFace dialog", "JFace can be used as well.");
            }
        });
    }
}
