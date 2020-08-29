package com.ddzb.coppermall.portal.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ObjectNotNullClass implements ConstraintValidator<ObjectNotNull, Object> {

    private  String[] values;

    @Override
    public void initialize(ObjectNotNull objectNotNull) {
        this.values = objectNotNull.value();
    }

    @Override
    public boolean isValid(Object value, ConstraintValidatorContext context) {
        boolean isValid = true;
        if(value==null){
            //当状态为空时使用默认值
            return false;
        }
        return isValid;
    }
}
