package edu.kit.kastel.sdq.featuremodel.custom.util;


import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.viewers.IContentProvider;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.model.WorkbenchLabelProvider;

import edu.kit.kastel.sdq.featuremodel.FeatureDiagram;

public class LoadResourceFromWorkspaceDialog extends Dialog {

	protected ListViewer listViewer;

	protected IStructuredSelection structuredSelection;

	protected FeatureDiagram fd;
	
	protected IContentProvider cp;

	public LoadResourceFromWorkspaceDialog(Shell parent, FeatureDiagram fd, IContentProvider cp) {
		super(parent);
		this.fd = fd;
		this.cp = cp;
	}

	@Override
	protected Control createDialogArea(Composite parent) {
		Composite composite = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		composite.setLayout(layout);
		listViewer = new ListViewer(composite);
		listViewer.setContentProvider(cp);
		listViewer.setLabelProvider(WorkbenchLabelProvider.getDecoratingWorkbenchLabelProvider());
		listViewer.setInput(ResourcesPlugin.getWorkspace());
		listViewer.addSelectionChangedListener(new ISelectionChangedListener() {
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				structuredSelection = listViewer.getStructuredSelection();
			}
		});
		return composite;

	}

	public IStructuredSelection getSelection() {
		return structuredSelection;
	}

	

}
