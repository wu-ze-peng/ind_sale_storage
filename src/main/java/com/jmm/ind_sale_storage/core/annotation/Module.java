package com.jmm.ind_sale_storage.core.annotation;

import java.lang.annotation.*;

@Target({ ElementType.METHOD,ElementType.TYPE  })
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Module {
    String value();
}
