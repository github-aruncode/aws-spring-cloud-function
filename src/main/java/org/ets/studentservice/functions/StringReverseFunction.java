/*--------------------------------------------------------------------------
 * ©2016 Educational Testing Service. All Rights Reserved.
 *
 * CONFIDENTIAL BUSINESS INFORMATION
 *
 * THIS PROGRAM IS PROPRIETARY INFORMATION OF EDUCATIONAL TESTING SERVICE AND
 * IS NOT TO BE COPIED, REPRODUCED, LENT, OR DISPOSED OF, NOR USED FOR ANY
 * PURPOSE OTHER THAN THAT WHICH IT IS SPECIFICALLY PROVIDED WITHOUT THE WRITTEN
 * PERMISSION OF THE SAID COMPANY
 * --------------------------------------------------------------------------
 * Created on Sep 28, 2019
 */
package org.ets.studentservice.functions;

import org.springframework.stereotype.Component;

import java.util.function.Function;

/**
 * @author Arun Choudhari
 * @version 1.0 Sep 28, 2019
 * @since eReg Release 4.1
 */
public class StringReverseFunction implements Function<String,String> {

    @Override
    public String apply(String s) {
        StringBuilder result = new StringBuilder();

        for(int i=s.length()-1; i>=0; i--){
            result.append(s.charAt(i));
        }
        return result.toString();
    }
}
