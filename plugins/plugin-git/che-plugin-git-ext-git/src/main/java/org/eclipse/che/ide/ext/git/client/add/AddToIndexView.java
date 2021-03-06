/*
 * Copyright (c) 2012-2018 Red Hat, Inc.
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *   Red Hat, Inc. - initial API and implementation
 */
package org.eclipse.che.ide.ext.git.client.add;

import org.eclipse.che.ide.api.mvp.View;

/**
 * The view of {@link AddToIndexPresenter}.
 *
 * @author <a href="mailto:aplotnikov@codenvy.com">Andrey Plotnikov</a>
 */
public interface AddToIndexView extends View<AddToIndexView.ActionDelegate> {
  /** Needs for delegate some function into CloneRepository view. */
  interface ActionDelegate {
    /** Performs any actions appropriate in response to the user having pressed the Add button. */
    void onAddClicked();

    /**
     * Performs any actions appropriate in response to the user having pressed the Cancel button.
     */
    void onCancelClicked();
  }

  /**
   * Set content into message field.
   *
   * @param htmlMessage content of the message in html format
   */
  void setMessage(String htmlMessage);

  /**
   * @return <code>true</code> if new file must be added to index, and <code>false</code> otherwise
   */
  boolean isUpdated();

  /**
   * Set state of add new file.
   *
   * @param isUpdated <code>true</code> to add new file to index, <code>false</code> don't do it
   */
  void setUpdated(boolean isUpdated);

  /** Close dialog. */
  void close();

  /** Show dialog. */
  void showDialog();
}
