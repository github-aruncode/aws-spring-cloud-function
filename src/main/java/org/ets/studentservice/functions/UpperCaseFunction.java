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
 * Created on Sep 27, 2019
 */
package org.ets.studentservice.functions;

import org.ets.studentservice.service.UpperCaseService;
import org.springframework.stereotype.Component;

import java.util.function.Function;

/**
 * @author Arun Choudhari
 * @version 1.0 Sep 27, 2019
 * @since eReg Release 4.1
 */

public class UpperCaseFunction implements Function<String,String>{

    private final UpperCaseService upperCaseService;

    public UpperCaseFunction(UpperCaseService upperCaseService){
        this.upperCaseService = upperCaseService;
    }

    @Override
    public String apply(String input) {
        return upperCaseService.upperCase(input);
    }
}
