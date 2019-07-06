
package com.example.xioamademo.annotion;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class HelloworldSelector  implements ImportSelector{
    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        return new String[]{HelloWorldConfigration.class.getName()};
    }
}

