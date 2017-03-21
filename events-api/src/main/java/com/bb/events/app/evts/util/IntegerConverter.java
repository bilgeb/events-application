package com.bb.events.app.evts.util;

import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.basic.AbstractSingleValueConverter;

/**
 * Created by bilge on 21/03/17.
 */
public class IntegerConverter extends AbstractSingleValueConverter {

        public boolean canConvert(Class type) {
            return type.equals(int.class) || type.equals(Integer.class);
        }

        public Object fromString(String str) {
            if (str == null || str.trim().length() == 0) {
                str = "0";
            }
            return Integer.decode(str);
        }

}
