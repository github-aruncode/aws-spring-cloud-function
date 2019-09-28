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
package org.ets.studentservice.config;

import org.ets.studentservice.service.LowerCaseService;
import org.ets.studentservice.service.UpperCaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Function;

/**
 * @author Arun Choudhari
 * @version 1.0 Sep 28, 2019
 * @since eReg Release 4.1
 */
@Configuration
public class MyAppFunctionalBeans {

    @Autowired
    UpperCaseService upperCaseService;

    @Autowired
    LowerCaseService lowerCaseService;

    @Bean
    public Function<String,String>upperCase(){
        return input -> upperCaseService.upperCase(input);
    }

    @Bean
    public Function<String,String> lowerCase(){
        return input -> lowerCaseService.lowerCase(input);
    }

}
