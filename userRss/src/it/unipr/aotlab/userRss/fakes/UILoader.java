/*
 * Copyright (c)  2011  Enrico Franchi and University of Parma.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package it.unipr.aotlab.userRss.fakes;

import it.unipr.aotlab.userRss.view.View;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

/**
 * User: enrico
 * Package: it.unipr.aotlab.userRss.fakes
 * Date: 10/24/11
 * Time: 10:54 AM
 */
public class UILoader {
    public static void main(String [] args) {
       /* Relative links: use the HTML base tag */
       Display display = new Display();
       Shell shell = new Shell(display);
       shell.setLayout(new FillLayout());

       View.createView(shell);

       shell.open();
       while (!shell.isDisposed()) {
           if (!display.readAndDispatch())
               display.sleep();
       }
       display.dispose();
   }
}
