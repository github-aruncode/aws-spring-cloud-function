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
package org.ets.studentservice.service;

import org.springframework.stereotype.Service;

/**
 * @author Arun Choudhari
 * @version 1.0 Sep 27, 2019
 * @since eReg Release 4.1
 */
@Service
public class UpperCaseService {


    public String upperCase(String input){

        return input.toUpperCase();
    }
}
