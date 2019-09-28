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
package org.ets.studentservice.service;

import org.springframework.stereotype.Component;

/**
 * @author Arun Choudhari
 * @version 1.0 Sep 28, 2019
 * @since eReg Release 4.1
 */
@Component
public class LowerCaseService {

    public String lowerCase(String input){
        return input.toLowerCase();
    }
}
