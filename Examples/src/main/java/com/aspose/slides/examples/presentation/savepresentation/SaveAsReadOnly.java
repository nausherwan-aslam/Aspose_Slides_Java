/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package com.aspose.slides.examples.presentation.savepresentation;

import com.aspose.slides.*;
import com.aspose.slides.examples.Utils;

public class SaveAsReadOnly
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(SaveAsReadOnly.class);

        //Instantiate a Presentation object that represents a PPT file
        Presentation pres = new Presentation();

        //Get the first slide
        ISlide sld = pres.getSlides().get_Item(0);

        //Add an autoshape of type line
        sld.getShapes().addAutoShape(ShapeType.Line, 50, 150, 300, 0);

       //Setting Write protection Password
        pres.getProtectionManager().setWriteProtection("test");

        //Save your presentation to a file
        pres.save(dataDir+ "demoWriteProtected.pptx",  com.aspose.slides.SaveFormat.Pptx);
        System.out.println("Program executed successfully");

    }
}




